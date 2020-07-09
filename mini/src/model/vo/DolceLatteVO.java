package model.vo;

public class DolceLatteVO extends CoffeeVO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6602744777676855617L;
	private String name = "��ü ��";				//Ŀ���̸�
	private int price = 5600;					//����
	private String detailInfo = "Ŀ�� ��� �ε巯���� ��ȭ�� ���� ���� ���̽� Ŀ�� �Դϴ�.";	//�� ����
	private String detailNutri = "&emsp;1ȸ ������ (kcal) 265<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��ȭ���� (g) 9<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;�ܹ��� (g) 8<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��Ʈ�� (mg) 115<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��� (g) 29<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;ī���� (mg) 150<br/>";	//���� ����
	private String detailAll = "�˷����� ���߿��� : ����";	//�˷���
	
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
