import java.util.*;

public  class ReturnContent{
	String operand;
	String type;
	int length;
	boolean returned = false;
	ArrayList<String> ids;
	ArrayList<String> types;
	
	public ReturnContent(String op, String t){
		operand = op;
		type = t;
	}
	public ReturnContent(String op, String t, int length){
		this(op,t);
		this.length = length;
	}
	public ReturnContent(boolean ret){
		this.returned = ret;
	}
	
	public ReturnContent(ArrayList<String> ids, ArrayList<String> types){
		this.ids = ids;
		this.types = types;
	}
}