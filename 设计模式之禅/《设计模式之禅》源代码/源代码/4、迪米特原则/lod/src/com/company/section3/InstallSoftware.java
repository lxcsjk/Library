package com.company.section3;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ����װ�࣬������ø�������
 */
public class InstallSoftware {
	
	public void installWizard(Wizard wizard){
		int first = wizard.first();  
		//����first���صĽ�������Ƿ���Ҫִ��second
		if(first>50){
			int second = wizard.second();
			if(second>50){
				int third = wizard.third();
				if(third >50){
					wizard.first();
				}
			}
		}
		
	}
}
