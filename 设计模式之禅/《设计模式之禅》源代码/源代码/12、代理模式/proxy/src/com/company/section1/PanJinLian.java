package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �˽���
 */
public class PanJinLian implements KindWomen {
	//�ܸ߳еȼ�
	private int shameLevel = 10;	
	
	//���������ʱ�򣬾�Ҫ����һ���ܸ߳У�������й�ϵ
	public PanJinLian(int level){
		this.shameLevel = this.shameLevel + level;
	}

	
	public void happyWithMan() {
		if(this.shameLevel > 20){
			System.out.println("�Բ����Ҳ���ʶ�㣡");
		}else{
			System.out.println("�õ�.....");
		}
	}
	
	//�����ܸ߳�
	public void increaseSharme(int level) {
		this.shameLevel = this.shameLevel + level;
	}

	//������
	public void makeEyesWithMan() {
		System.out.println("�˽���������");
	}

}
