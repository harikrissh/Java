import java.util.*;
import java.lang.*;
import java.math.*;
class Student{
	Long studentId;
	Character studentGrade;
	Double monthlyFees;
	Boolean isScholarshipEligible;
	Double Fees;
	String Exemption;
	public Student(Long studentId, Character studentGrade, Double monthlyFees){
		this.studentId=studentId;
		this.studentGrade=studentGrade;
		this.monthlyFees=monthlyFees;
	}
	public int calculateFeesStructure(){
		isScholarshipEligible=false;
		int fees=0;
		if(studentId!=0 && studentGrade=='A'){
			Fees = monthlyFees - (monthlyFees *10/100);
			Exemption="10 %";
			isScholarshipEligible=true;
		}
		else if(studentId!=0 && studentGrade=='B'){
			Fees = monthlyFees - (monthlyFees *8/100);
			Exemption="8 %";
			isScholarshipEligible=true;
		}
		else if(studentId!=0 && studentGrade=='C'){
			Fees = monthlyFees - (monthlyFees *6/100);
			Exemption="6 %";
			isScholarshipEligible=true;
		}
		else if(studentId!=0 && studentGrade=='D'){
			Fees = monthlyFees - (monthlyFees *4/100);
			Exemption="4 %";
			isScholarshipEligible=true;
		}
		else if(studentGrade>'D' || studentId==0){
			Exemption="Not eligible for exemption";
			return fees;
		}
		fees=(int)Math.round(Fees);
		return fees;	
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Id"); 
		Long id=sc.nextLong();
		System.out.println("Enter student Grade");
		Character grade=sc.next().charAt(0);
		System.out.println("Enter fees");
		Double f=sc.nextDouble();
		Student student=new Student(id, grade, f);
		int fees=student.calculateFeesStructure();
		if(!student.isScholarshipEligible)
			System.out.println("\nIs Scholarship Eligible? "+student.isScholarshipEligible+"\n"+student.Exemption);
		else{
			System.out.println("\nIs Scholarship Eligible? "+student.isScholarshipEligible);
			System.out.println(student.Exemption+" of fees is exempted, the calculated fees is "+fees);
		}	
		
	}
	
}