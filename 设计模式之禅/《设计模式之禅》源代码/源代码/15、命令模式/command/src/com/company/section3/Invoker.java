package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Invoker {
	private Command command;
	//����������������
	public void setCommand(Command _command){
		this.command = _command;
	}
	
	//ִ������
	public void action(){
		this.command.execute();
	}
	
}
