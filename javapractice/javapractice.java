/**
 * 
 */
package javapractice;

/**
 * @author mrsba
 *
 */
public class javapractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "mum";
int b = a.length();
String x="";
for(int i=0;i<b;i++)
{
	x = a.charAt(i)+x;
	
}

System.out.println(x);

if(a.equals(x))
{System.out.println("a is a palindrome");
}
else
{ System.out.println("a is not a palindrome");
	}
	}

}