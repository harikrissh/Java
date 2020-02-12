import java.util.*;
class AvgOfValueForOddKey{
	public static int avgValue(Map<Integer, Integer> map){
		Iterator<Map.Entry<Integer, Integer>> itr=map.entrySet().iterator();
		int val=0, avg=0, sum=0, turn=0;
		while(itr.hasNext()){
			Map.Entry<Integer, Integer> entry=itr.next();
			if(entry.getKey()%2!=0){
				val=entry.getValue();
				sum=sum+val;
				turn+=1;
			}
		}
		avg=sum/turn;
		return avg;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Map<Integer, Integer> obj=new HashMap<Integer, Integer>();
		System.out.println("Enter no. of entries..");
		int n=s.nextInt();
		System.out.println("Enter "+n+" RegNum and Marks..");
		for(int i=0;i<n;i++){
			int k=s.nextInt();
			int v=s.nextInt();
			obj.put(k, v);
		}
		System.out.println(obj);
		int avg=avgValue(obj);
		System.out.println("\nThe average of marks whose key is odd -> "+avg);
	}
}