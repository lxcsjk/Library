package com.company.section2;

import com.company.section1.ILetterProcess;
import com.company.section1.LetterProcessImpl;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ModenPostOffice {
	private ILetterProcess letterProcess = new LetterProcessImpl();
	
	//д�ţ���װ��Ͷ�ݣ�һ�廯��
	public void sendLetter(String context,String address){
		
		//����д��
		letterProcess.writeContext(context);
		
		//д���ŷ�
		letterProcess.fillEnvelope(address);
		
		//���ŷŵ��ŷ���
		letterProcess.letterInotoEnvelope();
			
		//�ʵ��ż�
		letterProcess.sendLetter();
		
	}
}
