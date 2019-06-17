package employee;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class newEmployee {

	public void add() throws IOException {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Name ");
		String name = inp.nextLine();
		System.out.println("Enter Father Name ");
		String fathername = inp.nextLine();
		System.out.println("Enter Gender ");
		String Gender = inp.nextLine();
		System.out.println("Enter address ");
		String Address = inp.nextLine();
		System.out.println("Enter Cnic ");
		String cnic = inp.nextLine();
		System.out.println("Enter password ");
		String password = inp.nextLine();
		EmployeeDetails emp = new EmployeeDetails(name, fathername, Gender, Address, cnic, password);
		char ch='y';
		FileOutputStream fout = new FileOutputStream("Emp.txt", true);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		try {
			oos.writeObject(emp);
			oos.close();
			fout.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		System.out.println("Data apendend and file to be transfered......!");
		}
}
