package com.company.section1;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������ţ�湫˾�����£���Ҫɶ���Ǹ�ɶ
 */
public class Client {

	public static void main(String[] args) {
		/*
		 * �ͻ�����ţ�湫˾����Ҫ����һ��ģ�ͣ�Ȼ��ţ�湫˾�͸������ϴ�
		 * ˵Ҫ����һ��ģ�ͣ�����һ��˳��Ȼ���Ҿ�������
		 */
		BenzModel benz = new BenzModel();
		//���run��˳��
		ArrayList<String> sequence  = new ArrayList<String>();  		
		sequence.add("engine boom");  //�ͻ�Ҫ��run��ʱ��ʱ���ȷ�������
		sequence.add("start");  //��������
		sequence.add("stop");  //����һ�ξ�ͣ����		
		//���ǰ����˳���豼�۳�
		benz.setSequence(sequence);
		benz.run();		
	}
}

