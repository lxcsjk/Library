package com.company.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BenzVan extends AbsBenz {
	private final static String R_SERIES = "Rϵ������";
	
	@Override
	public String getModel() {
		return R_SERIES;
	}

}
