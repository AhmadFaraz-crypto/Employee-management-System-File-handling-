package employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		char ch;
        do {
            Scanner inp = new Scanner(System.in);
            displayIntialScreen();
            int choice;
            choice = inp.nextInt();
            if (choice==1){
            	newEmployee newEmp = new newEmployee();
                newEmp.add();
            }
            if (choice==2){
                displayAlldata dis = new displayAlldata();
                dis.displayData();
            }
            if (choice==3){
                searchRecord search = new searchRecord();
                search.search();
            }
            if (choice==4) {
            	deleteRecord del = new deleteRecord();
            	del.delete();
            }
            System.out.println("Do you want to back ");
            ch = inp.next().charAt(0);
        }
        while (ch=='y' || ch=='Y');
	}
	private static void displayIntialScreen() {
		System.out.println("Made by :: Ahmad Faraz ");
		System.out.println("1.	New Employee ");
		System.out.println("2.	Display All Record ");
		System.out.println("3.	Search Record ");
		System.out.println("4.	Delete Record ");
	}
}
