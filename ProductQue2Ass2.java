package javaAss2;

public class ProductQue2Ass2 {
	int proid;
	String proname;
	double proprice;
	ProductQue2Ass2() {}
	public double proprice(double gst) {
		return this.proprice+gst;
	}
	public void display() {
		System.out.println("product id is:"+proid);	
		System.out.println("product name is:"+proname);
		System.out.println("product price is:"+proprice);


	}
	public static void main(String[] arg) {
		ProductQue2Ass2 p1=new ProductQue2Ass2();
		p1.proid=2;
		p1.proname="kav";
		p1.proprice=13;
		p1.display();
		System.out.print("atotal price| is:");
		System.out.println(p1.proprice(12.0));
	
	}
}
