import java.util.*;
class MapManager{
	public static Set<Integer> getKeys(HashMap<Integer, String> obj){
		return obj.keySet();
	}
	public static void main(String[] args){
		HashMap<Integer, String> obj=new HashMap<Integer, String>();
		obj.put(1,"a");
		obj.put(2,"b");
		obj.put(3,"c");
		obj.put(4,"d");
		obj.put(5,"e");
		Set<Integer> set=new HashSet<Integer>();
		set=getKeys(obj);
		Iterator i=set.iterator();
		System.out.println("Keys are...");
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}