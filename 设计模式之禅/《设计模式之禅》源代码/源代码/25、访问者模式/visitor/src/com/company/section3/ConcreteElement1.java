package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteElement1 extends Element{
	
	//����ҵ���߼�
	public void doSomething(){
		//ҵ����
	}
	
	//�����Ǹ������߷���
	public void accept(IVisitor visitor){
		visitor.visit(this);
	}
}
