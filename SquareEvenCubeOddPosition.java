import java.util.*;
class SquareEvenCubeOddPosition{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int sumSquare=0, sumCube=0;
		System.out.println("Enter n value");
		int n=s.nextInt();
		System.out.println("Enter "+n+" integers");
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			if(i%2==0){
				sumCube=sumCube+(a[i]*a[i]*a[i]);
			}
			else if(i%2!=0){				
				sumSquare=sumSquare+(a[i]*a[i]);
			}
		}
		System.out.println("Sum of Cube of Odd position numbers: "+sumCube);
		System.out.println("Sum of Square of even position numbers: "+sumSquare);
		System.out.println("Total Sum: "+(sumSquare+sumCube));

	}
}