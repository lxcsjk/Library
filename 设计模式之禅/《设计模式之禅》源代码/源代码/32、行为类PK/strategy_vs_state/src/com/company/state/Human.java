package com.company.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Human {
	//�������඼�߱���Щ״̬
	public static final HumanState CHIILD_STATE = new ChildState();
	public static final HumanState ADULT_STATE = new AdultState();
	public static final HumanState OLD_STATE = new OldState();
	
	//����һ���˵�״̬
	private HumanState state;
	
	//����һ��״̬
	public void setState(HumanState _state){
		this.state = _state;
		this.state.setHuman(this);
	}
	
	//����Ĺ���
	public void work(){
		this.state.work();
	}
}
