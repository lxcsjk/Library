package com.company.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IReceiver {
	
	//ִ��zip����
	public boolean zipExec(String source,String to);
	
	//ִ��gzip����
	public boolean gzipExec(String source,String to);
}
