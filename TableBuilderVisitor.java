import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

public class TableBuilderVisitor extends GrammarBaseVisitor<Integer> {
	ArrayList<ProcRecord> recordTable = new ArrayList<>();
	ArrayList<String> usedNamespace = new ArrayList<>();
	StringBuilder globals = new StringBuilder();

	@Override public Integer visitProcDef(GrammarParser.ProcDefContext ctx) {
		recordTable.add(new ProcRecord(ctx.ID().getText(), ctx.varType().getText()));
		return visitChildren(ctx);
	}

	@Override public Integer visitVarDef(GrammarParser.VarDefContext ctx) { 
		usedNamespace.add(ctx.ID().getText());
		return visitChildren(ctx); 
	}

	@Override public Integer visitDefParams(GrammarParser.DefParamsContext ctx) {
		try{
			
			int i = 0;
			while(true){
				recordTable.get(recordTable.size() - 1).addParam(ctx.varType(i).getText(), ctx.ID(i).getText());
				i++;
			}
			
		}
		catch(Exception e){
		}
		
		try{
			int i = 0;
			while(true){
				usedNamespace.add(ctx.ID(i).getText());
				i++;
			}
		}
		catch(Exception e){
		}
		return visitChildren(ctx);
	}
	@Override public Integer visitString(GrammarParser.StringContext ctx) {
		globals.append("@" + (ctx.getText().substring(1, ctx.getText().length() -1)) + " = global [" + Integer.toString(ctx.getText().length()-1));
		globals.append(" x i8] c" + ctx.getText().substring(0, ctx.getText().length() - 1) + "\\00\"\n");
		
		return visitChildren(ctx); 
	}
   
	public ArrayList<ProcRecord> getRecordTable(){
		return this.recordTable;
	}
	
	public ArrayList<String> getNamespace(){
		return this.usedNamespace;
	}
	
	public String getGlobals(){
		return this.globals.toString();
	}
}