package com.company.section2;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����ĳ����࣬���ǰѿͻ�������������һ��һ���Ķ���
 */
public abstract class Command {
	
	//�������鶼����ã��������ֱ��ʹ��
	protected RequirementGroup rg = new RequirementGroup();  //������
	protected PageGroup pg = new PageGroup();  //������
	protected CodeGroup cg = new CodeGroup();  //������;
	

	//ֻҪһ����������Ҫ����ʲô����
	public abstract void execute();
	

	
	
}
