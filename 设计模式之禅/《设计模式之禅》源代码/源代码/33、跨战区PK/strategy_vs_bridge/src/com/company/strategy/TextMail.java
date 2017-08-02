package com.company.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class TextMail extends MailTemplate {


	public TextMail(String _from, String _to, String _subject, String _context) {
		super(_from, _to, _subject, _context);
	}

	@Override
	public String getContext() {
		//�ı������������ʼ��ĸ�ʽΪ��text/plain
		String context = "\nContent-Type: text/plain;charset=GB2312\n" +super.getContext();
		//ͬʱ���ʼ�����base64���봦��,������һ�仰����
		context = context + "\n�ʼ���ʽΪ���ı���ʽ";
		return context;
	}

}
