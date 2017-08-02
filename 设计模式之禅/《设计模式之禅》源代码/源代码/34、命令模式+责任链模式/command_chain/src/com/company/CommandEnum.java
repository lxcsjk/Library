package com.company;

import java.util.ArrayList;
import java.util.List;

import com.company.command.LSCommand;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���е����������ﶨ��
 */
public enum CommandEnum {
	ls("com.company.command.LSCommand"),
	df("com.company.command.DFCommand");
	
	private String value = "";
	
	//���幹�캯����Ŀ����Data(value)���͵���ƥ��
	private CommandEnum(String value){
		this.value = value;
	}
	
	
	public String getValue(){
		return this.value;
	}
	
	//�������е�enum����
	public static List<String> getNames(){
		CommandEnum[] commandEnum = CommandEnum.values();
		List<String> names = new ArrayList<String>();
		for(CommandEnum c:commandEnum){
			names.add(c.name());
		}
		
		return names;
	}
	
}
