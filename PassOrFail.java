import java.util.*;

public class PassOrFail {
	public static Map<String, String> getStatus(Map<String, Integer> m1){
		Map<String, String> m2=new HashMap<String, String>();
		Iterator<Map.Entry<String, Integer>> itr=m1.entrySet().iterator();
		String status="";
		while(itr.hasNext()){
			Map.Entry<String, Integer> entry=itr.next();
			String name=entry.getKey();
			if(entry.getValue()<60)
				status="Fail";
			else
				status="Pass";
			m2.put(name, status);
		}
		return m2;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Map<String, Integer> map=new HashMap<String, Integer>();
		System.out.println("Enter no. of entries..");
		int n=s.nextInt();
		System.out.println("Enter name and marks for "+n+" students..");
		for(int i=0;i<n;i++){
			String name=s.next();
			int mark=s.nextInt();
			map.put(name, mark);
		}
		Map<String, String> map1=getStatus(map);
		System.out.println("\nPass Status for the entries..\n"+map1);
	}
}
