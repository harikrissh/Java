import java.lang.*;
import java.util.*;
class Capital{
	public static String getCapital(HashMap<String, String> mapObj, String state){
		String capital="";
		Iterator<Map.Entry<String, String>> itr = mapObj.entrySet().iterator(); 
		while(itr.hasNext()){
			Map.Entry<String, String> entry = itr.next();
			if(state.equalsIgnoreCase(entry.getKey())){
				capital=entry.getValue();
			}
		}
		return capital;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter number of inputs..");
		int n=sc.nextInt();
		String[] stateCapital=new String[n];
		System.out.println("\nEnter "+n+" State_Capital..\n");
		for(int i=0;i<n;i++){
			stateCapital[i]=sc.next();
		}
		HashMap<String, String> mapObj=new HashMap<String, String>();
		for(int i=0;i<stateCapital.length;i++){
			String[] s1=stateCapital[i].split("_");
			String state=s1[0];
			String capital=s1[1];
			mapObj.put(state, capital);
		}
		System.out.println("\nEnter State to find Capital..");
		String st=sc.next();
		Iterator<Map.Entry<String, String>> itr = mapObj.entrySet().iterator(); 
		String s=getCapital(mapObj, st);
		System.out.println("\nCapital of "+st+" is "+s);
	}
}