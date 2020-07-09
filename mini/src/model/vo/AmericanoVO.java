package model.vo;

public class AmericanoVO extends CoffeeVO{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7913301654066719921L;
	private String name = "�Ƹ޸�ī��";				//Ŀ���̸�
	private int price = 4100;					//����
	private String detailInfo = "ǳ���ϰ� ���� ���� ���������ҿ� �ÿ��� �������� ���Ͽ� ��Ÿ������ ����ϰ� ������ ���������Ҹ� �ε巴���� �ÿ��ϰ� ���� �� �ִ� Ŀ���Դϴ�.";	//�� ����
	private String detailNutri = "&emsp;1ȸ ������ (kcal) 10<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��ȭ���� (g) 0<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;�ܹ��� (g) 1<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��Ʈ�� (mg) 5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��� (g) 0<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;ī���� (mg) 150";	//���� ����
	private String detailAll = "�˷����� ���߿��� : ����";	//�˷���
	
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
