package employee;

import java.io.Serializable;

public class EmployeeDetails implements Serializable{
	private static final long serialVersionUID = -299482035708790407L;
	String name;
	String fatherName;
	String Gender;
	String Address;
	String cnic;
	String password;
	public EmployeeDetails(String name, String fatherName, String Gender, String Address, String cnic, String password) {
		this.name = name;
		this.fatherName = fatherName;
		this.Gender = Gender;
		this.Address = Address;
		this.cnic = cnic;
		this.password = password;
	}
	public void getName(String name) {
		this.name = name;
	}
	public String setName() {
		return name;
	}
	public void getfatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String setfathername() {
		return fatherName;
	}
	public void getGender(String Gender) {
		this.Gender = Gender;
	}
	public String setGender() {
		return Gender;
	}
	public void getAddress(String Address) {
		this.Address = Address;
	}
	public String setAddress() {
		return Address;
	}
	public void getCnic(String cnic) {
		this.cnic = cnic;
	}
	public String setCnic() {
		return cnic;
	}
	public void getPassword(String password) {
		this.password = password;
	}
	public String setPassword() {
		return password;
	}
	public String toString() {
		return "\n Name :: " + this.name + "\nFather Name :: " + this.fatherName + "\nGender " + this.Gender + "\n Address " + this.Address;
	}
}
