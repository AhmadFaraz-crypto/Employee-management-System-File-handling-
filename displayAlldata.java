package employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class displayAlldata {
	public void displayData() throws Exception {
		FileInputStream fin = new FileInputStream("Emp.txt");
		ObjectInputStream ins = new ObjectInputStream(fin);
		EmployeeDetails emp = (EmployeeDetails) ins.readObject();
		ins.close();
		fin.close();
		System.out.println(emp.toString());
	}
}
