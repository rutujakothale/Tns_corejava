package association.IsA;

public class Manager extends Employee{
	private int teamSize;
	
	public Manager() {
		super();
	}
	
	public Manager(String name, int employeeid,String department,int teamSize) {
		super(name,employeeid,department);
		this.teamSize=teamSize;
	}
	
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize (int teamSize) {
		this.teamSize=teamSize;
	}
	@Override
	public String toString() {
		return "Manager [teamsize="+teamSize+ ",Name="+ getName()+" ,Eployeeid="+ getEmployeid()+",department="+getDepartment()+"]";
	}
	
}

