package model.vo;

public class AmericanoVO extends CoffeeVO{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7913301654066719921L;
	private String name = "아메리카노";				//커피이름
	private int price = 4100;					//가격
	private String detailInfo = "풍부하고 진한 농도의 에스프레소에 시원한 정수물을 더하여 스타벅스의 깔끔하고 강렬한 에스프레소를 부드럽지만 시원하게 즐기실 수 있는 커피입니다.";	//상세 설명
	private String detailNutri = "&emsp;1회 제공량 (kcal) 10<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;포화지방 (g) 0<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;단백질 (g) 1<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;나트륨 (mg) 5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;당류 (g) 0<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;카페인 (mg) 150";	//영양 정보
	private String detailAll = "알레르기 유발요인 : 없음";	//알러지
	
	public AmericanoVO() {
		// TODO Auto-generated constructor stub
	}

	public AmericanoVO(int count, char temperature) {
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
