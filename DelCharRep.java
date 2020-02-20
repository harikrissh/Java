import java.util.Scanner;
class DelCharRep {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
		String str=s.next();
		System.out.println("Enter character");
        char let=s.next().charAt(0);
		int letInd=str.indexOf(let);
        StringBuffer sb = new StringBuffer(str);
        int c = 1;
        for(int i=0;i<sb.length();i++){
              c = 1;
              for(int j=i+1;j<sb.length();j++)
            	  if(sb.charAt(i)==sb.charAt(j))
                          c++;
                    if(c>=letInd){
                          for(int j=i+1;j<sb.length();j++)
                                if(sb.charAt(i)==sb.charAt(j))
                                      sb.deleteCharAt(j);
                          sb.deleteCharAt(i);
                          i--;
                    }
        }
        System.out.println(sb.toString());
	}
}