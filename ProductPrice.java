import java.util.*;
import java.io.*;
class ProductPrice{
	public static float getPrice(String[] input, HashMap<String, String> mapObj){
		Iterator<Map.Entry<String, String>> itr=mapObj.entrySet().iterator();
		float price=0f;
		while(itr.hasNext()){			
			Map.Entry<String, String> entry=itr.next();
			for(String i: input){				
				if((entry.getKey()).equalsIgnoreCase(i)){
					float p=Float.valueOf(entry.getValue());
					price=price+p;
				}
			}
		}
		return price;
	}
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s=new Scanner(System.in);
		HashMap<String, String> obj=new HashMap<String, String>();
		System.out.println("\nEnter total number of products..");
		int n=s.nextInt();
		String[] productName=new String[n];
		String[] productPrice=new String[n];
		System.out.println("\nEnter Product name and price..");
		for(int i=0;i<n;i++){
			productName[i]=s.next();
			productPrice[i]=s.next();
			obj.put(productName[i], productPrice[i]);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter product's names..");
		String cart[] = br.readLine().split(" ");
		float cost=getPrice(cart, obj);
		System.out.println("\nCost: "+cost);

	}
}