package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	public static void main(String[] args) throws IOException {
		Invoker invoker = new Invoker();
		while(true){
			//unixд��Ĭ����ʾ����
			System.out.print("#");
			//�������
			String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			//����quit��exit���˳�
			if(input.equals("quit") || input.equals("exit")){
				return;
			}
			System.out.println(invoker.exec(input));
		}
	
	}

}
