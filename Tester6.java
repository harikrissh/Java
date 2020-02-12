public class Tester6 {
public static void main(String[] args) { 
String s1 = null;
String s2 = null; 
if (s1 == s2) 
	System.out.println("A"); 
if (s1.equals(s2)) 
	System.out.println("B");
} 
}

/*o/p:
A
Exception in thread "main" java.lang.NullPointerException
        at Tester6.main(Tester6.java:7)*/