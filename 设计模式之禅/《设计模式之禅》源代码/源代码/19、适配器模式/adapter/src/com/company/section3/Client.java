package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��������Ǿ����Ӧ���ˣ������ϰ�Ҫ�����е�20-30��Ů����Ϣ
 */
public class Client {


	public static void main(String[] args) {
	
		//��ϵͳ����Ա��Ϣ
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		//������������
		IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo); 
		//�����ݿ��в鵽101��
		for(int i=0;i<101;i++){
			youngGirl.getMobileNumber();
		}
		
		
	}

}
