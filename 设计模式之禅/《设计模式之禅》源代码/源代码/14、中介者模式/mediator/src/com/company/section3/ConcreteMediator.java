package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteMediator extends Mediator {

	@Override
	public void doSomething1() {
		//����ͬ����ķ�����ֻҪ��public���������Ե���
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

	public void doSomething2() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

}
