package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Postfix extends MailServer {

	public Postfix(MailTemplate _m) {
		super(_m);

	}
	
	//�����ʼ����ͳ���
	@Override
	public void sendMail(){
		//�����ʼ���������Ϣ
		String context ="Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) with ESMTP id 8DBCD172B8\n" ;		
		super.m.add(context);
		super.sendMail();
	}
}
