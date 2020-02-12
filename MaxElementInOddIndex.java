import java.util.*;
class MaxElementInOddIndex {
	public static int maxElement(List<Integer> l1){
		List<Integer> l2=new ArrayList<Integer>();
		Iterator<Integer> itr=l1.iterator();
		while(itr.hasNext()){
			int check=itr.next();
			if(l1.indexOf(check)%2!=0)
				l2.add(check);
		}
		int max=Collections.max(l2);
		return max;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println("Enter no. of elements for list");
		int n=s.nextInt();
		System.out.println("Enter elements for list");
		for(int i=0;i<n;i++){
			int l1Ele=s.nextInt();
			list1.add(l1Ele);
		}
		System.out.println(list1);
		int max=maxElement(list1);
		System.out.println("\nMax element in odd index -> "+max);
	}
}