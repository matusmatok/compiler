import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
import java.lang.StringBuilder;
import java.lang.Math;

public class CompileVisitor extends GrammarBaseVisitor<ReturnContent> {
	
	HashMap<String,Integer> generalNamespace;
	HashMap<String,ProcRecord> procedures = new HashMap<>();
	StringBuilder errors = new StringBuilder();
	
	ArrayList<Scope> scopes = new ArrayList<>();
	
	Scope mainScope = new Scope("main");
	Scope currentScope;
	boolean mainReturned = false;
	private int tempvars = 0;
	private int blocks = 0;
	
	public String getVarName(){
		while (true){
			tempvars++;
			String retval = "var"+Integer.toString(tempvars);
			if (!generalNamespace.containsKey(retval)) {
				generalNamespace.put(retval, 1);
				return retval;
			
			}
		}
	}
	
	public String getBlockName(){
		while (true){
			blocks++;
			String retval = "block"+Integer.toString(blocks);
			if (!generalNamespace.containsKey(retval)){
				generalNamespace.put(retval, 1);
				return retval;
			}
		}
		
	}
	
	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	private static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> arrayList){
  
        LinkedHashMap<String, Integer> linkedHashMap
                                  = new LinkedHashMap<>();
  
        for (String str : arrayList) {
  
            linkedHashMap.put(str, str.length());
        }
  
        return linkedHashMap;
    }
	
	private class Scope{
		public StringBuilder code = new StringBuilder();
		String name;
		HashMap<String, String> initialisedVars = new HashMap<>();
		BlockStack blockStack;
		
		private class BlockStack{
			ArrayList<HashMap<String, String>> stack = new ArrayList<>();
			HashMap<String,String> usedVarNames;
			
			public BlockStack(HashMap<String,String> varNames){
				this.usedVarNames = varNames;
			}
			
			public void enterBlock(){
				stack.add(new HashMap<>());
			}
			public void exitBlock(){
				stack.remove(stack.size() - 1);
			}
			public boolean newIdentifier(String id, String type){
				for (HashMap<String, String> map: stack){
					if (map.containsKey(id)) return false;
				}
				
				if (!usedVarNames.containsKey(id)){
					usedVarNames.put(id, type);
					stack.get(stack.size() -1).put(id, id);

					return true;
				}

				int r = 0;
				while(true){
					if (!usedVarNames.containsKey(id + Integer.toString(r))){
						usedVarNames.put(id + Integer.toString(r), type);
						stack.get(stack.size() -1).put(id, id+Integer.toString(r));
						return true;
					}
				}
			}
			
			public String getIdentifier(String id){
				for(int i = stack.size() - 1; i >= 0; i--){
					if (stack.get(i).containsKey(id)) return stack.get(i).get(id);
				}
				return "";
			} 
			
			public boolean identifierNotUsedInHLL(String id){
				for(int index = stack.size() - 1; index >= 0; index--){
					if (stack.get(index).containsKey(id)) return false;
				}
				return true;
			} 
		}
		
		public Scope(String n){
			this.name = n;
			this.blockStack = new BlockStack(initialisedVars);
			
		}
		
		public void pasteCode(String newCode){
			code.append(newCode);
		}
		
		public void addNewVar(String varName, String varType){
			this.blockStack.newIdentifier(varName, varType);
		}
		
		public boolean nameFreeInHLL(String varName){
			return blockStack.identifierNotUsedInHLL(varName);
		}
		
		public String nameConvert(String id){
			return blockStack.getIdentifier(id);
		}
		
		public String isOfType(String varName){
			return initialisedVars.get(blockStack.getIdentifier(varName));
		}
		
		public void enterBlock(){
			blockStack.enterBlock();
		}
		
		public void exitBlock(){
			blockStack.exitBlock();
		}
	}
	
	private String typeConvert(String languageType){
		switch(languageType){
			case "dcis":
				return "i32";
			case "kcis":
				return "i8";
			case "ph":
				return "i1";
			case "znak":
				return "i8";
			case "retaz":
				return "i8*";
			case "dcis[]":
				return "i32*";
			case "kcis[]":
				return "i8*";
			case "ph[]":
				return "i8*";
			case "znak[]":
				return "i8";
			default:
				return "";
		}
	}
	
	private boolean isSimpleType(String languageType){
		switch(languageType){
			case "dcis":
				return true;
			case "kcis":
				return true;
			case "ph":
				return true;
			case "znak":
				return true;
			case "i1":
				return true;
			case "i8":
				return true;
			case "i32":
				return true;
			default:
				return false;
		}
	}
	
	private String logOpConvert(String op, String type){
		switch(op){
			case "==":
				return "eq";
			case "!=":
				return "ne";
			default:
				String sig = type.equals("i8") ? "u" : "s";
				switch(op){
					case ">":
						return sig + "gt";
					case ">=":
						return sig + "ge";
					case "<":
						return sig + "lt";
					case "<=":
						return sig + "le";
					default:
						return "LogOpConvert FAILED";
				}
			
		}
	}
	
	public CompileVisitor(ArrayList<ProcRecord> recordTable, ArrayList<String> usedNamespace){
		
		generalNamespace = convertArrayListToHashMap(usedNamespace);
		for (ProcRecord proc: recordTable) procedures.put(proc.name, proc);
		scopes.add(mainScope);
		currentScope = mainScope;
	}
	
	@Override public ReturnContent visitInit(GrammarParser.InitContext ctx) {	
		currentScope.pasteCode("declare i32 @readint()\n");
		procedures.put("readint", new ProcRecord("readint", "dcis"));
		procedures.put("cdcis", new ProcRecord("cdcis", "dcis"));
		
		currentScope.pasteCode("declare i8* @readline(i32)\n");
		procedures.put("readline", new ProcRecord("readline", "retaz"));
		procedures.put("criadok", new ProcRecord("criadok","retaz"));
		procedures.get("criadok").addParam("dcis", "maxLength");
		
		currentScope.pasteCode("declare i8 @readchar()\n");
		procedures.put("readchar", new ProcRecord("readchar", "znak"));
		procedures.put("cznak", new ProcRecord("cznak", "znak"));
		
		currentScope.pasteCode("declare i32 @printString(i8*, i32)\n");
		procedures.put("printString", new ProcRecord("printString", "dcis"));
		procedures.put("vypis", new ProcRecord("vypis", "dcis"));
		procedures.get("vypis").addParam("znak[]", "buffer");
		procedures.get("vypis").addParam("dcis", "length");
		
		currentScope.pasteCode("declare i32 @printChar(i8)\n");
		procedures.put("printChar", new ProcRecord("printChar", "dcis"));
		procedures.put("vypisZnak", new ProcRecord("vypisZnak", "dcis"));
		procedures.get("vypisZnak").addParam("znak", "c");		
		
		currentScope.pasteCode("declare i32 @printNumber(i32)\n");
		procedures.put("printNumber", new ProcRecord("printNumber", "dcis"));
		procedures.put("vypisdcis", new ProcRecord("vypisdcis", "dcis"));
		procedures.get("vypisdcis").addParam("dcis", "n");
		
		currentScope.pasteCode("declare i32 @power(i32, i32)\n");
		procedures.put("power", new ProcRecord("power", "dcis"));
		
		currentScope.pasteCode("declare i8 @pwr(i8, i8)\n");
		procedures.put("pwr", new ProcRecord("pwr", "dcis"));
		
		currentScope.pasteCode("declare i8* @zretaz(i8*, i32, i8*, i32)\n");
		procedures.put("zretaz", new ProcRecord("zretaz", "dcis"));
		procedures.put("spoj", new ProcRecord("spoj","retaz"));
		procedures.get("spoj").addParam("retaz", "param1");
		procedures.get("spoj").addParam("dcis", "param2");
		procedures.get("spoj").addParam("retaz", "param3");
		procedures.get("spoj").addParam("dcis", "param4");
		
		currentScope.pasteCode("declare i8* @alloc8(i32)\n");
		procedures.put("alloc8", new ProcRecord("alloc8", "retaz"));
		
		currentScope.pasteCode("declare i8** @alloc8p(i32)\n");
		procedures.put("alloc8p", new ProcRecord("alloc8p", "retaz"));
		
		currentScope.pasteCode("declare i32* @alloc32(i32)\n");
		procedures.put("alloc32", new ProcRecord("alloc32", "retaz"));
		
		currentScope.pasteCode("declare i8* @copy(i8*, i32)\n");
		procedures.put("copy", new ProcRecord("copy", "retaz"));
		
		
		procedures.put("main", new ProcRecord("main", "dcis"));
		currentScope.pasteCode("\n"+"define i32 @main(){\n");
		currentScope.pasteCode("start:\n");
		currentScope.enterBlock();
		visitChildren(ctx); 
		currentScope.exitBlock();
		if (!mainReturned) currentScope.pasteCode("ret i32 0\n");
		currentScope.pasteCode("}\n");
		return new ReturnContent(false);
	}
	
	@Override public ReturnContent visitStat(GrammarParser.StatContext ctx) { 
		try{
			int i = 0;
			
			while(true){
				ReturnContent rc = super.visit(ctx.getChild(i));
				if (rc.returned) mainReturned = true;
				i++;
			}
		}
		catch(Exception e){};
		return new ReturnContent(false);
		
	}
	
	@Override public ReturnContent visitBody(GrammarParser.BodyContext ctx) {
		if (currentScope.name.equals("main") && mainReturned) return new ReturnContent(false);
		return super.visit(ctx.statbody()); 
	}
	
	@Override public ReturnContent visitInternalbody(GrammarParser.InternalbodyContext ctx) { 
		try{
			int i = 0;
			while(true){
				GrammarParser.BodyContext stat = ctx.body(i);
				ReturnContent rc = visitBody(stat);
				if (rc.returned) return new ReturnContent(true);
				i++;
			}
		}
		catch(Exception e){}
		return new ReturnContent(false);
	}
	
	@Override public ReturnContent visitProcDef(GrammarParser.ProcDefContext ctx) {
		currentScope = new Scope(ctx.ID().getText());
		currentScope.enterBlock();
		currentScope.pasteCode("define " + typeConvert(ctx.varType().getText()) + " @" + ctx.ID().getText() + "(");
		GrammarParser.DefParamsContext params = ctx.defParams();
		visitDefParams(params);
		boolean returned = false;
		
		try{
			int i = 0;
			while(true){
				GrammarParser.BodyContext stat = ctx.body(i);
				ReturnContent rc = visitBody(stat);
				if (rc.returned) {
					returned = true;
					break;
				}
				i++;
			}
		}
		catch(Exception e){}
		
		//if (!returned) errors.append("Function " + currentScope.name + " does not have a return value.");
		currentScope.pasteCode("}\n");
		currentScope.exitBlock();
		scopes.add(currentScope);
		currentScope = mainScope;
		return new ReturnContent(false);
	}
	
	@Override public ReturnContent visitIf(GrammarParser.IfContext ctx) { 
		GrammarParser.ElsebodyContext elsebod = ctx.elsebody();
		ReturnContent rc = super.visit(ctx.logicalExpr());

		String ifBlock = getBlockName();
	
		if (elsebod == null){
			String contBlock = getBlockName();
			
			currentScope.pasteCode("br i1 " + rc.operand + ", label %" + ifBlock + ", label %" + contBlock + "\n");
			currentScope.pasteCode(ifBlock + ":\n");
			
			currentScope.enterBlock();
			ReturnContent ifRc = super.visit(ctx.internalbody());
			currentScope.exitBlock();
			
			if (!ifRc.returned) currentScope.pasteCode("br label %" + contBlock + "\n");
			currentScope.pasteCode(contBlock + ":\n");
			return new ReturnContent(false);
		}
		else{
			String elseBlock = getBlockName();
			String contBlock = getBlockName();
			currentScope.pasteCode("br i1 " + rc.operand + ", label %" + ifBlock + ", label %" + elseBlock + "\n");
			
			currentScope.pasteCode(ifBlock + ":\n");
			
			currentScope.enterBlock();
			ReturnContent ifRc = super.visit(ctx.internalbody());
			currentScope.exitBlock();
			
			if (!ifRc.returned) currentScope.pasteCode("br label %" + contBlock + "\n");
			
			currentScope.pasteCode(elseBlock + ":\n");
			
			currentScope.enterBlock();
			ReturnContent elseRc = super.visit(ctx.elsebody());
			currentScope.exitBlock();
			
			if (!elseRc.returned) currentScope.pasteCode("br label %" + contBlock + "\n");
			
			if (!elseRc.returned || !ifRc.returned) currentScope.pasteCode(contBlock + ":\n");
			return new ReturnContent(elseRc.returned & ifRc.returned);
		}
	}
	
	@Override public ReturnContent visitElsebody(GrammarParser.ElsebodyContext ctx) {
		return visit(ctx.internalbody());
	}
	
	@Override public ReturnContent visitDirectExpr(GrammarParser.DirectExprContext ctx) { 
		return super.visit(ctx.expr());
	}
	
	@Override public ReturnContent visitWhile(GrammarParser.WhileContext ctx) {
		String logicalBlock = getBlockName();
		currentScope.pasteCode("br label %" + logicalBlock + "\n");
		currentScope.pasteCode(logicalBlock + ":\n");
		ReturnContent logical = super.visit(ctx.logicalExpr());
		String whileBlock = getBlockName();
		String contBlock = getBlockName();
		currentScope.pasteCode("br i1 " + logical.operand + ", label %" + whileBlock + ", label %" + contBlock + "\n");
		
		currentScope.pasteCode(whileBlock + ":\n");
		
		currentScope.enterBlock();
		ReturnContent whileRc = super.visit(ctx.internalbody());
		currentScope.exitBlock();
		
		if (!whileRc.returned) {
			currentScope.pasteCode("br label %" + logicalBlock + "\n");
			currentScope.pasteCode(contBlock + ":\n");
			return new ReturnContent(false);
		}
		else{
			return new ReturnContent(true);
		}
	}
	
	@Override public ReturnContent visitArrayDef(GrammarParser.ArrayDefContext ctx) {
		if (!currentScope.nameFreeInHLL(ctx.ID().getText())){
			errors.append("Multiple declaration of variable " + ctx.ID().getText() + " in function " + currentScope.name + "\n");
		}
		else{
			String type = ctx.varType().getText();
			if (!type.equals("kcis") & !type.equals("dcis")) errors.append("Unsupported array type :'"+type+"'\n");
			currentScope.pasteCode("%" + ctx.ID().getText() + " = alloca " + typeConvert(type) + "*\n");
			ReturnContent rc = super.visit(ctx.expr());
			String varName = getVarName();
			currentScope.pasteCode("%" + varName + " = call " + typeConvert(type) + "* (i32) @alloc" + (type.equals("kcis") ? "8" :"32") + "(i32 " + rc.operand + ")\n");
			currentScope.pasteCode("store " + typeConvert(type) + "* %" + varName + ", " + typeConvert(type) + "** %" + ctx.ID().getText() + "\n");
			currentScope.addNewVar(ctx.ID().getText(), typeConvert(type) + "*");
		}
		return new ReturnContent(false);
	}
	
	@Override public ReturnContent visitVarDef(GrammarParser.VarDefContext ctx) { 
		
		if (!currentScope.nameFreeInHLL(ctx.ID().getText())){
			errors.append("Multiple declaration of variable " + ctx.ID().getText() + " in function " + currentScope.name + "\n");
		}
		else{
			currentScope.addNewVar(ctx.ID().getText(), this.typeConvert(ctx.varType().getText()));
			currentScope.pasteCode("%" + currentScope.nameConvert(ctx.ID().getText()) + " = alloca " + this.typeConvert(ctx.varType().getText()) + "\n");
		}
		return new ReturnContent(false);
	}
	
	@Override public ReturnContent visitArrayAssign(GrammarParser.ArrayAssignContext ctx) {
		String type = currentScope.isOfType(ctx.ID().getText());
		if (currentScope.nameFreeInHLL(ctx.ID().getText())) errors.append("Assignment to undefined array '" + ctx.ID().getText() + "'.\n");
		if (type.equals("i8*")) type = "i8";
		if (type.equals("i32*")) type = "i32";
		
		if (isSimpleType(currentScope.isOfType(ctx.ID().getText()))) errors.append("Variable '" + ctx.ID().getText() + "' is not referencable as array.\n");

		if (!type.equals("i8") && !type.equals("i32")) errors.append("Type mismatch undefined behavior.\n");
		ReturnContent index = super.visit(ctx.expr(0));
		if (!index.type.equals("i32") && !index.type.equals("any")) errors.append("Array index must be of type 'dcis'\n.");
		ReturnContent value = super.visit(ctx.expr(1));
		if (!value.type.equals("any") && value.type.equals(currentScope.isOfType(ctx.ID().getText()))) errors.append("Assigned value is of type '" + value.type + "' whereas array is of type '" + currentScope.isOfType(ctx.ID().getText()));
		
		String arrayInit = getVarName();
		currentScope.pasteCode("%" + arrayInit + " = load " + type + "*, " + type + "** %" + ctx.ID().getText() + "\n");
		String offset = index.operand;
		currentScope.pasteCode("");
		if (type.equals("i32")){
			String mult = getVarName();
			currentScope.pasteCode("%" + mult + " = mul i32* 4, " + offset + "\n");
			offset = mult;
		}
		String addr = getVarName();
		currentScope.pasteCode("%" + addr + " = add i32* %" + arrayInit + ", %" + offset + "\n");
		currentScope.pasteCode("store " + type + " " + value.operand + ", " + type + "* %" + addr + "\n");
		return new ReturnContent(false);
	}
	
	@Override public ReturnContent visitVarAssign(GrammarParser.VarAssignContext ctx) {
		
		if (currentScope.nameFreeInHLL(ctx.ID().getText())){
			errors.append("Assignment to undeclared variable " + ctx.ID().getText() + " in function " + currentScope.name +"\n");
			return new ReturnContent(false);
		}
		ReturnContent rc = super.visit(ctx.expr());
		
		if (currentScope.isOfType(ctx.ID().getText()) == "i1"){
			if (rc.type.equals("any")){
				String name = getVarName();
				currentScope.pasteCode("%" + name + " = icmp eq i32 0, " + rc.operand + "\n");
				currentScope.pasteCode("store i1 %" + name + ", i1* %" + currentScope.nameConvert(ctx.ID().getText()) + "\n");
				return new ReturnContent(false);
			}
			
			if (rc.type.equals("i8") || rc.type.equals("i32")){
				String name = getVarName();
				currentScope.pasteCode("%" + name + " = icmp eq " + rc.type + " 0, " + rc.operand + "\n");
				currentScope.pasteCode("store i1 %" + name + ", i1* %" + currentScope.nameConvert(ctx.ID().getText()) + "\n");
				return new ReturnContent(false);
			}
			if (rc.type.equals("i8*")){
				String loadName = getVarName();
				currentScope.pasteCode("%" + loadName + " = load i8, i8* " + rc.operand + "\n");
				String name = getVarName();
				currentScope.pasteCode("%" + name + " = icmp eq i8 0, %" + loadName + "\n");
				currentScope.pasteCode("store i1 %" + loadName + ", i1* %" + currentScope.nameConvert(ctx.ID().getText()) + "\n");
				return new ReturnContent(false);
				
			}
		}
		
		if (!rc.type.equals("any") && !rc.type.equals(currentScope.isOfType(ctx.ID().getText()))){
			errors.append("Operands type mismatch on command " + ctx.getText() + " in function " + currentScope.name +"\n");
		}

		currentScope.pasteCode("store " + currentScope.isOfType(ctx.ID().getText()) + " " + rc.operand + ", " + currentScope.isOfType(ctx.ID().getText()) + "* %" + currentScope.nameConvert(ctx.ID().getText()) + "\n");
		return new ReturnContent(false);
	}
	
	@Override public ReturnContent visitReturn(GrammarParser.ReturnContext ctx) {
		ReturnContent rc = super.visit(ctx.expr());
		if (currentScope.name.equals("main") && !rc.type.equals("i32") && !rc.type.equals("any")){
			errors.append("Wrong return type in 'main': Expected return type 'dcis'.");
		}
		String scopeRetType = procedures.get(currentScope.name).retType;
		if (!rc.type.equals(typeConvert(scopeRetType)) && !rc.type.equals("any")){
			errors.append("Wrong return type in function '" + currentScope.name + "': Expected return type '" + scopeRetType + "'");
		}
		currentScope.pasteCode("ret " + typeConvert(scopeRetType) + " " + rc.operand + "\n");
		return new ReturnContent(true);
		
	}
	
	@Override public ReturnContent visitLogicalOp(GrammarParser.LogicalOpContext ctx) {
		ReturnContent rc1 = super.visit(ctx.expr(0));
		ReturnContent rc2 = super.visit(ctx.expr(1));
		
		String type;
		if (!rc1.type.equals(rc2.type)){
			if (!rc1.type.equals("any") && !rc2.type.equals("any")) errors.append("Type mismatch in logical operation " + ctx.getText() + "\n");
			type = rc1.type.equals("any") ? rc2.type : rc1.type;
		}
		else{
			if(rc1.type.equals("any")){
				type = "i32";
			}
			else type = rc1.type;
		}
		
		String name = getVarName();
		currentScope.pasteCode("%"+name + " = icmp " + logOpConvert(ctx.op.getText(), type) + " " + type + " " + rc1.operand + ", " + rc2.operand + "\n");
		
		return new ReturnContent("%"+name, type); 
	}
	
	@Override public ReturnContent visitNegation(GrammarParser.NegationContext ctx) {
		ReturnContent rc = super.visit(ctx.logicalExpr());
		String name = getVarName();
		currentScope.pasteCode("%"+name + " = xor i1 1, " + rc.operand + "\n");
		
		return new ReturnContent("%" + name, "i1"); 
	}
	
	@Override public ReturnContent visitParens(GrammarParser.ParensContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override public ReturnContent visitAndOr(GrammarParser.AndOrContext ctx) {
		ReturnContent rc1 = super.visit(ctx.logicalExpr(0));
		ReturnContent rc2 = super.visit(ctx.logicalExpr(1));
		String name = getVarName();
		currentScope.pasteCode("%"+ name + " = " + (ctx.op.getType() == GrammarParser.AND ? "and" : "or") + " i1 " + rc1.operand +  ", " + rc2.operand + "\n");
		
		return new ReturnContent("%" + name, "i1"); 
	}
	
	@Override public ReturnContent visitExprToLogic(GrammarParser.ExprToLogicContext ctx) {
		ReturnContent rc = super.visit(ctx.expr());
		if (rc.type.equals("any")){
			return new ReturnContent(rc.operand.equals("0") ? "0" : "1", "i1");
		}
		if (rc.type.equals("i8") || rc.type.equals("i32")){
			String name = getVarName();
			currentScope.pasteCode("%" + name + " = icmp eq " + rc.type + " 0, " + rc.operand + "\n");
			return new ReturnContent("%" + name, "i1");
		}
		if (rc.type.equals("i1")) return rc;
		if (rc.type.equals("i8")){
			String loadName = getVarName();
				currentScope.pasteCode("%" + loadName + " = load i8, i8* " + rc.operand + "\n");
				String name = getVarName();
				currentScope.pasteCode("%" + name + " = icmp eq i8 0, %" + loadName + "\n");
				return new ReturnContent("%" + name, "i1");
		}
		errors.append("Unsuitable operand type in logical expression");
		
		return new ReturnContent(false); 
	}
	
	@Override public ReturnContent visitAdditiveOp(GrammarParser.AdditiveOpContext ctx) {

		ReturnContent rc1 = super.visit(ctx.expr());
		ReturnContent rc2 = super.visit(ctx.term());
		
		if (rc1.type.equals("any") && rc2.type.equals("any")) return new ReturnContent(Integer.toString(Integer.valueOf(rc1.operand) + (ctx.op.getType() == GrammarParser.ADD ? 1 : -1)*Integer.valueOf(rc2.operand)), "any");
		if (!rc1.type.equals("any") && !rc2.type.equals("any") && !rc1.type.equals(rc2.type)) errors.append("Type mismatch\n");
		String name = getVarName();
		currentScope.pasteCode("%"+name + " = " + (ctx.op.getType() == GrammarParser.ADD ? "add " : "sub "));
		currentScope.pasteCode((!rc1.type.equals("any") ? rc1.type : rc2.type) + " " + rc1.operand + ", " + rc2.operand + "\n"  );
		return new ReturnContent("%"+name, (!rc1.type.equals("any") ? rc1.type : rc2.type));
	}
	
	@Override public ReturnContent visitGetTerm(GrammarParser.GetTermContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public ReturnContent visitMultiplicativeOp(GrammarParser.MultiplicativeOpContext ctx) {
		ReturnContent rc1 = super.visit(ctx.term());
		ReturnContent rc2 = super.visit(ctx.factor());
		if (!isSimpleType(rc1.type) && !isSimpleType(rc2.type)) errors.append("Multiplicative operation is not aplicable to 'retaz'");
		if (rc1.type.equals("any") && rc2.type.equals("any")){
			if (ctx.op.getType() == GrammarParser.MUL) return new ReturnContent(Integer.toString(Integer.valueOf(rc1.operand) * Integer.valueOf(rc2.operand)), "any");
			else return new ReturnContent(Integer.toString(Integer.valueOf(rc1.operand) / Integer.valueOf(rc2.operand)), "any");
		}
		if (!rc1.type.equals("any") && !rc2.type.equals("any") && !rc1.type.equals(rc2.type)) errors.append("Type mismatch\n");
		String name = getVarName();
		currentScope.pasteCode("%"+name + " = " + (ctx.op.getType() == GrammarParser.MUL ? "mul " : "div "));
		currentScope.pasteCode((!rc1.type.equals("any") ? rc1.type : rc2.type) + " " + rc1.operand + ", " + rc2.operand + "\n"  );
		return new ReturnContent("%"+name, (!rc1.type.equals("any") ? rc1.type : rc2.type));

	}
	
	@Override public ReturnContent visitGetFactor(GrammarParser.GetFactorContext ctx) { 
		return visitChildren(ctx); }
	
	@Override public ReturnContent visitGetPower(GrammarParser.GetPowerContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override public ReturnContent visitPowerOp(GrammarParser.PowerOpContext ctx) {
		ReturnContent rc1 = super.visit(ctx.factor());
		ReturnContent rc2 = super.visit(ctx.power());
		
		String name = getVarName();
		if (rc1.type.equals("any") && rc2.type.equals("any")){
			return new ReturnContent(String.valueOf(Math.round(Math.pow(Integer.valueOf(rc1.operand),Integer.valueOf(rc2.operand)))%256), "any");
		}
		if (!rc1.type.equals("any") && !rc2.type.equals("any") && !rc1.type.equals(rc2.type)) errors.append("Type mismatch\n");
		
		if (rc1.type.equals("i8")){
			currentScope.pasteCode("%" + name + " = call i8 (i8, i8) @pwr(i8 " + rc1.operand + ", i8 " + rc2.operand + ")\n");
			return new ReturnContent("%"+name, "i8");
		} 
		if (rc1.type.equals("i32")){
		currentScope.pasteCode("%" + name + " = call i32 (i32, i32) @power(i32 " + rc1.operand + ", i32 " + rc2.operand + ")\n");
			return new ReturnContent("%"+name, "i32");
		}
		errors.append("Operands of the '^' operation are not of suitable type\n");
		
		return new ReturnContent(false); 
	}
	
	@Override public ReturnContent visitFunctionCall(GrammarParser.FunctionCallContext ctx) { 
		ReturnContent rc = super.visit(ctx.params());
		String procName = ctx.ID().getText();
		
		if (!procedures.containsKey(procName)) errors.append("Procedure '" + procName + "' is not defined.\n");
		
		String procRetType = typeConvert(procedures.get(ctx.ID().getText()).retType);
		String varName = getVarName();
		ProcRecord pr = procedures.get(procName);
		currentScope.pasteCode("%" + varName + " = call " + procRetType + " ");
		
		
		if (procName.equals("spoj") || procName.equals("criadok") || procName.equals("cznak") || procName.equals("cdcis") || procName.equals("vypisdcis") || procName.equals("vypis")){
			currentScope.pasteCode("(");
			
			for(int i = 0; i<pr.types.size(); i++){
				if (i > 0) currentScope.pasteCode(", ");
				currentScope.pasteCode(typeConvert(pr.types.get(0)));
			}
			currentScope.pasteCode(") @");
			
			switch(procName){
				case "spoj":
					currentScope.pasteCode("zretaz");
					break;
				case "criadok":
					currentScope.pasteCode("readline");
					break;
				case "cznak":
					currentScope.pasteCode("readchar");
					break;
				case "cdcis":
					currentScope.pasteCode("readint");
					break;
				case "vypisdcis":
					currentScope.pasteCode("printNumber");
					break;
				case "vypis":
					currentScope.pasteCode("printString");
					break;
			}
		}
		else{
			currentScope.pasteCode("@" + procName);
		}
		currentScope.pasteCode("(");
		if (pr.types.size() != rc.types.size()) errors.append("Incorrect number of parameters for function '" + procName + "'. It takes " + pr.types.size() + ", but " + rc.types.size() + " were given.\n");
	
		for(int i = 0; i< pr.types.size(); i++){
			if (i > 0) currentScope.pasteCode(", ");
			if (!typeConvert(pr.types.get(i)).equals(rc.types.get(i))) errors.append("Incorrect type of parameter number " + i + " in function '" + procName +"'.\n");
			currentScope.pasteCode(rc.types.get(i) + " " + rc.ids.get(i));
		}
		currentScope.pasteCode(")\n");
	
		return new ReturnContent("%"+varName, procRetType);
		
	}
	
	@Override public ReturnContent visitVar(GrammarParser.VarContext ctx) {
		if (currentScope.nameFreeInHLL(ctx.ID().getText())) {
			errors.append("Access of undeclared variable " + ctx.ID().getText() + " in function " + currentScope.name + "\n");
		}
		String id = currentScope.nameConvert(ctx.ID().getText());
		if (currentScope.isOfType(id).equals("i32*")) errors.append("Array '" + id + "' referenced as variable\n");
		String operand = getVarName();
		if (currentScope.isOfType(id).equals("i8*")) return new ReturnContent("%"+id, "i8*");
		currentScope.pasteCode("%" + operand + " = load " + currentScope.isOfType(ctx.ID().getText()) + ", " + currentScope.isOfType(ctx.ID().getText()) + "* %" + ctx.ID().getText() + "\n");
		return new ReturnContent("%" + operand, currentScope.isOfType(ctx.ID().getText()));
	}
	
	@Override public ReturnContent visitArray(GrammarParser.ArrayContext ctx) {
		String type = currentScope.isOfType(ctx.ID().getText());
		if (currentScope.nameFreeInHLL(ctx.ID().getText())) errors.append("Access to undefined array '" + ctx.ID().getText() + "'.\n");
		if (type.equals("i8*")) type = "i8";
		if (type.equals("i32*")) type = "i32";
		
		if (isSimpleType(currentScope.isOfType(ctx.ID().getText()))) errors.append("Variable '" + ctx.ID().getText() + "' is not referencable as array.\n");
		if (!type.equals("i8") && !type.equals("i32")) errors.append("Type mismatch undefined behavior.\n");
		ReturnContent index = super.visit(ctx.expr());
		if (!index.type.equals("i32") && !index.type.equals("any")) errors.append("Array index must be of type 'dcis'\n.");
		
		String arrayInit = getVarName();
		currentScope.pasteCode("%" + arrayInit + " = load " + type + "*, " + type + "** %" + ctx.ID().getText() + "\n");
		String offset = index.operand;
		if (type.equals("i32")){
			String mult = getVarName();
			currentScope.pasteCode("%" + mult + " = mul i32 4, " + offset + "\n");
			offset = mult;
		}
		String addr = getVarName();
		currentScope.pasteCode("%" + addr + " = add i32* %" + arrayInit + ", %" + offset + "\n");
		String returnVal = getVarName();
		currentScope.pasteCode("%" + returnVal + " = load " + type + ", " + type + "* %" + addr + "\n");
		return new ReturnContent("%" + addr, type);
		
	}
	
	@Override public ReturnContent visitNumber(GrammarParser.NumberContext ctx) {
		return new ReturnContent(ctx.NUM().getText(), "any");
	}
	
	@Override public ReturnContent visitUnaryMinus(GrammarParser.UnaryMinusContext ctx) {
		ReturnContent rc = super.visit(ctx.expr());
		if (rc.type.equals("any")){
			rc.operand = Integer.toString(Integer.valueOf(rc.operand)*(-1));
			return rc;
		}
		else{
			String name = getVarName();
			currentScope.pasteCode("%" + name + " = sub " + rc.type + " 0, " + rc.operand + "\n");
			return new ReturnContent("%" + name, rc.type);
		} 
	}
	
	@Override public ReturnContent visitBrackets(GrammarParser.BracketsContext ctx) {
		
		return super.visit(ctx.expr()); 
	}
	
	@Override public ReturnContent visitTrue(GrammarParser.TrueContext ctx) { 
		return new ReturnContent("1", "any");
	}
	
	@Override public ReturnContent visitFalse(GrammarParser.FalseContext ctx) {
		return new ReturnContent("0", "any");
	}
	
	@Override public ReturnContent visitString(GrammarParser.StringContext ctx) { 
		String varName = getVarName();
		String str = ctx.getText().substring(1,ctx.getText().length() - 1);
		currentScope.pasteCode("%" + varName + " = getelementptr [" + Integer.toString(str.length()+1) + " x i8], [" +
																	  Integer.toString(str.length()+1) + " x i8]* @" + str + ", i32 0, i32 0\n");
		String returnVar = getVarName();
		currentScope.pasteCode("%" + returnVar + " = call i8* (i8*, i32) @copy(i8* %" + varName + ", i32 " + (str.length() + 1) + ")\n");
		return new ReturnContent("%"+ returnVar, "i8*");
	}
	
	@Override public ReturnContent visitCharacter(GrammarParser.CharacterContext ctx) {
		String varName = getVarName();
		String str = ctx.getText().substring(1,ctx.getText().length() - 1);
		char c = str.charAt(0);
		int res = c;
		return new ReturnContent(Integer.toString(res), "i8"); 
	}	
	
	@Override public ReturnContent visitParams(GrammarParser.ParamsContext ctx) {
		ArrayList<String> IDs = new ArrayList<>();
		ArrayList<String> types = new ArrayList<>();
		
		try{
			int i = 0;
			while(true){
				if (currentScope.nameFreeInHLL(ctx.ID(i).getText())) errors.append("Undefined variable " + ctx.ID(i).getText() + " in the call of function.");
				else{
					String newVar = getVarName();
					currentScope.pasteCode("%" + newVar + " = load " + currentScope.isOfType(ctx.ID(i).getText()) + ", " + currentScope.isOfType(ctx.ID(i).getText()) + "* %" + ctx.ID(i).getText() + "\n");
					IDs.add("%" + newVar);
					types.add(currentScope.isOfType(ctx.ID(i).getText()));
				}
				i++;
				
			}
		}
		catch(Exception e){}
		
		return new ReturnContent(IDs, types); 
	}
	
	@Override public ReturnContent visitDefParams(GrammarParser.DefParamsContext ctx) {
		ArrayList<String> tempNames = new ArrayList<>();
		try{
			int i = 0;
			while(true){
				if (isSimpleType(ctx.varType(i).getText())){
					String newVar = getVarName();
					tempNames.add(newVar);
					String tmp = typeConvert(ctx.varType(i).getText()) + " %" + newVar;
					if (i > 0) currentScope.pasteCode(", ");
					currentScope.pasteCode(tmp);
					if (!currentScope.nameFreeInHLL(ctx.ID(i).getText())){
						errors.append("Multiple declaration of variable '" + ctx.ID(i).getText() +"' in definition of function '" + currentScope.name + "'.\n");
					}
					currentScope.addNewVar(ctx.ID(i).getText(), typeConvert(ctx.varType(i).getText()));
				}
				else{
					tempNames.add("");
					String tmp = typeConvert(ctx.varType(i).getText()) + "* %" + ctx.ID(i).getText();
					if (i > 0) currentScope.pasteCode(", ");
					currentScope.pasteCode(tmp);
					if (!currentScope.nameFreeInHLL(ctx.ID(i).getText())){
						errors.append("Multiple declaration of variable '" + ctx.ID(i).getText() +"' in definition of function '" + currentScope.name + "'.\n");
					}
					currentScope.addNewVar(ctx.ID(i).getText(), typeConvert(ctx.varType(i).getText()));
				}
				i++;
			}
		}
		catch(Exception e){}
		currentScope.pasteCode(") {\n");
		currentScope.pasteCode("start:\n");
		try{
			int i = 0;
			while(true){
				if (!tempNames.get(i).equals("")){
					currentScope.pasteCode("%"+ctx.ID(i).getText()+ " = alloca " + typeConvert(ctx.varType(i).getText()) + "\n");
					currentScope.pasteCode("store " + typeConvert(ctx.varType(i).getText()) + " %" + tempNames.get(i) + ", ");
					currentScope.pasteCode(typeConvert(ctx.varType(i).getText()));
					currentScope.pasteCode("* %" + ctx.ID(i).getText() + "\n");
				}
				i++;
			}
		}
		catch(Exception e){}
		return new ReturnContent(false); 
	}
	
	public String getCode(){
		StringBuilder retCode = new StringBuilder();
		for (Scope scope: scopes){
			retCode.append(scope.code.toString());
			retCode.append("\n");
		}
		return retCode.toString();
	}

	public String getErrors(){
		return errors.toString();
	}
}