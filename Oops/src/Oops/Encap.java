package Oops;
//in Encapsulation 
//getters and setters are there
//getter for get the data
//setter for set the data
//Spring project encapsulation is there
//encapsulation(private) is used where security is needed
//private variable is we use "this" keyword for passing data
public class Encap {
	public static void main(String[] args) {
		Data d=new Data();
		d.setData("Eswar", 22, "FGCVHHFgt");
		d.getData();
		//d.getName();
		//System.out.println(d.getAge());		
		//System.out.println(d.getPassword());

	}
}
class Data{
	private String name;
	private int age;
	private String password;
	void setData(String a,int b,String c) //setxxxxxxx -setter
	{
		this.name=a;
		this.age=b;
		this.password=c;		
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(password);
	}
	/*
	String getPassword() //getxxxxxx - getter
	{
		return this.password;
	}
	int getAge(){
		return this.age;
	}void getName(){
		System.out.println(this.name);
	}*/
}
