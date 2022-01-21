package entitiy;

public class CoffeeInfo {
	
    private String name = "";
    private String size = "";
    private String temp = "";
    private int price;
    
    //게터
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public String getTemp() {
		return temp;
	}
	public int getPrice() {
		return price;
	}
	
	//세터
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public void setPrice(int price) {
		this.price = price;
	}

};