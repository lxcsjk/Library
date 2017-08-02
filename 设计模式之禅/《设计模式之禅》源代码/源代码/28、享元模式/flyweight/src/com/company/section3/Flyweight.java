package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Flyweight {
	//�ڲ�״̬
	private String intrinsic;
	//�ⲿ״̬
	protected final String Extrinsic;
	//Ҫ����Ԫ��ɫ��������ⲿ״̬
	public Flyweight(String _Extrinsic){
		this.Extrinsic = _Extrinsic;
	}
	
	//����ҵ�����
	public abstract void operate();
	
	//�ڲ�״̬��getter/setter
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}	

}
