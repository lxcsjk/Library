package com.company.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbsBMW implements ICar {
	private final static String BMW_BAND = "��������";
	
	//����
	public String getBand() {
		return BMW_BAND;
	}
	
	//�ͺ��ɾ����ʵ����ʵ��
	public abstract String getModel();

}
