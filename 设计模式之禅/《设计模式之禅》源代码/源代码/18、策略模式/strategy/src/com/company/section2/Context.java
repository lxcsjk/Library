package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	//�������
	private Strategy strategy = null;
	
	//���캯�����þ������
	public Context(Strategy _strategy){
		this.strategy = _strategy;
	}
	
	//��װ��Ĳ��Է���
	public void doAnythinig(){
		this.strategy.doSomething();
	}
}
