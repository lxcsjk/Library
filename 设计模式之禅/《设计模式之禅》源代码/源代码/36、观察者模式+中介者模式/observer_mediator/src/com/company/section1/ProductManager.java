package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ProductManager {
	
	//�Ƿ���Դ���һ����Ʒ
	private boolean isPermittedCreate = false;
	
	//����һ����Ʒ
	public Product createProduct(String name){
		//�����޸�Ȩ�ޣ�������
		isPermittedCreate = true;
		Product p = new Product(this,name);
		return p;
	}
	
	//����һ����Ʒ
	public void abandonProduct(Product p){
		//����һ����Ʒ������ɾ�����ݿ��¼
		p = null;
	}
	
	//�޸�һ����Ʒ
	public void editProduct(Product p,String name){
		//�޸ĺ�Ĳ�Ʒ
		p.setName(name);
	}
	
	//����Ƿ���Դ���һ����Ʒ
	public boolean isCreateProduct(){
		return isPermittedCreate;
	}
	
	//��¡һ����Ʒ
	public Product clone(Product p){
		//������¡�¼�
		return p.clone();
	}
}