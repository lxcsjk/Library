package com.company.section5;

import java.util.ArrayList;
import java.util.Observable;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �����ӣ���˹��ʦ�ܣ���������Ҫ����
 */
public class HanFeiZi extends Observable{
	
	//������Ҫ�Է���
	public void haveBreakfast(){
		System.out.println("������:��ʼ�Է���...");
		//֪ͨ���еĹ۲���
		super.setChanged();
		super.notifyObservers("�������ڳԷ�");
		
	}
	
	//�����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun(){
		System.out.println("������:��ʼ������...");
		super.setChanged();
		this.notifyObservers("������������");
	}
	
}
