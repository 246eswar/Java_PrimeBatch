package Oops;
//fields ,variable ,properties same
//methods,behavior 
//Hierarchical-- one to many are inheritance from one 
//Multiple -- many to one(ambiguity ) so it do not support 
//so this it uses interfaces 
public class Par {	
	public static void main(String[] args) {
		Par a=new Par();
		a.car();		
		son b=new son();
		b.car();
	}
	int abc;
	static void car() {
		System.out.println("Car is using");
	}				
}

class son extends Par{
}
class daughter extends Par{	
		
}
