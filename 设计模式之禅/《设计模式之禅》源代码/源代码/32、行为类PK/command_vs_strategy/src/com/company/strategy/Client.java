package com.company.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//���廷����ɫ
		Context context;
		//���ļ�ִ��zipѹ���㷨
		System.out.println("========ִ���㷨========");
		context = new Context(new Zip());
		/*
		 *�㷨�滻
		 * context = new Context(new Gzip());
		 * 
		 */
		
		//ִ��ѹ���㷨
		context.compress("c:\\windows","d:\\windows.zip");
		//ִ�н�ѹ���㷨
		context.uncompress("c:\\windows.zip","d:\\windows");
	}
}
