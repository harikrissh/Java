import java.util.*;
public class KeyOfSameValue {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Map<String, String> map=new HashMap<String, String>();
		System.out.println("Enter number of entries");
		int n= s.nextInt();
		System.out.println("Enter "+n+" entries");
		for(int i=0;i<n;i++){
			String key=s.next();
			String val=s.next();
			map.put(key, val);
		}
		System.out.println(map);
		System.out.println("Enter a value");
		String find=s.next();
		List<String> l=new ArrayList<String>();
		Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> entry=itr.next();
			if(entry.getValue().equals(find)){
				l.add(entry.getKey());
			}
		}
		String[] arr = new String[l.size()];
		arr = l.toArray(arr);
		System.out.println("Keys that have "+find+" as value..");
		for(String i:arr){
			System.out.println(i);
		}
	}
}
