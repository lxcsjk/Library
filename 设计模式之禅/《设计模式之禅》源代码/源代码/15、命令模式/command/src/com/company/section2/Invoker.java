package com.company.section2;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��ͷ�˵�ְ����ǽ��������ִ��
 */
public class Invoker {
	//ʲô����
	private Command command;
	
	//�ͻ���������
	public void setCommand(Command command){
		this.command = command;
	}
	
	//ִ�пͻ�������
	public void action(){
		this.command.execute();
	}
}
