package model.vo;

public class HazelnutLatteVO extends CoffeeVO {
	 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7930039865477788863L;
	private String name = "������� ��";				//Ŀ���̸�
	private int price = 4800;					//����
	private String detailInfo = "�ż��ϰ� ������ ���� �� �ͽ��� ������� �÷��� �ְ� ���������� �� �׸��� ������ ��췯�� �ڵ� ����ŷ�� �����Դϴ�.";	//�� ����
	private String detailNutri = "&emsp;1ȸ ������ (kcal)125<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��ȭ���� (g)5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;�ܹ��� (g)3<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��Ʈ�� (mg)28.5<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;��� (g)14<br/>" + 
			"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;ī���� (mg)150<br/>";	//���� ����
	private String detailAll = "�˷����� ���߿��� : ����";	//�˷���
	
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
