package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface ILetterProcess {
	//����Ҫд�ŵ�����
	public void writeContext(String context);
	//���д�ŷ�
	public void fillEnvelope(String address);
	//���ŷŵ��ŷ���
	public void letterInotoEnvelope();
	//Ȼ���ʵ�
	public void sendLetter();
}
