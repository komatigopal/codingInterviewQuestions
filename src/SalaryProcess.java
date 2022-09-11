import java.io.IOException;
import java.util.ArrayList;

public class SalaryProcess {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach((i) -> {
			System.out.println(i * i);
		});
	}

	private static void extracted(ArrayList<Integer> numbers) {
		for (Integer i : numbers) {
			System.out.println(i * i);
		}
	}
}
/*
 * import java.io.BufferedReader; import java.io.File; import
 * java.io.FileReader; import java.io.IOException;
 * 
 * class Salary { long accountNumber; long salary; String companyId;
 * 
 * public long getAccountNumber() { return accountNumber; }
 * 
 * public void setAccountNumber(long accountNumber) { this.accountNumber =
 * accountNumber; }
 * 
 * public long getSalary() { return salary; }
 * 
 * public void setSalary(long salary) { this.salary = salary; }
 * 
 * public String getCompanyId() { return companyId; }
 * 
 * public void setCompanyId(String companyId) { this.companyId = companyId; }
 * 
 * @Override public String toString() { return "salary [accountNumber=" +
 * accountNumber + ", salary=" + salary + ", companyId=" + companyId + "]"; } }
 * 
 * class Employee { String employeeId; String name; String companyId; String
 * address;
 * 
 * public String getEmployeeId() { return employeeId; }
 * 
 * public String getName() { return name; }
 * 
 * public String getCompanyId() { return companyId; }
 * 
 * public String getAddress() { return address; }
 * 
 * public void setEmployeeId(String employeeId) { this.employeeId = employeeId;
 * }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public void setCompanyId(String companyId) { this.companyId = companyId; }
 * 
 * public void setAddress(String address) { this.address = address; }
 * 
 * @Override public String toString() { return "employee [employeeId=" +
 * employeeId + ", name=" + name + ", companyId=" + companyId + ", address=" +
 * address + "]"; } }
 * 
 * class Company { String companyId; String companyName;
 * 
 * public String getCompanyId() { return companyId; }
 * 
 * public String getCompanyName() { return companyName; }
 * 
 * public void setCompanyId(String companyId) { this.companyId = companyId; }
 * 
 * public void setCompanyName(String companyName) { this.companyName =
 * companyName; }
 * 
 * @Override public String toString() { return "Company [companyId=" + companyId
 * + ", companyName=" + companyName + "]"; }
 * 
 * }
 * 
 * public class SalaryProcess {
 * 
 * public static void main(String[] args) throws IOException { File file = new
 * File("C:\\Users\\pankaj\\Desktop\\test.txt"); BufferedReader br = new
 * BufferedReader(new FileReader(file)); String line; while ((line =
 * br.readLine()) != null) { String lineArray[] = line.split(","); String
 * companyId = lineArray[0]; long accountNumber = Long.parseLong(lineArray[1]);
 * long salaryAmount = Long.parseLong(lineArray[2]); Salary salary = new
 * Salary(); salary.setCompanyId(companyId);
 * salary.setAccountNumber(accountNumber); salary.setSalary(salaryAmount);
 * boolean verify = verifyCompanyIdAndAccountNumber(salary); } br.close(); }
 * 
 * private static boolean verifyCompanyIdAndAccountNumber(Salary salary) {
 * boolean status = false; Connection conn =
 * DriverManager.getConnection(url,username,password); Connection conn =
 * MySQLJDBCUtil.getConnection(); Statement stmt = conn.createStatement();
 * //above code is for DB Connection
 * 
 * return status; }
 * 
 * }
 */