package com.company.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ������,ѹ��һ���ļ�
		AbstractCmd cmd = new ZipCompressCmd();
		/*
		 * �뻻һ����ִ�н�ѹ����
		 * AbstractCmd cmd = new ZipUncompressCmd();
		 */
		//���������
		Invoker invoker = new Invoker(cmd);
		//�������������ļ�����ѹ��
		System.out.println("========ִ��ѹ������========");
		invoker.execute("c:\\windows", "d:\\windows.zip");
	}
}
