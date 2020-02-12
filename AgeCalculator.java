import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
class AgeCalculator{
	public static int calculateAge(String dob){
		LocalDate today=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  		LocalDate parsedDate = LocalDate.parse(dob, formatter);
		Period age = Period.between(parsedDate, today);
		return age.getYears();
	}
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String dob;
		System.out.println("Enter your date of birth(dd-mm-yyyy)");
		dob=s.next();
		int age=calculateAge(dob);
		if(age<0)
			System.out.println("DOB can't be greater than today's date!");
		else
			System.out.println("Age: "+age+" years");
	}
}