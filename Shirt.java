

public class Shirt extends Product{
	int size;
	String color;
	Shirt(){
		
	}
	Shirt(String brand, double price, String catg, int size, String color){
		super(brand, price, catg);
		this.size=size;
		this.color=color;
	}
	public String toString() {
	return "Brand: "+brand+"\tPrice: "+price+"\tCatogery :"+catg+"\tSize: "+size+"\tColor: "+color;
	}
}
