import java.util.Scanner;
class MaxNoOfVowel {
	 public static void main(String args[]) {
         
         Scanner scan= new Scanner(System.in);
   
          System.out.println("enter string");
        
           String s=scan.nextLine();
			 
           String ss[]=s.split(" ");
          String str="";
      
                            int H=0,c=0;
                            char ch;
                            String word="";
                            for(int i=0;i<ss.length;i++)
                            {
                               c=0;
                               str=ss[i];
                               for(int j=0;j<str.length();j++)
                                {
                                   ch=str.charAt(j);
                                   if(ch=='a'|| ch=='e'||ch=='o'||ch=='u'||ch=='i')
                                   {
                                       c++;
                                    }
                                 }
                                 if(c>H)
                                 {
                                      H= c;
                                     word=str;
                                 }
                              }
                          System.out.println(word);
          }
}