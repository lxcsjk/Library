package com.cbf4life.view;

import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SwfView extends AbsView {

	public SwfView(AbsLangData _langData){
		super(_langData);
	}
	
	@Override
	public void assemble() {
		Map<String,String> langMap = getLangData().getItems();
		for(String key:langMap.keySet()){
			/*
			 * ��װһ��HTTP�������ʽ��
			 * http://abc.com/xxx.swf?key1=value&key2=value
			 */
		}
	}

}
