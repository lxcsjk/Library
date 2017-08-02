package com.company.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class MailTemplate {
	//�ʼ�������
	private String from;
	//�ռ���
	private String to;
	//�ʼ�����
	private String subject;
	//�ʼ�����
	private String context;

	//ͨ�����캯�������㹻�����Ϣ
	public MailTemplate(String _from,String _to,String _subject,String _context){
		this.from = _from;
		this.to = _to;
		this.subject = _subject;
		this.context = _context;
	}
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContext(String context){
		this.context = context;
	}
	
	//�ʼ���������
	public String getContext(){
		return context;
	}
	
}
