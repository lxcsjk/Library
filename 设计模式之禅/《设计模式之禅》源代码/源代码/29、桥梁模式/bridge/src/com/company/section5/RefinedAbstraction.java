package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RefinedAbstraction extends Abstraction {
	
	//��д���캯��
	public RefinedAbstraction(Implementor _imp){
		super(_imp);
	}
	
	//�������������
	@Override
	public void request(){
		/*
		 * ҵ����....
		 */
		super.request();
		
		super.getImp().doAnything();
	}
}
