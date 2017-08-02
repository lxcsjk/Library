package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �������۵�ͼ��
 */
public class OffNovelBook extends NovelBook {
	public OffNovelBook(String _name,int _price,String _author){
		super(_name,_price,_author);
	}
	
	//��д���ۼ۸�
	@Override
	public int getPrice(){
		//ԭ��
		int selfPrice = super.getPrice();
		int offPrice=0;
		if(selfPrice>4000){  //ԭ�۴���40Ԫ�����9��
			offPrice = selfPrice * 90 /100;
		}else{
			offPrice = selfPrice * 80 /100;
		}
		
		return offPrice;
	}
	
}
