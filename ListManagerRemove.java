import java.util.*;
class ListManagerRemove{
	public static ArrayList<String> removeElements(ArrayList<String> list1, ArrayList<String> list2){
		list1.retainAll(list2);
		return list1;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		ArrayList<String> finalList=new ArrayList<String>();
		System.out.println("Enter number of elements in list 1..");
		int n=s.nextInt();
		System.out.println("Enter "+n+" elements for list 1..");
		String[] list1Elements=new String[n];
		for(int i=0;i<n;i++){
			list1Elements[i]=s.next();
		}
		Collections.addAll(list1, list1Elements);
		System.out.println("Enter number of elements in list 2..");
		int m=s.nextInt();
		System.out.println("Enter "+m+" elements for list 2..");
		String[] list2Elements=new String[m];
		for(int i=0;i<m;i++){
			list2Elements[i]=s.next();
		}
		Collections.addAll(list2, list2Elements);
		finalList=removeElements(list1, list2);
		System.out.println("\nAfter removing all items in list 1 other than that in list 2..");
		for(String i: finalList){
			System.out.println("\n"+i);
		}
	}
}