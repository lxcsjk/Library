package com.company.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbsBenz implements ICar {
	private final static String BENZ_BAND = "��������";
	
	public String getBand() {
		return BENZ_BAND;
	}

	//�����ͺ���ʵ�������
	public abstract String getModel();

}

