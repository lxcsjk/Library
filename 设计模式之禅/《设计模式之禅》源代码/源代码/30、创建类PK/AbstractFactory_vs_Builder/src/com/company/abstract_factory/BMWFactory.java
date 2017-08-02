package com.company.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BMWFactory implements CarFactory {
	
	//����SUV
	public ICar createSuv() {
		return new BMWSuv();
	}
	
	//��������
	public ICar createVan(){
		return new BMWVan();
	}

}
