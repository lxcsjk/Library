package com.company.proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ�������˶�Ա
		IRunner liu = new Runner();
		//����liu�Ĵ�����
		IRunner agent = new RunnerAgent(liu);
		//Ҫ���˶�Ա�ܲ�
		System.out.println("====�����ҵ��˶�Ա�Ĵ���Ҫ����ȥ�ܲ�===");
		agent.run();
	}
}
