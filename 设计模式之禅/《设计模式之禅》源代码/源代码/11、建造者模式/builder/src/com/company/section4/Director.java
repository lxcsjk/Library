package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Director {
	private Builder builder = new ConcreteProduct();
	
	//������ͬ�Ĳ�Ʒ
	public Product getAProduct(){
		builder.setPart();  
		/*
		 * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		 */
		return builder.buildProduct();
	}
}
