package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������ÿ��ԽҰ�ߵ��������H1��ӽ�����ϵ��
 */
public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true;  //�Ƿ�Ҫ������
	
	@Override
	protected void alarm() {
		System.out.println("����H1����...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("����H1����������������...");
	}

	@Override
	protected void start() {
		System.out.println("����H1����...");
	}

	@Override
	protected void stop() {
		System.out.println("����H1ͣ��...");
	}
	
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	//Ҫ��Ҫ�����ȣ����пͻ�����������
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
