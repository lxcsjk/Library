package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {


	public static void main(String[] args) {
		//����һ������
		Thing thing = new Thing();
		//����һ��ֵ
		thing.setValue("����");
		
		//����һ������
		Thing cloneThing = thing.clone();
		cloneThing.setValue("����");
		
		System.out.println(thing.getValue());

	}

}
