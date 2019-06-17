package employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class searchRecord {
	
	public void search() throws Exception {
		FileInputStream fin = new FileInputStream("Emp.txt");
		ObjectInputStream ins = new ObjectInputStream(fin);
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Cnic ");
		String cnic = inp.next();
		System.out.println("Enter Password ");
		String password = inp.next();
			EmployeeDetails employee = (EmployeeDetails) ins.readObject();
			if(employee.setCnic().equals(cnic)) {
				if(employee.setPassword().equals(password)) {
					System.out.println("login");
					System.out.println(employee.toString());
					ins.close();
					fin.close();
				}
				else {
					System.out.println("Please Enter Correct password ....");
				}
			}
			else {
				System.out.println("Incorrect Login Details ");
			}
	}
}