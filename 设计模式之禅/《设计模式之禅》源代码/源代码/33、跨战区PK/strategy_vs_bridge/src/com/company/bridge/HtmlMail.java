package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HtmlMail extends MailTemplate {

	public HtmlMail(String _from, String _to, String _subject, String _context) {
		super(_from, _to, _subject, _context);
	}

	public String getContext(){
		//���ı������������ʼ��ĸ�ʽΪ��multipart/mixed
		String context = "\nContent-Type: multipart/mixed;charset=GB2312\n"+super.getContext();
		//ͬʱ���ʼ�����HTML��飬�Ƿ�������δ�رյı�ǩ�������϶���ı�ǩ��,������һ�仰������
		context = context + "\n�ʼ���ʽΪ�����ı���ʽ";
		return context;
	}
}
