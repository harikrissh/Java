import java.util.Scanner;
public class CompareString {
      public static void main(String[] args) {
    	  Scanner s=new Scanner(System.in);
    	  System.out.println("enter first string");
    	  String str1=s.nextLine();
    	  System.out.println("enter second string");
          String str2=s.nextLine();
    	  StringBuffer sb = new StringBuffer();          
          for(int i=0;i<str2.length();i++){
        	  for(int j=0;j<str1.length();j++){
        		  if(str2.charAt(i)==str1.charAt(j))
                      sb.append(str1.charAt(j)).append('+');
        	  }
          }
          String res=String.valueOf(sb);
          System.out.println(res);
      }
}