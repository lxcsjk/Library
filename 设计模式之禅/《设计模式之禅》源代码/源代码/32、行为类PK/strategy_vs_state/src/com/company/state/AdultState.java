package com.company.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class AdultState extends HumanState {

	//�����˵Ĺ���������Ǯ
	@Override
	public void work() {
		System.out.println("�����˵Ĺ���������Ǯ��");
		super.human.setState(Human.OLD_STATE);
	}

}
