package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	//����״̬
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();
	
	//��ǰ״̬
	private State CurrentState;
	
	//��õ�ǰ״̬
	public State getCurrentState() {
		return CurrentState;
	}
	
	//���õ�ǰ״̬
	public void setCurrentState(State currentState) {
		this.CurrentState = currentState;
		//�л�״̬
		this.CurrentState.setContext(this);
	}
	
	//��Ϊί��
	public void handle1(){
		this.CurrentState.handle1();
	}
	
	public void handle2(){
		this.CurrentState.handle2();
	}
	
	
	
}
