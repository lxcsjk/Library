package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 
 */
public abstract class AbstractClass {

	//��������
	protected abstract void doSomething();
	
	//��������
	protected abstract void doAnything();
	
	//ģ�淽��
	public void templateMethod(){
		/*
		 * ���û��������������ص��߼�
		 */
		this.doAnything();
		this.doSomething();
	}
}
