package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���Թ���
 */
public class MaleFactory implements HumanFactory {
	//��������������
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	//��������������
	public Human createWhiteHuman() {	
		return new MaleWhiteHuman();
	}

	//��������������
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
