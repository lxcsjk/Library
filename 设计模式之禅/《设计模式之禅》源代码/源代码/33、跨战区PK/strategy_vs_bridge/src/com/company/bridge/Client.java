package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		
		//����һ��TEXT��ʽ���ʼ�
		MailTemplate m = new HtmlMail("a@a.com","b@b.com","�����˹���������","����������˱��й��˰������ų��ˣ�");
		
		//����һ��Mail���ͳ���
		MailServer mail = new Postfix(m);
		//�����ʼ�
		mail.sendMail();
	}
}
