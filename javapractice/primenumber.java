/**
 * 
 */
package javapractice;

/**
 * @author mrsba
 *
 */
public class primenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//second highest number in array
		
		int a[] = {1,3,4,19,10,15,20};
		
	//int[] x = new int[4];
		
		
	int Length = a.length;
	int temp;
	
	
	
	for(int i=0; i<Length;i++)
	{
		for(int j=i+1; j<Length-1;j++)
		{
		if(a[i] > a[j])
		{
		temp = a[i];
		
		
		a[i]=a[j];
		a[j]=temp;
		
	}
		
		}
		System.out.println(a[i]);
	}

	//System.out.println("biggest number is" + a[Length-1]);

	System.out.println("second biggest number is"  );
	
	}}
	
	

	
	
	
