package com.company.chain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) throws Exception {
		
		//�Ϻ�����������
		DnsServer sh = new SHDnsServer();
		//�й���������������
		DnsServer china = new ChinaTopDnsServer();
		//��������������
		DnsServer top = new TopDnsServer();
		
		//�����ѯ·��
		china.setUpperServer(top);
		sh.setUpperServer(china);
		
		
		//��������
		System.out.println("=====��������ģ����=====");
		while(true){
			System.out.print("\n����������(����N�˳�):");
			String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			if(domain.equalsIgnoreCase("n")){
				return;
			}
			Recorder recorder = sh.resolve(domain);
			System.out.println("----DNS�������������----");
			System.out.println(recorder);			
		}		
	}
}
