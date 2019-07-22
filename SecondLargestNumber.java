
public class SecondLargestNumber {

	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
		public static void main(String args[]){  
		int a[]={2,5,7,4,6,3};  
		int b[]={55,77,99,11,33,22,88};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));
		

	}

}
