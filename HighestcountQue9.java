package javatest;

public class HighestcountQue9 {
	

	public static void main(String[] args) {
	 int [] a = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
	 

	 int maxCounter = 0;
	 int element=0;
	 for (int i = 0; i <a.length ; i++) {
	 int counter =1;
	 for (int j = i+1; j <a.length ; j++) {
	 if(a[i]==a[j]){
	 counter++;
	 }
	 }
	 if(maxCounter<counter){
	 maxCounter=counter;
	 element = a[i];
	 }
	 }
	 System.out.println(" maximum no of times reapiting: " + element + ", maximum count is: " + maxCounter);
	 }


		

	}