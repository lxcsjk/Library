package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		//��״̬�±��봦����߼�
	}


	@Override
	public void handle2() {
		//���õ�ǰ״̬Ϊstat2
		super.context.setCurrentState(Context.STATE2);
		//���ɵ�state2״̬����Contextʵ��
		super.context.handle2();
	}

}
