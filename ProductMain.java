package Product;
import java.util.*;
import Product.Product;
import Product.DateComparator;
import Product.NameComparator;
public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product(1, "Phone", 25000, new Date());
		Product p2=new Product(2, "TV", 50000, new Date());
		Product p3=new Product(3, "Laptop", 96000, new Date());
		Product p4=new Product(4, "Watch", 13000, new Date());
		
		List<Product> product=new ArrayList<Product>();
		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		for(Product p: product){
			System.out.println(p);
		}
		Collections.sort(product, new DateComparator());
		for(Product p: product){
			System.out.println(p.dateOfManufacture);
		}
		Collections.sort(product, new NameComparator());
		for(Product p: product){
			System.out.println(p.name);
		}
		Collections.sort(product, Collections.reverseOrder(new NameComparator()));
		for(Product p: product){
			System.out.println(p.name);
		}
		
	}

}
