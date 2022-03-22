import java.util.ArrayList;

public class ProcRecord{
	
	public String name;
	public String retType;
	public ArrayList<String> types = new ArrayList<>();
	public ArrayList<String> names = new ArrayList<>();
	
	public ProcRecord(String name, String retType){
		this.name = name;
		this.retType = retType;
	}
	
	public void addParam(String type, String name){
		this.types.add(type);
		this.names.add(name);
	}
}