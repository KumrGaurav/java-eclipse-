import java.util.*;

//OOPs is a non project file only syntax errors are reported

//Polymorphism;
//1.function over loading //compile time polymorphism
//same name 
//2.function over riding//run time; it is use in inharitance;
//Inheritance;;
//properties of one class can access of another class than use inheritance
// reusibility  hume same code bar bar nahi likhna pdta hai ek hi code ko hm sub class me implement kr lete hain 
// jis class se properties li jati hai use kehte hai base class or parent class or jis class me extends kiya jata hai use child class kehte hain
//4 types of inharitance 
//1 Single level inheritance 
//2. multilevel inheritance;
//3. Hierarchial Inheritance
//4.Hybrid Inheritance 
//Packages
//package of related logic; pckages ke under hum related code likhte hain
//two type of packages; builting packages and user define packages;
//Access Modifiers; 4 types of access modifiers private,public,protected,default
//Public:- ye information puri class and koi v package me access kr skta hai;
//Protected:- aPne Package me access kr skte hai yadi dusre package me access krna ho to sirf sub classes access kr skta hai. current package me koi v access kr skta hai
//Private :- class ke bahar koi v access nahi kr skta ;
//yadi private object ko access krna ho to hm banate hai getters() and setters()

//default:-
//Encapsulation:- data or uske function ko combined kr de ek hi entity me;
 //Encapsulation ke madad se data hiding ka concept use hota hai; help of access modifier se
//Abstraction : Data hiding is the process of protecting member of class from uniteded changes whereas abstraction is hiding the implementation details and showing only important parts to the user
//important chiz user ko dikha dena or non important chij ko chhipa lena 
//Abstract class ka object nai bana skte;
//Abstract class must be declared with an abstract keyword;
//It can have abstract and non abstract methods;
//it cannot be instantiated
//it can have constructors and static method also;
//It can have final methods which will force the subclass not change the body of body


/*
class Shape{
	public void area() {
		System.out.println("Display area");
	}
	
	
}*/

	
	
/*	
class Triangle extends Shape{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
class EquilateralTriangle extends Triangle{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
class Circle extends Shape{
	public void area(int r) {
		System.out.println((3.14)*r*r );
	}
}
	

/* 
class Pen{
	String color;
	String type;
	public void write() {
		System.out.println("Writing Somnthing");
	}
	public void printcolor() {
		System.out.println(this.color);
	}
}
class Student{
	String name;
	int age; 
	public void printInfo() {
		System.out.println(name);
		//System.out.println(this.name);
		//System.out.println(this.age);
	}
	public void printInfo(int age) {
		 System.out.println(age);
	}
	public void printInfo(String name,int age) {
		System.out.println(name+" "+age); 
	}
	//constructor
	//Student(){ 
	//	System.out.println("called");
	//}
	/*Student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	Student(Student s2){
		this.name=s2.name;
		this.age=s2.age; 
	}*/
abstract class Animal{
	abstract void walk(); 
	Animal(){
		System.out.println("you are creating a new animal");
	}
	public void eat() {
		System.out.println("Animal eats");
	}
}
class Horse extends Animal{
	public void walk() {
		System.out.println("walks on 4 leg");
	}
}
class Chiken extends Animal{
	public void walk() {
		System.out.println("Walks on two legs");
	}
}

public class Statement
{
	
	public static void main(String[] args) 
	{
		 
		Horse horse= new Horse();
		horse.walk();
		Chiken chiken = new Chiken();
		chiken.walk();
		
		
		
		
		/*
		//Student sc=new Student("ram",33);
		Student s =new Student();
		s.name="Aman";
		s.age=22;
		s.printInfo(s.name,s.age);
		
		//If same name of different different function is called function overloading
		//if return type same of function than parameter is differnt 
		//if same parameter than different return type;
		
		//s.printInfo();
		
		
		
		
		//Student s2=new Student(sc);
		//s2.printInfo();
		
		
		//s.name="Gaurav";
		//s.age = 22;
		//s.printInfo();
		//sc.printInfo();
		
		//Pen pen1 =new Pen();
		//pen1.color = "blue";
		//pen1.type="gel";
		
		//Pen pen2=new Pen();
		//pen1.printcolor();
		//pen2.printcolor();
		
		//pen1.write();*/
		
		
	}
}
