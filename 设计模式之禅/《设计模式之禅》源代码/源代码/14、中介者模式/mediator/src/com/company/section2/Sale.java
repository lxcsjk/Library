package com.company.section2;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����
 */
public class Sale extends AbstractColleague {
	public Sale(AbstractMediator _mediator){
		super(_mediator);
	}
	
	//����IBM�ͺŵĵ���
	public void sellIBMComputer(int number){
		super.mediator.execute("sale.sell", number);
		System.out.println("����IBM����"+number+"̨");		
	}
	
	//�����������,0����100֮��仯��0���������û������100����ǳ���������1һ����һ��
	public int getSaleStatus(){
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ��"+saleStatus);
		return saleStatus;
	}
	
	//�ۼ۴���
	public void offSale(){
		super.mediator.execute("sale.offsell");
	}
}
