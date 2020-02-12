import java.util.Scanner;
class AllVowelsPresent{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		if(s.contains("a")&&s.contains("e")&&s.contains("i")&&s.contains("o")&&s.contains("u"))
			System.out.println("true");
		else
			System.out.println("false");
	}
}