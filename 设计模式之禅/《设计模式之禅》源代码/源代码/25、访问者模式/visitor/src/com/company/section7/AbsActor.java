package com.company.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbsActor {
	//��Ա���ܹ���һ����ɫ
	public void act(Role role){
		System.out.println("��Ա���԰����κν�ɫ");
	}	
	//�����ݹ���Ϸ
	public void act(KungFuRole role){
		System.out.println("��Ա�������ݹ����ɫ");
	}
}
