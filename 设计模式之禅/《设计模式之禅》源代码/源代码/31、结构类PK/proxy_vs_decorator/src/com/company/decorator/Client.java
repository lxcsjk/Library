package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//������˶�Ա
		IRunner liu = new Runner();
		//���书�ܼ�ǿ
		liu = new RunnerWithJet(liu);
		//���������ܲ�������
		System.out.println("===��ǿ����˶�Ա�Ĺ���===");
		liu.run();
	}
}
