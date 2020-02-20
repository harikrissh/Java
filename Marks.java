import java.util.*;
import java.lang.*;
import java.math.*;
class Marks{
	public static void compareMarks(Long math, Double eng){
		int mathMark=(int)Math.round(math);
		int engMark=(int)Math.round(eng);
		if(mathMark>engMark)
			System.out.println("Maths mark is higher than English");
		else
			System.out.println("English mark is higher than Maths");
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Maths mark");
		Long mat=s.nextLong();
		System.out.println("Enter English mark");
		Double eng=s.nextDouble();
		compareMarks(mat, eng);
	}
}