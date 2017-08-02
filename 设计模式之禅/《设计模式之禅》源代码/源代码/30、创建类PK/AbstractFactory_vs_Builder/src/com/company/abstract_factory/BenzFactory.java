package com.company.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BenzFactory implements CarFactory {
	
	//����SUV
	public ICar createSuv() {
		return new BenzSuv();
	}
	
	//��������
	public ICar createVan(){
		return new BenzVan();
	}
}
