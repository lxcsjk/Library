package com.company.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UncompressReceiver implements IReceiver {

	//ִ��gzip��ѹ������
	public boolean gzipExec(String source, String to) {
		System.out.println(source + " --> " +to + " GZIP��ѹ���ɹ�!");
		return true;
	}

	//ִ��zip��ѹ������
	public boolean zipExec(String source, String to) {
		System.out.println(source + " --> " +to + " ZIP��ѹ���ɹ�!");
		return true;
	}

}
