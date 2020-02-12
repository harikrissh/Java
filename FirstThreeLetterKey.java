import java.util.*;

public class FirstThreeLetterKey {
	public static Map<String, String> generateKeyValue(String[] elements){
		Map<String, String> map=new HashMap<String, String>();
		for(int i=0;i<elements.length;i++){
			String key=elements[i].substring(0, 3).toUpperCase();
			String value=elements[i];
			map.put(key, value);
		}		
		return map;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of inputs..");
		int n=s.nextInt();
		String[] names=new String[n];
		System.out.println("Enter "+n+" inputs..");
		for(int i=0;i<n;i++){
			names[i]=s.next();
		}
		Map<String, String> m1=new HashMap<String, String>();
		m1=generateKeyValue(names);
		System.out.println("\nHashMap for given inputs..\n"+m1);
	}
}
