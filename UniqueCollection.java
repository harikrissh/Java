import java.util.*;
class UniqueCollection{
	public static Set<String> getCollection(String[] elements){
		Set<String> obj=new TreeSet<String>();
		for(int i=0;i<elements.length;i++){
			obj.add(elements[i]);
		}
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
		Set<String> obj=new TreeSet<String>();
		obj=getCollection(ele);
		Iterator i=obj.iterator();
		System.out.println("\nDisplaying unique elements in sorted order\n");
		while(i.hasNext()){
			System.out.println(i.next());
		}
	} 
}