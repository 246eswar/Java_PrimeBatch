//OOPs has main 6 cocepts
//1.class
//2.object balance 4 are below are
/*
 * Main pillers of OOPs
 * 1.Encaplation
 * 2.Abration 
 * 3.Inheritence
 * 4.Polymorphism
 */
//Inheritance
/*
 * 1.single -level -- one class inherits properties of another class
 * 2.multi-level -- one after another structure - gf->f->s->c
 * 3.multiple -- one taken from many  
 * 4.Hierarchical -- many taken from one
 * 5.Hybrid --max of any two of above
 */
//parent class ,super class ,base class(same)
//child class
package ObjectOrientationProgrammingSystem;
public class FirstClass {
	public static void main(String[] args) {
		child c=new child();	
		c.take();
	}
	void car(){
		System.out.println("car");
	}
	void show() {
		System.out.println("Show");
	}
	
}
class child extends FirstClass{
	void take(){
		car();
		show();
	}
}

