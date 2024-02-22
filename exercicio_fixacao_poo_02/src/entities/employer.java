package entities;

public class employer {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100; 
		// salário recebe a soma do salário * o valor (bruto) da porcentagem / por 100
	}
	
	public String toString() {
		return name
				+ ", "
				+ "$ "
				+ netSalary();
	}
}
