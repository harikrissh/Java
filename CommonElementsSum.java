import java.util.*;
class CommonELementsSum{
	public static int commonELementsSum(List<Integer> l1, List<Integer> l2){
		l1.retainAll(l2);
		int sum=0;
		Iterator<Integer> itr=l1.iterator();
		while(itr.hasNext()){
			sum=sum+itr.next();
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		System.out.println("Enter no. of elements for 1st list");
		int n=s.nextInt();
		System.out.println("Enter elements for 1st list");
		for(int i=0;i<n;i++){
			int l1Ele=s.nextInt();
			list1.add(l1Ele);
		}
		System.out.println("Enter no. of elements for 2nd list");
		int m=s.nextInt();
		System.out.println("Enter elements for 2nd list");
		for(int i=0;i<m;i++){
			int l2Ele=s.nextInt();
			list2.add(l2Ele);
		}
		int sum=commonELementsSum(list1, list2);
		System.out.println("\nSum of common elements -> "+sum);
	}
}