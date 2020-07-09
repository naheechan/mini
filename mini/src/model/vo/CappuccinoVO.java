package model.vo;

public class CappuccinoVO extends CoffeeVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9082517733387878591L;
	private String name = "카푸치노";				//커피이름
	private int price = 4600;					//가격
	private String detailInfo = "에스프레소샷과 시원한 우유에 부드러운 우유 거품이 얹어진 시원한음료.";	//상세 설명
	private String detailNutri = "&emsp;1회 제공량 (kcal) 115<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;포화지방 (g) 3.5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;단백질 (g) 6<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;나트륨 (mg) 90<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;당류 (g) 9<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;카페인 (mg) 75<br/>";	//영양 정보
	private String detailAll = "알레르기 유발요인 : 우유";	//알러지
	
	public CappuccinoVO() {
		// TODO Auto-generated constructor stub
	}

	public CappuccinoVO(int count, char temperature) {
		super(count, temperature);
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

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getDetailNutri() {
		return detailNutri;
	}

	public void setDetailNutri(String detailNutri) {
		this.detailNutri = detailNutri;
	}

	public String getDetailAll() {
		return detailAll;
	}

	public void setDetailAll(String detailAll) {
		this.detailAll = detailAll;
	}

	@Override
	public String toString() {
		return name+","+price+","+detailInfo+","+detailNutri+","+detailAll;
	}
	
	
	

}
