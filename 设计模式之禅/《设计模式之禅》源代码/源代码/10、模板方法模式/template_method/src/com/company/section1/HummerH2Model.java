package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HummerH2Model extends HummerModel {
	//H2�ͺŵĺ�������
	public void alarm() {
		System.out.println("����H2����...");
	}

	//���������
	public void engineBoom() {
		System.out.println("����H2����������������...");
	}

	//��������
	public void start() {
		System.out.println("����H2����...");
	}
	
	//ͣ��
	public void stop() {
		System.out.println("����H2ͣ��...");
	}
	
	//��������
	public void run(){

		//�ȷ�������
		this.start();
		
		//���濪ʼ����
		this.engineBoom();
		
		//Ȼ��Ϳ�ʼ���ˣ��ܵĹ���������һ������·���Ͱ�����
		this.alarm();
		
		//����Ŀ�ĵؾ�ͣ��
		this.stop();
	}

}
