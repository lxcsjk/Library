package com.company.section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.\
 * �ͻ���ʼʹ�����ģ��
 */
public class Client {

	public static void main(String[] args) throws IOException {
		System.out.println("-------H1�ͺź���--------");
		System.out.println("H1�ͺŵĺ����Ƿ���Ҫ�������죿0-����Ҫ   1-��Ҫ");
		String type=(new BufferedReader(new InputStreamReader(System.in))).readLine();
		HummerH1Model h1 = new HummerH1Model();
		if(type.equals("0")){  
			h1.setAlarm(false);
		}
		h1.run();
		
		System.out.println("\n-------H2�ͺź���--------");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();  
	}

}
