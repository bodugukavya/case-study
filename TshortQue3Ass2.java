package javaAss2;

public class TshortQue3Ass2 {
	String color;
	String material;
	String design;
	TshortQue3Ass2(String color,String material,String design) {
		this.color=color;
		this.material=material;
	   this.design=design;
	}
	public void display() {
		System.out.println("the color of the t short is :"+color);
		System.out.println("the material of the t short is :"+material);
		System.out.println("the design of the t short is :"+design);

	}
	public static void main(String [] args) {
		System.out.println("SMALL SIZE");
		TshortQue3Ass2 t1=new TshortQue3Ass2("black","cotton","pocket style");
		t1.display();
		System.out.println("MEDIUM SIZE");
		TshortQue3Ass2 t2=new TshortQue3Ass2("white","linen","plain");
		t2.display();
		System.out.println("LARGE SIZE");
		TshortQue3Ass2 t3=new TshortQue3Ass2("red","polyester","hooded");
		t3.display();
		
		
	

	}

}
