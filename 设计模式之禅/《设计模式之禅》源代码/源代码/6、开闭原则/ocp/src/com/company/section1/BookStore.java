package com.company.section1;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��������鼮
 */
public class BookStore {
	private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
	
	//��̬ģ���ʼ������Ŀ��һ���Ǵӳ־ò��ʼ������
	static{
		bookList.add(new NovelBook("�����˲�",3200,"��ӹ"));
		bookList.add(new NovelBook("����ʥĸԺ",5600,"���"));
		bookList.add(new NovelBook("��������",3500,"���"));
		bookList.add(new NovelBook("��ƿ÷",4300,"����ЦЦ��"));
	}
	
	//ģ���������
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		formatter.setMaximumFractionDigits(2);
		System.out.println("------------������ȥ���鼮��¼���£�---------------------");
		for(IBook book:bookList){
			System.out.println("�鼮���ƣ�" + book.getName()+"\t�鼮���ߣ�" + book.getAuthor()+ "\t�鼮�۸�" + formatter.format(book.getPrice()/100.0)+"Ԫ");
		}
	}
}
