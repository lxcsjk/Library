package com.company.section2;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �ͻ����Ǽ׷���������Ǯ��һ�������ϴ�
 */
public class Client {
	
	public static void main(String[] args) {
		//�������ǵĽ�ͷ��
		Invoker xiaoSan = new Invoker();  //��ͷ�˾�����С��
		
		//�ͻ�Ҫ������һ������
		System.out.println("-------------�ͻ�Ҫ��ɾ��һ��ҳ��-----------------");
		//�ͻ���������������
		//Command command = new AddRequirementCommand();
		Command command = new DeletePageCommand();
		
		//��ͷ�˽��յ�����
		xiaoSan.setCommand(command);
		
		//��ͷ��ִ������
		xiaoSan.action();
		
	}
}
