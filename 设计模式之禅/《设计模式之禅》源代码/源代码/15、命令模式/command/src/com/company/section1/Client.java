package com.company.section1;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �ͻ����Ǽ׷���������Ǯ��һ�������ϴ�
 */
public class Client {
	
	public static void main(String[] args) {		
		//���ȿͻ��ҵ�������˵������̸���󣬲��޸�
		System.out.println("-------------�ͻ�Ҫ������һ������-----------------");
		Group rg = new RequirementGroup();
		//�ҵ�������
		rg.find();
		//����һ������
		rg.add();
		//Ҫ�����ƻ�
		rg.plan();
	}
}

