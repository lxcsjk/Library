package com.company.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractCmd {
	//�Խ����ߵ�Ӧ��
	protected IReceiver compress = new CompressReceiver();
	protected IReceiver uncompress = new UncompressReceiver();
	
	//���󷽷�������ľ��嵥Ԫ
	public abstract boolean execute(String source,String to);
}
