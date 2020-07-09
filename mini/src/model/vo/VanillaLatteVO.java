package model.vo;

public class VanillaLatteVO extends CoffeeVO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9068745853132238158L;
	private String name = "�ٴҶ� ��";				//Ŀ���̸�
	private int price = 4900;					//����
	private String detailInfo = "�ż��ϰ� ������ ���� �� �ͽ��� �ٴҶ� �÷��� �ְ� ���������� �� �׸��� ������ ��췯�� �ڵ� ����ŷ�� �����Դϴ�.";	//�� ����
	private String detailNutri = "&emsp;1ȸ ������ (kcal)125<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��ȭ���� (g)4.5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;�ܹ��� (g)2<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��Ʈ�� (mg)30<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��� (g)14<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;ī���� (mg)145<br/>";	//���� ����
	private String detailAll = "�˷����� ���߿��� : ����";	//�˷���
	
	public VanillaLatteVO() {
		// TODO Auto-generated constructor stub
	}

	public VanillaLatteVO(int count, char temperature) {
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
