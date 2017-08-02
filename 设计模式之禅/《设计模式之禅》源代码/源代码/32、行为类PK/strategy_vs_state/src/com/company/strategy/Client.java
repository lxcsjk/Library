package com.company.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ��������ɫ
		Context context=new Context();
		System.out.println("====��ͯ����Ҫ����=====");
		context.setWork(new ChildWork());
		context.work();
		
		System.out.println("\n====�����˵���Ҫ����=====");
		context.setWork(new AdultWork());
		context.work();
		
		System.out.println("\n====�����˵���Ҫ����=====");
		context.setWork(new OldWork());
		context.work();
		
	}
}
