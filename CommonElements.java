import java.util.*;
class CommonElements{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter no. of elements for 1st array: ");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter values for 1st array:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter no. of elements for 2nd array: ");
		int m=s.nextInt();
		int[] b=new int[m];
		System.out.println("Enter values for 2nd array:");
		for(int i=0;i<m;i++){
			b[i]=s.nextInt();
		}
		System.out.println();
		System.out.print("Common elements: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
			    if(a[i]==b[j]){
			        System.out.print(a[i]+" ");
			        count++;
			    }
			}
		}
		System.out.println("\nNumber of common elements: "+count*2);
	}
}
