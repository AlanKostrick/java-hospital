package hospital;

public class Janitor extends Employee {

	private boolean isSweeping;

	public Janitor(String empNumber, String empName, boolean isSweeping) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isSweeping = isSweeping;
	}

	@Override
	public String paySalary() {
		// TODO Auto-generated method stub
		return "40000";
	}

	public boolean isSweeping() {
		// TODO Auto-generated method stub
		return isSweeping;
	}

}
