package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��س���
 */
class Spy extends Thread{
	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	
	//ͨ�����캯�����ݲ�������Ҫ��ص���˭,˭�����,Ҫ���ʲô
	public Spy(HanFeiZi _hanFeiZi,LiSi _liSi,String _type){
		this.hanFeiZi =_hanFeiZi;
		this.liSi = _liSi;
		this.type = _type;
	}
	
	@Override
	public void run(){
		while(true){
			if(this.type.equals("breakfast")){ //����Ƿ��ڳ����
				//������ֺ������ڳԷ�����֪ͨ��˹
				if(this.hanFeiZi.isHavingBreakfast()){
					this.liSi.update("�������ڳԷ�");
					//����״̬���������
					this.hanFeiZi.setHavingBreakfast(false);
				}
			}else{//����Ƿ�������
				if(this.hanFeiZi.isHavingFun()){
					this.liSi.update("������������");
					this.hanFeiZi.setHavingFun(false);
				}
			}
			
		}
	}
}
