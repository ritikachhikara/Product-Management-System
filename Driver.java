
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		ProductService service=new ProductService();
		service.addProduct(new Shirt("Arrow", 2300, "clothing", 40, "white"));
		service.addProduct(new Shirt("Arrow", 2300, "clothing", 42, "black"));
		service.addProduct(new Mobile("OnePlus", 53000, "electronics", 8, 128));
		service.addProduct(new Shirt("blackberry", 2900, "clothing", 40, "white"));
		/*System.out.println("=====display all products=======");
		service.getAllProducts();
		System.out.println("=====display all Shirts==========");
		service.getAllShirts();
		System.out.println("=====display all mobile==========");
		service.getAllMobiles();
		System.out.println("=====display products on category====");
		service.getAllProductsOnCategory();
		System.out.println("=======product count on Category=====");
		service.getProductCountOncategory();
		System.out.println("=======product Category=====");
		service.getAllcategory();
		System.out.println("=======product Type=====");
		service.getProductType();*/
		System.out.println("=====Remove Product========");
		service.removeProduct();
		System.out.println("===========Remaing Products================");
		service.getAllProducts();
	}

}
