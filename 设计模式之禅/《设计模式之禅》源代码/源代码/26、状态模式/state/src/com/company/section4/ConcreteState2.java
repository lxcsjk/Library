package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteState2 extends State {

	@Override
	public void handle1() {		
		//���õ�ǰ״̬Ϊstat1
		super.context.setCurrentState(Context.STATE1);
		//���ɵ�state1״̬����Contextʵ��
		super.context.handle1();
	}
	@Override
	public void handle2() {
		//��״̬�±��봦����߼�
	}

}
