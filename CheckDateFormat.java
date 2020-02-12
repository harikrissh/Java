import java.lang.*;
import java.util.*;
class CheckDateFormat{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter date(dd/mm/yyyy): ");
		String date=s.next();
		String[] values = date.split("/");
                int dd = Integer.parseInt(values[0]);
                int mm = Integer.parseInt(values[1]);
                int yyyy = Integer.parseInt(values[2]);
                if((dd>0&&dd<32)&&(mm>0&&mm<13)&&(yyyy>1000))
        	       System.out.println("true");
                else
        	       System.out.println("false");
	}
}