package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Director {
	
	//�����Խ����ߵ�����
	private CarBuilder benzBuilder = new BenzBuilder();
	private CarBuilder bmwBuilder = new BMWBuilder();
	
	//��������SUV����	
	public ICar createBenzSuv(){
		//���������
		return createCar(benzBuilder, "benz������", "benz����̥");
	}
	
	//������һ�����������
	public ICar createBMWVan(){
		return createCar(benzBuilder, "BMW������", "BMW����̥");		
	}
	
	//������һ����ϳ���
	public ICar createComplexCar(){		
		return createCar(bmwBuilder, "BMW������", "benz����̥");
	}
	
	//��������
	private ICar createCar(CarBuilder _carBuilder,String engine,String wheel){
		//���ݻ�����ͼ
		Blueprint bp = new Blueprint();
		bp.setEngine(engine);
		bp.setWheel(wheel);
		
		System.out.println("���������ͼ");
		_carBuilder.receiveBlueprint(bp);
		return _carBuilder.buildCar();
	}
	
}