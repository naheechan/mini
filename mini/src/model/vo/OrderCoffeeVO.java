package model.vo;

public class OrderCoffeeVO {

	private String name;		//Ä¿ÇÇÀÌ¸§
	private int price;			//°¡°Ý
	private int count;			//°¹¼ö
	private boolean whipping; 	//ÈÖÇÎÅ©¸²
	private boolean drizzle; 	//µå¸®Áñ
	private boolean syrup;		//½Ã·´
	private boolean shot;		//¼¦Ãß°¡
	private char temperature; 	// ¾ÆÀÌ½º('I')/ÇÖ('H')

	public OrderCoffeeVO() {
		// TODO Auto-generated constructor stub
	}

	public OrderCoffeeVO(String name, int price, int count, boolean whipping, boolean drizzle, boolean syrup,
			boolean shot, char temperature) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
		this.whipping = whipping;
		this.drizzle = drizzle;
		this.syrup = syrup;
		this.shot = shot;
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean getWhipping() {
		return whipping;
	}

	public void setWhipping(boolean whipping) {
		this.whipping = whipping;
	}

	public boolean getDrizzle() {
		return drizzle;
	}

	public void setDrizzle(boolean drizzle) {
		this.drizzle = drizzle;
	}

	public boolean getSyrup() {
		return syrup;
	}

	public void setSyrup(boolean syrup) {
		this.syrup = syrup;
	}

	public boolean getShot() {
		return shot;
	}

	public void setShot(boolean shot) {
		this.shot = shot;
	}

	public char getTemperature() {
		return temperature;
	}

	public void setTemperature(char temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "*"+name +"["+ (temperature=='H' ? "ÇÖ" : "¾ÆÀÌ½º") +"] ( " 
				+ (whipping==true ? "ÈÖÇÎÅ©¸²o " : "")
				+ (drizzle==true ? "µå¸®Áño " : "")
				+ (syrup==true ? "½Ã·´o " : "")
				+ (shot==true ? "¼¦o " : "")
				+ ") ¼ö·®: " + count + "°³"
				+ " ---------------------------------------- °¡°Ý = " + price + "¿ø" ;
	}





}
