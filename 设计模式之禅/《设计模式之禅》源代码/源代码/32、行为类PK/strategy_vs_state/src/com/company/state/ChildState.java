package com.company.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ChildState extends HumanState{
	
	//��ͯ�Ĺ���������ˣ
	public void work(){
		System.out.println("��ͯ�Ĺ�������ˣ��");
		super.human.setState(Human.ADULT_STATE);
	}
}
