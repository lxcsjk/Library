package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class AdultSuperManBuilder extends Builder {

	@Override
	public SuperMan getSuperMan() {
		super.setBody("ǿ׳������");
		super.setSpecialTalent("�����");
		super.setSpecialSymbol("��ǰ��S���");
		return super.superMan;
	}

}
