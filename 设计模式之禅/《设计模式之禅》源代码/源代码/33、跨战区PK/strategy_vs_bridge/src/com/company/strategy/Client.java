package com.company.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		
		//����һ��TEXT��ʽ���ʼ�
		MailTemplate m = new TextMail("a@a.com","b@b.com","�����˹���������","����������˱��й��˰������ų��ˣ�");
		
		//����һ��Mail���ͳ���
		MailServer mail = new MailServer(m);
		//�����ʼ�
		mail.sendMail();
	}
}
