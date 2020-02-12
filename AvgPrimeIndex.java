import java.util.*;
class AvgPrimeIndex{
	public static int check(int num) 
	{ 
	int i, flag=0; 
	for(i=2;i<=num/2;i++) 
	{ 
		if(num%i==0) 
		{ 
		flag=1; 
		break; 
		} 
	}  
	if(flag==0) 
    		return 1; 
	else
    		return 0; 
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int avg=0;
		System.out.println("Enter n value");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=2;i<n;i++){
			if(check(i)==1){
				avg+=a[i];
			}
		}
		System.out.println("\nAverage of numbers at prime index: "+avg);
	}
}