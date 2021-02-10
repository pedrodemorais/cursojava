package entitie;

public class Employee {
	private String nameEmployee=null;
	private double salaryEmployee=0;
	private int idEmployee=0;
	
	public Employee() {
		
		
	}
	
	public Employee(String nameEmployee, double salaryEmployee, int idEmployee) {
		super();
		this.nameEmployee = nameEmployee;
		this.salaryEmployee = salaryEmployee;
		this.idEmployee = idEmployee;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public double getSalaryEmployee() {
		return salaryEmployee;
	}
	
	public void aumentarSalario( float percentual) {
		salaryEmployee += salaryEmployee * percentual/100;
		
	}

	@Override
	public String toString() {
		return 
				"Nome: " 
				+ nameEmployee 
				+ " - Salário: " 
				+ String.format("%.2f",salaryEmployee) 
				+ " - Código: "
				+ idEmployee ;
	}
	
	
	
	

}
