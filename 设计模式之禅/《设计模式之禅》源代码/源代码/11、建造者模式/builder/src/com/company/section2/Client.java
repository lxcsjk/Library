package com.company.section2;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������ţ�湫˾�����£���Ҫɶ���Ǹ�ɶ
 */
public class Client {

	public static void main(String[] args) {
		ArrayList<String> sequence  = new ArrayList<String>();  //���run��˳��
		sequence.add("engine boom");  //�ͻ�Ҫ��run��ʱ��ʱ���ȷ�������
		sequence.add("start");  //��������
		sequence.add("stop");  //����һ�ξ�ͦ����
		
		//Ҫһ�����۳���
		BenzBuilder benzBuilder = new BenzBuilder();
		//��˳������builder�࣬���������һ��������
		benzBuilder.setSequence(sequence);
		//�����һ�����۳�
		BenzModel benz = (BenzModel)benzBuilder.getCarModel();
		//���۳���һ�¿���
		benz.run();
		//����ͬ����˳������Ҫһ������
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
		bmw.run();			
	}

}


