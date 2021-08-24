import java.util.Scanner;

public class reverse_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Scanner sc = new Scanner(System.in); // String a=sc.next();
		 * System.out.println("Enter the string to be reveresed"); String a = sc.next();
		 * // a.toCharArray();
		 * 
		 * System.out.println(a.charAt(3)); int i = a.length();
		 * 
		 * 
		 * 
		 * for(int j=0;j<=i-1;j++) { System.out.print(a.charAt(j)); }
		 * 
		 * 
		 * for(int j=i-1;j>=0;j--) { System.out.print(a.charAt(j)); }
		 */
		  
			
		/*
		 * int k = 5;
		 * 
		 * for(int l=0; l<=10;l++) {
		 * 
		 * System.out.println(k+"x"+l+"="+k*l); }
		 */
			  
			  /*for(int i=1; i<=5 ; i++) { System.out.println(i*i); }
			  
			  int i =1; while(i<=10) { System.out.println(i*i); i++; }*/
			  
		
		
		
			  // reverse triangle 
		for (int i = 10; i >= 0; i--) { System.out.print(" ");
			  
			  for (int j = 0; j <= 10 - i; j++) { System.out.print("*");
			  
			  } System.out.println(); }
			  
			 
		// prints straight triangle 
			   for (int i = 0; i <= 10; i++) {
			  
			  for (int j = 0; j <= 10 - i; j++) { System.out.print(" "); }
			  
			  for (int k = 0; k <= i; k++) { System.out.print("* ");
			  
			  } System.out.println(); }
			 
	}}

//trints pyramid

