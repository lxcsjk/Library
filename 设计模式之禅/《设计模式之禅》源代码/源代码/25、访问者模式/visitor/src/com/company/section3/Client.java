package com.company.section3;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			//���Ԫ�ض���
			Element el = ObjectStruture.createElement();
			//���ܷ����߷���
			el.accept(new Visitor());
		}		
	}
}
