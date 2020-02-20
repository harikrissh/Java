import java.util.*;

public class OddNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		int s1=0,s2=0;
		System.out.println("Enter range");
		int r=s.nextInt();
		for(int i=0;i<=r;i++){
			if(i%2!=0){
				l.add(i);
			}
		}
		System.out.println(l);
		for(int i=0;i<=r/2;i++){
			if(i%2==0)
				s1=s1-l.get(i);
			else
				s2=s2+l.get(i);
		}
		s1=s1+1;
		s2=s2+1;
		int tot=s1+s2;
		System.out.println(tot);
	}
}
