package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������ţ�湫˾�����£���Ҫɶ���Ǹ�ɶ
 */
public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		
		//1W��A���͵ı��۳�
		for(int i=0;i<10000;i++){
			director.getABenzModel().run();
		}
		
		//100W��B���͵ı��۳�
		for(int i=0;i<1000000;i++){
			director.getBBenzModel().run();
		}
		
		//1000W��C���͵ı���
		for(int i=0;i<10000000;i++){
			director.getCBMWModel().run();
		}
	}

}
