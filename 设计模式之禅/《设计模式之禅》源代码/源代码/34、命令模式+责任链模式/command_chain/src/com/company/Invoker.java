package com.company;

import com.company.command.Command;
import com.company.command.LSCommand;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Invoker {
	
	//ִ������
	public String  exec(String _commandStr){
		//���巵��ֵ
		String result = "";
		//���Ƚ�������
		CommandVO vo = new CommandVO(_commandStr);
		//����Ƿ�֧��֧�ָ�����
		if(CommandEnum.getNames().contains(vo.getCommandName())){
			//�����������
			String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
			Command command;
			try {
				command = (Command)Class.forName(className).newInstance();
				result = command.execute(vo);
			}catch(Exception e){
				// TODO �쳣����
			}			
		}else{
			result = "�޷�ִ��������������ʽ";
		}
		return result;
	}
	

	

	public static void main(String[] args) {
		String cmd = "ls -a";
		Invoker invoker = new Invoker();
		System.out.println(invoker.exec(cmd));
	}
}
