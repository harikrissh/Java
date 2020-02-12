import java.util.*;

public class TopScorer {
	public static String getTopScorer(List<String> list){
		Map<String, Integer> map=new HashMap<String, Integer>(); 
		String topScorer="";
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			String detail=itr.next();
			String[] detailSplit=detail.split("#");
			String name=detailSplit[0];
			int total=Integer.valueOf(detailSplit[1])+Integer.valueOf(detailSplit[2])+Integer.valueOf(detailSplit[3]);
			map.put(name, total);
		}
		int maxTotal=Collections.max(map.values());
		Iterator<Map.Entry<String, Integer>> mapItr=map.entrySet().iterator();
		while(mapItr.hasNext()){
			Map.Entry<String, Integer> en=mapItr.next();
			if(en.getValue()==maxTotal)
				topScorer=en.getKey();
		}
		return topScorer;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		System.out.println("Enter number of entries..");
		int n=s.nextInt();
		System.out.println("Enter name#mark1#mark2#mark3 for "+n+" students..");
		for(int i=0;i<n;i++){
			String namemarks=s.next();
			list.add(namemarks);
		}
		String topScorer=getTopScorer(list);
		System.out.println("\nName of the student who has scored max marks ->"+topScorer);
	}
}
