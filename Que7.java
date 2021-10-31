package javatest;

public class Que7 {
	 public static void main(String[] args) {
		 Que7 a=new Que7();
		        System.out.println("enter the string");
		        String st="kav";
		       char ch[]=st.toCharArray();
		        for (int i = 0; i < ch.length; i++)
		        {
		               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		               {
		                ch[i]='$'; 
		               }   
		        }
		        for (int i = 0; i < ch.length; i++) {
		            System.out.print(ch[i]);
		        }
		    }
		}