package com.company.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	//ָ������㷨
	private Algorithm al;
	
	//���캯�����ݾ�����㷨
	public Context(Algorithm _al){
		this.al = _al;
	}
	
	//ִ��ѹ���㷨
	public boolean compress(String source,String to){
		return al.compress(source, to);
	}
	
	//ִ�н�ѹ���㷨
	public boolean uncompress(String source,String to){
		return al.uncompress(source, to);
	}
}
