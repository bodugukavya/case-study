package javaAss2;

public class Myownautoshoptotal {
	public class MyOwnAutoShop
	{
		public static void main(String[] args) {
		   Sedan se=new Sedan(150,250000.00,"red",25);
		   Ford fr1=new Ford(150,250000.00,"red",2016,2500);
		   Ford fr2=new Ford(150,350000.00,"red",2017,2400);
		   Car car=new Car(150,250000.00,"red");
		   System.out.println("SalePrice in Sedan is ==> "+se.getSalePrice());
		   System.out.println("SalePrice in Ford1 is ==> "+fr1.getSalePrice());
		   System.out.println("SalePrice in Ford2 is ==> "+fr2.getSalePrice());
		   System.out.println("SalePrice in Car is ==> "+car.getSalePrice());
		   
		}
	}



	 public class Car{
	    int speed;
	    double regularPrice;
	    String color;
	    Car(int speed,double regularPrice,String color){
	       this.speed=speed;
	       this.regularPrice=regularPrice;
	       this.color=color;
	    }
	    double getSalePrice(){
	        return this.regularPrice;
	    }
	}

	public class Truck extends Car{
	    int weight;
	    Truck(int speed, double regularPrice,String color,int weight)
	    {
	        super(speed,regularPrice,color);
	        this.weight=weight;
	    }
	    double getSalePrice()
	    {
	        if(weight>2000)
	        {
	            return super.regularPrice-super.regularPrice*0.1;
	        }
	        else
	         return super.regularPrice-super.regularPrice*0.2;
	    }
	}

	public class Ford extends Car{
	    int year;
	    int manufacturerDiscount;
	    Ford(int speed, double regularPrice,String color,int year,int manufacturerDiscount ){
	        super(speed,regularPrice,color);
	        this.year=year;
	        this.manufacturerDiscount=manufacturerDiscount;
	    }
	    double getSalePrice(){
	        return super.getSalePrice()-this.manufacturerDiscount;
	    }
	}

	public class Sedan extends Car{
	    int length;
	    Sedan(int speed, double regularPrice,String color,int length){
	        super(speed,regularPrice,color);
	        this.length=length;
	    }
	    double getSalePrice(){
	        if(this.length>20)
	         return super.regularPrice-super.regularPrice*0.05;
	        else
	         return super.regularPrice-super.regularPrice*0.1;
	    }
	}

}
