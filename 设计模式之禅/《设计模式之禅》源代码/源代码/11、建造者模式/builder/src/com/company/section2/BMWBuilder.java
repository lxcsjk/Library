package com.company.section2;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����һ��˳�򣬷���һ������
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();
	
	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}

}
