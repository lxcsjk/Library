package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class HummerModel {

	/*
	 * ���ȣ����ģ��Ҫ�ܹ��������������������ҡ���������ǵ�������������
	 * ��Ҫ�ܹ����������������ʵ��Ҫ��ʵ��������
	 */
	public abstract void start();
	
	//�ܷ������ǻ�Ҫ��ͣ�������ǲ����汾��
	public abstract void stop();
	
	//���Ȼ���������ǵενУ��������ٽ�
	public abstract void alarm();
	
	//������¡¡���죬�������Ǽٵ�
	public abstract void engineBoom();
	
	//��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ�����������֮Ҫ����
	public abstract void run();

}
