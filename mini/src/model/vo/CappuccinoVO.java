package model.vo;

public class CappuccinoVO extends CoffeeVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9082517733387878591L;
	private String name = "īǪġ��";				//Ŀ���̸�
	private int price = 4600;					//����
	private String detailInfo = "���������Ҽ��� �ÿ��� ������ �ε巯�� ���� ��ǰ�� ����� �ÿ�������.";	//�� ����
	private String detailNutri = "&emsp;1ȸ ������ (kcal) 115<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��ȭ���� (g) 3.5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;�ܹ��� (g) 6<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��Ʈ�� (mg) 90<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��� (g) 9<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;ī���� (mg) 75<br/>";	//���� ����
	private String detailAll = "�˷����� ���߿��� : ����";	//�˷���
	
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
