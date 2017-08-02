package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * Ů�Թ���
 */
public class FemaleFactory implements HumanFactory {
	//����������Ů��
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	//����������Ů��
	public Human createWhiteHuman() {	
		return new FemaleWhiteHuman();
	}

	//����������Ů��
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
