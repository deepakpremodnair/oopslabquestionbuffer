import java.util.*;
class Employee{
	String name;
	int age;
	int number;
	String address;
	double salary;
	public Employee(String name,int age,int number,String address,double salary){
		this.name=name;
		this.age=age;
		this.number=number;
		this.address=address;
		this.salary=salary;
	}
	public void printSalary(){
		System.out.println("Salary: "+salary);
	}
}
class Officer extends Employee{
	String specialization;
	public Officer(String name,int age,int number,String address,double salary,String specialization){
		super(name,age,number,address,salary);
		this.specialization=specialization;
	}
}
class Manager extends Employee{
	String department;
	public Manager(String name,int age,int number,String address,double salary,String department){
		super(name,age,number,address,salary);
		this.department=department;
	}
}
public class emp{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println();
	System.out.println("Enter Officer's Details");
	System.out.println("Enter Name, Age, Phone Number, Address, Salary and Specialization in order: ");
	String name1=sc.nextLine();
	int age1=sc.nextInt();
	sc.nextLine();
	int number1=sc.nextInt();
	sc.nextLine();
	String address1=sc.nextLine();
	double salary1=sc.nextDouble();
	sc.nextLine();
	String specialization=sc.nextLine();
	System.out.println();
	System.out.println("Enter Manager's Details");
	System.out.println("Enter Name, Age, Phone Number, Address, Salary and Department in order: ");
	String name2=sc.nextLine();
	int age2=sc.nextInt();
	sc.nextLine();
	int number2=sc.nextInt();
	sc.nextLine();
	String address2=sc.nextLine();
	double salary2=sc.nextDouble();
	sc.nextLine();
	String department=sc.nextLine();
	Officer officer=new Officer(name1,age1,number1,address1,salary1,specialization);
	Manager manager=new Manager(name2,age2,number2,address2,salary2,department);
	System.out.println();
	System.out.println("Officer");
	System.out.println("name "+officer.name);
	System.out.println("age "+officer.age);
	System.out.println("phone Number "+officer.number);
	System.out.println("address "+officer.address);
	System.out.println("salary "+officer.salary);
	System.out.println("specialization "+officer.specialization);
	System.out.println("manager");
	System.out.println("name "+manager.name);
	System.out.println("age "+manager.age);
	System.out.println("phone Number "+manager.number);
	System.out.println("address "+manager.address);
	System.out.println("salary "+manager.salary);
	System.out.println("department "+manager.department);
	}
}
