package model.vo;

public class DolceLatteVO extends CoffeeVO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6602744777676855617L;
	private String name = "돌체 라떼";				//커피이름
	private int price = 5600;					//가격
	private String detailInfo = "커피 향과 부드러움의 조화가 아주 멋진 아이스 커피 입니다.";	//상세 설명
	private String detailNutri = "&emsp;1회 제공량 (kcal) 265<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;포화지방 (g) 9<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;단백질 (g) 8<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;나트륨 (mg) 115<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;당류 (g) 29<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;카페인 (mg) 150<br/>";	//영양 정보
	private String detailAll = "알레르기 유발요인 : 우유";	//알러지
	
	public DolceLatteVO() {
		// TODO Auto-generated constructor stub
	}

	public DolceLatteVO(int count, char temperature) {
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
