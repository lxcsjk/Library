package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SendMail extends MailServer {
	//����һ���ʼ�
	public SendMail(MailTemplate _m) {
		super(_m);
	}

	//�����ʼ����ͳ���
	@Override
	public void sendMail(){
		//�����ʼ���������Ϣ
		super.m.add("Received: (sendmail); 7 Nov 2009 04:14:44 +0100");
		super.sendMail();
	}
}
