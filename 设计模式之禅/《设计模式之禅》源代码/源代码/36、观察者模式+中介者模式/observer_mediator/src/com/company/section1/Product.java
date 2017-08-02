package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Product implements Cloneable{
	//��Ʒ����
	private String name;
	//�Ƿ�������Ա��
	private boolean canChanged = false;
	
	//����һ���µĲ�Ʒ
	public Product(ProductManager manager,String _name){
		//��������Ʒ
		if(manager.isCreateProduct()){
			canChanged =true;
			this.name = _name;
		}				
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(canChanged){
			this.name = name;
		}
		
	}
	
	//��дclone����
	@Override
	public Product clone(){
		Product p =null;
		try {
			p =(Product)super.clone();
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}
		return p;
	}
}
