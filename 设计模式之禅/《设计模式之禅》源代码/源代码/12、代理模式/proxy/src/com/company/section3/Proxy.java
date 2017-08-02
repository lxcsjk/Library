package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Proxy implements Subject {
	//Ҫ�����ĸ�ʵ����
	private Subject subject = null;
	
	//Ĭ�ϱ�������
	public Proxy(){
		this.subject = new Proxy();
	}
	
	public Proxy(Subject _subject){
		this.subject = _subject;
	}
	
	//ͨ�����캯�����ݴ�����
	public Proxy(Object...objects ){

	}
	
	//ʵ�ֽӿ��ж���ķ���
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	//Ԥ����
	private void before(){
		//do something
	}
	
	//�ƺ���
	private void after(){
		//do something
	}
}
