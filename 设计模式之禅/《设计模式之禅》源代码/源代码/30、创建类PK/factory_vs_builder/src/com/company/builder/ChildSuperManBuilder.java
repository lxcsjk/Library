package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ChildSuperManBuilder extends Builder {


	@Override
	public SuperMan getSuperMan() {
		super.setBody("ǿ׳������");
		super.setSpecialTalent("��ǹ����");
		super.setSpecialSymbol("��ǰ��СS���");
		return super.superMan;
	}

}
