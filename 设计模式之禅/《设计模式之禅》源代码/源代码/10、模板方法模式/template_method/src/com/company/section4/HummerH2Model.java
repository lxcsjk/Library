package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * H1��H2��ʲô��𣬻��治֪������û�Ӵ�������
 */
public class HummerH2Model extends HummerModel {

	protected void alarm() {
		System.out.println("����H2����...");
	}

	protected void engineBoom() {
		System.out.println("����H2����������������...");
	}
	
	protected void start() {
		System.out.println("����H2����...");
	}

	protected void stop() {
		System.out.println("����H2ͣ��...");
	}
	
	
	//Ĭ��û�����ȵ�
	protected boolean isAlarm() {		
		return false;
	}
	
	
	
}
