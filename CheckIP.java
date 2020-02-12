import java.util.*;
import java.lang.*;
class CheckIP{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter IP address");
		String ipAddr=s.next();
		String[] ipSplit=ipAddr.split("\\.");
		int part1=Integer.parseInt(ipSplit[0]);
		int part2=Integer.parseInt(ipSplit[1]);
		int part3=Integer.parseInt(ipSplit[2]);
		int part4=Integer.parseInt(ipSplit[3]);
		if((part1>=0&&part1<=255)&&(part2>=0&&part2<=255)&&(part3>=0&&part3<=255)&&(part4>=0&&part4<=255))
			System.out.println("\ntrue");
		else
			System.out.println("\nfalse");
	}
}