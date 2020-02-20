import java.util.*;
class ArrayManipulatorGetSum{
	public static int getSum(int []elements){
		int sum=0;
		for(int i=0;i<elements.length;i++){
			sum=sum+elements[i];
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=s.nextInt();
		System.out.println("Enter "+n+" elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int sum=getSum(arr);
		System.out.println("\nSum:"+sum);
	}
}