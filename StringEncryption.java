import java.util.*;
import java.lang.*;

class StringEncryption{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char temp='a';
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                System.out.print(str.charAt(i));
            }
            if(i%2!=0){
                if(str.charAt(i)=='z'||str.charAt(i)=='Z'){
                    System.out.print((char)(str.charAt(i)-25));
                }
                else{System.out.print((char)(str.charAt(i)+1));}
            }
        }
        
    }
}