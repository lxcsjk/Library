package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����1��ֻ��������Ϊ1�Ĳ�Ʒ
 */
public class Creator1 extends AbstractCreator {
	
	//ֻ������Ʒ�ȼ�Ϊ1��A��Ʒ
	public AbstractProductA createProductA() {	
		return new ProductA1();
	}

	//ֻ������ƽ�ȼ�Ϊ1��B��Ʒ
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
