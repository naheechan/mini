package model.vo;

import java.io.Serializable;

public class CoffeeVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3125727405388275870L;
	private int count;					//∞πºˆ
	private boolean whipping = false; 	//»÷«Œ≈©∏≤
	private boolean drizzle = false; 	//µÂ∏Æ¡Ò
	private boolean syrup = false;		//Ω√∑¥
	private boolean shot = false;		//º¶√ﬂ∞°
	private char temperature; 			// æ∆¿ÃΩ∫('I')/«÷('H')
	
	public CoffeeVO() {
		// TODO Auto-generated constructor stub
	}

	public CoffeeVO(int count, char temperature) {
		super();
		this.count = count;
		this.temperature = temperature;
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
		return "CoffeeVO [count=" + count + ", whipping=" + whipping + ", drizzle=" + drizzle + ", syrup=" + syrup
				+ ", shot=" + shot + ", temperature=" + temperature + "]";
	}
	
	
	
	
}