package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������ÿһ��ͬ������ܴӸ���̳еķ����ǳ���
 */
public class ConcreteColleague2 extends Colleague {

	//ͨ�����캯�������н���
	public ConcreteColleague2(Mediator _mediator){
		super(_mediator);
	}
	
	//���з��� self-method
	public void selfMethod2(){
		//�����Լ���ҵ���߼�
	}
	
	//�������� dep-method
	public void depMethod2(){
		//�����Լ���ҵ���߼�
		//�Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething2();
	}
	
}
