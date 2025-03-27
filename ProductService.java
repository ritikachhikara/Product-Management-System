

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ProductService {
	private List<Product> l1=new ArrayList<>();
	
	public void addProduct(Product p) {
		l1.add(p);
	}
	public void getAllProducts() {
		for(Product p:l1)
			System.out.println(p);
	}
	public void getAllShirts() {
		for(Product p:l1) {
			if(p instanceof Shirt)
				System.out.println(p);
		}
		
	}
	public void getAllMobiles() {
		for(Product p:l1) {
			if(p instanceof Mobile)
				System.out.println(p);
		}
	}
	public void getAllProductsOnCategory() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Category: ");
		String uCatg=sc.nextLine();
		for(Product p:l1) {
			if(p.catg.equalsIgnoreCase(uCatg)) {
				System.out.println(p);
			}
		}
		
	}
	public void getProductCountOncategory() {
		Map<String, Double> m1=new HashMap<>();
		for(Product p:l1) {
			if(m1.containsKey(p.catg))
				m1.put(p.catg, m1.get(p.catg)+1);
			else
				m1.put(p.catg, 1.0);
		}
		System.out.println(m1);
	}
	public void getAllcategory() {
		Set<String> s1=new TreeSet<>();
		for(Product p:l1) {
			s1.add(p.catg);
		}
		System.out.println(s1);
	}
	public void getProductType() {
		Set<String> s1=new HashSet<>();
		for(Product p:l1) {
			if(p instanceof Shirt)
				s1.add("Shirt");
			else if(p instanceof Mobile)
				s1.add("mobile");
		}
	System.out.println(s1);
	}
	public void removeProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to remove on brand");
		System.out.println("Press 2 to remove on Category");
		Iterator<Product> itr=l1.iterator();
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the Brand: ");
			sc.nextLine();
			String brand=sc.nextLine();
			while(itr.hasNext()) {
				Product x=itr.next();
				if(x.brand.equalsIgnoreCase(brand))
					itr.remove();
			}
			
		}
		else if(choice==2) {
			System.out.println("Enter the Category: ");
			sc.nextLine();
			String catg=sc.nextLine();
			while(itr.hasNext()) {
				Product x=itr.next();
				if(x.catg.equalsIgnoreCase(catg))
					itr.remove();
			}
		}
		System.out.println("Product removed Successfully!!");
	}

}




