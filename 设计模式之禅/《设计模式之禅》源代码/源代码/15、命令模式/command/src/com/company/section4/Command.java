package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Command {
	//����һ�������ȫ�ֹ������
	protected final Receiver receiver;	
	//ʵ������붨��һ��������
	public Command(Receiver _receiver){
		this.receiver = _receiver;
	}	
	//ÿ�������඼������һ��ִ������ķ���
	public abstract void execute();
}
