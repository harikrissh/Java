import java.util.*;
class AlternateArrayValues{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements for arrays: ");
		int n=s.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		System.out.println("Enter values for 1st array:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter values for 2nd array:");
		for(int i=0;i<n;i++){
			b[i]=s.nextInt();
		}
		System.out.println();
		for(int i=0;i<n;i++){
			if(i%2==0){
			    System.out.print(b[i]+" ");
			}
			if(i%2!=0){
			    System.out.print(a[i]+" ");
			}
		}
	}
}
