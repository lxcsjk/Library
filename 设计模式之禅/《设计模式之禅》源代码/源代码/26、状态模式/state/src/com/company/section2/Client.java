package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ģ����ݵĶ���
 */
public class Client {
	
	public static void main(String[] args) {
		ILift lift = new Lift();
		
		//���ݵĳ�ʼ����Ӧ����ֹͣ״̬
		lift.setState(ILift.STOPPING_STATE);
		
		//�����ǵ����ſ������˽�ȥ
		lift.open();
		
		//Ȼ������Źر�
		lift.close();
		
		//��Ȼ�󣬵��������������ϻ�������
		lift.run();
		
		//��󵽴�Ŀ�ĵأ�����ͦ����
		lift.stop();
	}
}
