package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �ɹ���
 */
public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator _mediator){
		super(_mediator);
	}
	//�ɹ�IBM�ͺŵĵ���
	public void buyIBMcomputer(int number){
		super.mediator.execute("purchase.buy", number);
	}
	
	//���ڲɹ�IBM����
	public void refuseBuyIBM(){
		System.out.println("���ٲɹ�IBM����");
	}
}
