import java.util.Scanner;
public class EbBill {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println( "Enter 2 inputs in format abc20xxxxx");
		String input1=s.next();
        	String input2=s.next();
        	int n1 = Integer.parseInt(input1.substring(5, input1.length()));
        	int n2 = Integer.parseInt(input2.substring(5, input2.length()));
        	int n = Math.abs((n2-n1)*4);
        	System.out.println(n);
  	}
}
