package Product;
import java.util.*;

public class Product {
	int id;
	String name;
	double price;
	Date dateOfManufacture;
	public Product(int id, String name, double price, Date dateOfManufacture){
		this.id=id;
		this.name=name;
		this.price=price;
		this.dateOfManufacture=dateOfManufacture;
	}
	public String toString(){
		return this.id+" "+this.name+" "+this.price+" "+this.dateOfManufacture;
	}
	
}
