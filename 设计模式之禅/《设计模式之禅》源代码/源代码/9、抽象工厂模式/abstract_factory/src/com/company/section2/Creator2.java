package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����2��ֻ��������Ϊ2�Ĳ�Ʒ
 */
public class Creator2 extends AbstractCreator {
	
	//ֻ������Ʒ�ȼ�Ϊ2��A��Ʒ
	public AbstractProductA createProductA() {	
		return new ProductA2();
	}

	//ֻ������ƽ�ȼ�Ϊ2��B��Ʒ
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
