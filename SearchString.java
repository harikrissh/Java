import java.util.*;
class SearchString{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter search string:");
		String searchString=s.next();
		System.out.println("Enter 1st string:");
		String s2=s.next();
		System.out.println("Enter 2nd string:");
		String s3=s.next();
		if(searchString.contains(s2)&&searchString.contains(s3)){
			if(searchString.indexOf(s2)<searchString.indexOf(s3))
				System.out.println("1");
			else
			System.out.println("0");
		}
		else
			System.out.println("0");
	}
}