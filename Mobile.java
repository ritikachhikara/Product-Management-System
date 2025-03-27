
public class Mobile extends Product{
	int ram;
	int hd;
	Mobile(){
		
	}
	Mobile(String brand, double price, String catg,int ram, int hd){
		super(brand, price, catg);
		this.ram=ram;
		this.hd=hd;
	}
	public String toString() {
	return "Brand: "+brand+"\tPrice: "+price+"\tCatogery :"+catg+"\tRAM: "+ram+"\tHD: "+hd;
	}

}
