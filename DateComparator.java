package Product;
import Product.Product;
import java.util.Comparator;

public class DateComparator implements Comparator<Product> {
	@Override
	public int compare(Product p, Product p1){
		return p.dateOfManufacture.compareTo(p1.dateOfManufacture);		
	}

}
