package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Singer extends AbstractStar {
	
	//Ĭ�ϵĸ�������Ӧ���ǳ���
	public Singer(){
		super(new Sing());
	}
	
	//Ҳ������������һ����ְҵ
	public Singer(AbstractAction _action){
		super(_action);
	}
	
	//ϸ���������ǵ�ְ��
	@Override
	public void doJob(){
		System.out.println("\n======�������ǵ���Ҫ����=====");
		super.doJob();
	}
}
