package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HouseCorp extends Corp {
	//���崫��һ��House��Ʒ����
	public HouseCorp(House house){
		super(house);
	}
	//���ز���˾��High�ˣ�׬Ǯ����������
	public void makeMoney(){
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}
}

