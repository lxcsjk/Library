package com.company.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//����һ����Ա
		AbsActor actor = new OldActor();
		//����һ����ɫ
		Role role = new KungFuRole();
		//��ʼ��Ϸ
		role.accept(actor);
	}
}
