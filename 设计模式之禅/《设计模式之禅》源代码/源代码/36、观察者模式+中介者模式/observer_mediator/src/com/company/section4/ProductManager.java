package com.company.section4;

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
		//����һ�������¼�
		new ProductEvent(p,ProductEventType.NEW_PRODUCT);
		return p;
	}
	
	//����һ����Ʒ
	public void abandonProduct(Product p){
		//����һ����Ʒ������ɾ�����ݿ��¼
		
		//����ɾ���¼�
		new ProductEvent(p,ProductEventType.DEL_PRODUCT);
		p = null;
	}
	
	//�޸�һ����Ʒ
	public void editProduct(Product p,String name){
		//�޸ĺ�Ĳ�Ʒ
		p.setName(name);
		//�����޸��¼�
		new ProductEvent(p,ProductEventType.EDIT_PRODUCT);
	}
	
	//����Ƿ���Դ���һ����Ʒ
	public boolean isCreateProduct(){
		return isPermittedCreate;
	}
	
	//��¡һ����Ʒ
	public Product clone(Product p){
		//������¡�¼�
		new ProductEvent(p,ProductEventType.CLONE_PRODUCT);
		return p.clone();
	}
}
