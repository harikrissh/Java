public class Tester5 {
public static void main(String[] args) { 
	String str = "java";
	StringBuffer sb = new StringBuffer("java"); 
	sb.insert(5, "programming"); 
	str.concat("exercise");
	if (sb.length() < 6 || str.equals("java")) { 
		System.out.print(sb);
	}
	sb.delete(2, 7); 
	System.out.print(sb);
}
}

/*

result:
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
        at java.lang.AbstractStringBuilder.insert(Unknown Source)
        at java.lang.StringBuffer.insert(Unknown Source)
        at Tester5.main(Tester5.java:5)
*/