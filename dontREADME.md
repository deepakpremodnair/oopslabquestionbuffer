30. Hierarchical Inheritance
Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named 'print-Salary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherit the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'spe-cialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same.

31. Single Inheritance & Super Keyword
Write two Java classes Employee and Engineer. The Engineer class should inherit from the Employee class. Employee class to have two methods display() and calcSalary(). Write a program to display the engineer salary and to display from Employee class using a single object instantiation (i.e., only one object creation is allowed).
● display() only prints the name of the class and does not return any value. Ex. “ Name of the class is Employee.”
● calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in Engineer displays
“Salary of an employee is 20000.”

32. Abstract Class and Polymorphism
Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides( ) that
shows the number of sides in the given geometrical structures.
33. Multiple inheritance using Interface
Create an interface ‘Sports’ which contain final variable ‘sportwt’ with value 6.0F and an abstract method
putwt().
Create a class ‘Student’ with a member variable ‘rollnumber’ and two member functions getNumber() &
putNumber() to read and display roll number respectively.
Create a subclass ‘Test’ from ‘Student’ class with its own member variables ‘term1’, ‘term2’ to hold each
term marks and member functions getMarks() & putMarks() to read and display marks obtained for each
terms.
Create a class ‘Results’ which derives the features of ‘Test’ class as well as ‘sports’ interface and displays the output in the given format.

Rollno:12
Marks obtained
Term 1=27.5
Term 2=33
Sports weightage=6
Total Score=66.5