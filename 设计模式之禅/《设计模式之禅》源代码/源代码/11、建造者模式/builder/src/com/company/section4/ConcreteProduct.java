package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteProduct extends Builder {
	private Product product = new Product();
	
	//���ò�Ʒ���
	public void setPart(){
		/*
		 * ��Ʒ���ڵ��߼�����
		 */
	}
	
	
	//�齨һ����Ʒ
	public Product buildProduct() {
		return product;
	}
	
}
