package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//��ʼ�������
		for(int i=0;i<4;i++){
			String subject = "��Ŀ" + i;
			//��ʼ����ַ
			for(int j=0;j<30;j++){
				String key = subject + "���Եص�"+j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo signInfo = SignInfoFactory.getSignInfo("��Ŀ1���Եص�1");
	}

		
}
