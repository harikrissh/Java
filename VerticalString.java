import java.util.*;
public class VerticalString {
	public static List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int mx = 0;
        for (int i = 0; i < words.length; ++i)
            mx = Math.max(mx, words[i].length());
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < mx; ++i) {
            StringBuilder sb = new StringBuilder();
            for (String word : words)
                sb.append(i < word.length() ? word.charAt(i) : " ");
            while (sb.charAt(sb.length() - 1) == ' ')
                sb.deleteCharAt(sb.length() - 1);
            ans.add(sb.toString());
        }
        return ans;
    }
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		List<String> list=printVertically(str);
		for(String i:list){
			System.out.println(i);
		}
	}
}
