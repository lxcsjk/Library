package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//�ڶ�����г�ʼ���ĸ�����
		SignInfoFactory.getSignInfo("��Ŀ1");
		SignInfoFactory.getSignInfo("��Ŀ2");
		SignInfoFactory.getSignInfo("��Ŀ3");
		SignInfoFactory.getSignInfo("��Ŀ4");
		
		//ȡ�ö���
		SignInfo signInfo = SignInfoFactory.getSignInfo("��Ŀ2");
		while(true){
			signInfo.setId("ZhangSan");
			signInfo.setLocation("ZhangSan");
			(new MultiThread(signInfo)).start();
			
			signInfo.setId("LiSi");
			signInfo.setLocation("LiSi");
			(new MultiThread(signInfo)).start();
			
		}
	}
	
		
}
