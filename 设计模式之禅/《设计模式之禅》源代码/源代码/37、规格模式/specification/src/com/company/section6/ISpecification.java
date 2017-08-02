package com.company.section6;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface ISpecification {
	
	//��ѡ���Ƿ�����Ҫ��
	public boolean isSatisfiedBy(Object candidate);	
	
	//and����
	public ISpecification and(ISpecification spec);
	
	//or����
	public ISpecification or(ISpecification spec);
	
	//not����
	public ISpecification not();
}
