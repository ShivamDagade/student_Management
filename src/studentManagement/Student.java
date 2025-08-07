package studentManagement;

public class Student {
	
	private int sId;
	private String sName;
	private int sAge;
	
	public Student() {
		super();
	}
	
	public Student(int sId, String sName,int sAge) {
		super();
		this.sId = sId;
		this.sName= sName;
		this.sAge = sAge;
	}
	
	public void setSId(int sId) {
		this.sId= sId;
	}
	
	public int getSId() {
		return sId;
	}
	
	public void setSName(String sName) {
		this.sName= sName;
	}
	
	public String getSName() {
		return sName;
	}
	
	public void setSAge(int sAge) {
		this.sAge= sAge;
	}
	
	public int getSAge() {
		return sAge;
	}
	
	@Override
	public String toString() {
		return "Student [sId = "+sId+" , sName = "+sName+", sAge = "+sAge+"]";
	}
}
