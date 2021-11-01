package javaAss2;

public class Student {
			int stuId;
			String stuName;
			double stuClass;
			Student() {}
			//constructor parameter
			Student(int a,String n,double b) {
				this.stuId= 2;
				this.stuName=n;
				this.stuClass=5;
				
			}
			Student(int a, String b) {
				this.stuId=5;
				this.stuName=b;
			}
			public double deposite() {
				return stuClass+10;
			}
			public double withdraw() {
				return stuClass-10;
			}
			public void display() {
				System.out.println(stuId);
				System.out.println(stuName);
				System.out.println(stuClass);
				
			}
			public static void main(String args[]) {
				Student b1 = new Student();//object
				b1.stuId=12;
				b1.stuName="kavya";
				b1.stuClass=2;
				b1.display();
				
				Student b2 = new Student();
				b2.stuId=2;
				b2.stuClass=5;
				b2.stuName="nani";
				b2.display();
				Student b3 = new Student(457,"abc",6);
				b3.display();
				
				
			}

		


	}



