package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class CarBuilder {
	//�����������
	private ICar car;
	//�����ͼ
	private Blueprint bp;
	
	public Car buildCar(){
		//����˳������һ����
		return new Car(buildEngine(),buildWheel());
	}
	
	//����һ�������ͼ
	public void receiveBlueprint(Blueprint _bp){
		this.bp = _bp;
	}
	
	//�鿴��ͼ��ֻ�������Ľ����߲ſ��Բ鿴��ͼ
	protected Blueprint getBlueprint(){
		return bp;
	}
	
	//��������
	protected abstract String buildWheel();
	//��������
	protected abstract String buildEngine();
	
}
