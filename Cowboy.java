import java.util.*;
class Cowboy {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 String ip1=s.next();
 String ip2=s.next();
 StringBuffer sb=new StringBuffer();
 int n1=ip2.length();
 if(n1==3)
  for(int i=0;i<n1-1;i++)
   sb.append(ip1.substring(0, n1));
 else if(n1==2)
  for(int i=0;i<n1+1;i++)
   sb.append(ip1.substring(0, n1));
 System.out.println(String.valueOf(sb));
}
}