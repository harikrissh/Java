import java.util.*;
public class UnlockingKey {
	static int getUnlockingKey(int lockingKey){
		String l=String.valueOf(lockingKey);
		char[] c=l.toCharArray();
		Arrays.sort(c);
		String unl=String.valueOf(c);
		int un=Integer.parseInt(unl);
		return un;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Locking key..");
		int num=s.nextInt();
		System.out.println("Unlocking key is: "+getUnlockingKey(num));
	}
}
