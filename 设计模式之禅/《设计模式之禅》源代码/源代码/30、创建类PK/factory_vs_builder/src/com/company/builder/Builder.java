package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Builder {
	//����һ�����˵�Ӧ��
	protected final SuperMan superMan = new SuperMan();
	
	//���������˵�����
	public void setBody(String body){
		this.superMan.setBody(body);
	}
	
	//���������˵����⼼��
	public void setSpecialTalent(String st){
		this.superMan.setSpecialTalent(st);
	}
	
	//���������˵�������
	public void setSpecialSymbol(String ss){
		this.superMan.setSpecialSymbol(ss);
	}
	
	//������������һ������
	public abstract SuperMan getSuperMan();
}
