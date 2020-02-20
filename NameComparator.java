package Product;
import Product.Product;
import java.util.Comparator;

public class NameComparator implements Comparator<Product>{
	@Override
	public int compare(Product p, Product p1){
		return p.name.compareTo(p1.name);		
	}
}
