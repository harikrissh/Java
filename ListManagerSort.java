import java.util.*;
class ListManagerSort{
	public static List<String> getArrayList(String[] elements){
		List<String> obj=new ArrayList<String>();
		Collections.addAll(obj, elements);
		Collections.sort(obj);
		return obj;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=s.nextInt();
		String[] ele=new String[n];
		for(int i=0;i<n;i++){
			ele[i]=s.next();
		}
		List<String> obj=new ArrayList<String>();
		obj=getArrayList(ele);
		Iterator i=obj.iterator();
		System.out.println("\nAfter sorting...");
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}