package LocalDateTimeDemo;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("localdate\t"+d);
		System.out.println("is "+d.getYear()+" leap yr?\t"+(d.isLeapYear()?"yes":"no"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M-d-yyyy");
		System.out.println("formatted localdate\t"+d.format(dtf));
		
		LocalTime t=LocalTime.now();
		System.out.println("\nlocaltime\t"+t);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh~mm");
		System.out.println("formated localtime\t"+t.format(dtf1));
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("\nlocaldatetime\t"+dt);
		
		java.util.Date d1=new java.util.Date();
		System.out.println("\nutildate\t"+d1);
		SimpleDateFormat sdf=new SimpleDateFormat("M/yyyy/d");
		SimpleDateFormat sdf1=new SimpleDateFormat("EEEE, MMM d, ''yy, z");
		System.out.println("formatted utildate\t"+sdf.format(d1));
		System.out.println("EEEE utildate\t"+sdf1.format(d1));
		
		
		Scanner s=new Scanner(System.in);System.out.println();
		System.out.println("Enter dob in dd/MM/yyyy format");
		String dob=s.nextLine();
		DateTimeFormatter parseDob=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate parsed=LocalDate.parse(dob, parseDob);
		Period p=Period.between(parsed, d);
		System.out.println("Age "+p.getYears()+"years "+p.getMonths()+"months "+p.getDays()+"days");
		s.close();
		
	}

}
