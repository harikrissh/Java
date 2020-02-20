import java.util.*;
class ArrayManipulatorGetSmallest{
	public static int getSmallest(int []elements){
		int smallest=0;
		for(int i=0;i<elements.length;i++){
			smallest=elements[0];
			if(smallest>elements[i])
				smallest=elements[i];
		}
		return smallest;
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
		int min=getSmallest(arr);
		System.out.println("\nSmallest element->"+min);
	}
}