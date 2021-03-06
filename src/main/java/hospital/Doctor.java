package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String speciality;

	public String getSpeciality() {
		return speciality;
	}

	public Doctor(String empNumber, String empName, String speciality) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.speciality = speciality;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);

	}

	@Override
	public void administerCare(Patient patient) {
		patient.receiveHealth(5);

	}

	@Override
	public String paySalary() {
		return "90000";
	}

}
