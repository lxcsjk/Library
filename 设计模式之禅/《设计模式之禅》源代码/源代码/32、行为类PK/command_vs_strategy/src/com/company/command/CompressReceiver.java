package com.company.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class CompressReceiver implements IReceiver {

	//ִ��gzipѹ������
	public boolean gzipExec(String source, String to) {
		System.out.println(source + " --> " +to + " GZIPѹ���ɹ�!");
		return true;
	}

	//ִ��zipѹ������
	public boolean zipExec(String source, String to) {
		System.out.println(source + " --> " +to + " ZIPѹ���ɹ�!");
		return true;
	}

}
