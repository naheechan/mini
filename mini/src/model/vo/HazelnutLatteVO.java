package model.vo;

public class HazelnutLatteVO extends CoffeeVO {
	 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7930039865477788863L;
	private String name = "헤이즐넛 라떼";				//커피이름
	private int price = 4800;					//가격
	private String detailInfo = "신선하게 제조된 더블 샷 믹스에 헤이즐넛 시럽을 넣고 에스프레소 샷 그리고 얼음이 어우러져 핸드 쉐이킹한 음료입니다.";	//상세 설명
	private String detailNutri = "&emsp;1회 제공량 (kcal)125<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;포화지방 (g)5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;단백질 (g)3<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;나트륨 (mg)28.5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;당류 (g)14<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;카페인 (mg)150<br/>";	//영양 정보
	private String detailAll = "알레르기 유발요인 : 우유";	//알러지
	
	public HazelnutLatteVO() {
		// TODO Auto-generated constructor stub
	}

	public HazelnutLatteVO(int count, char temperature) {
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
