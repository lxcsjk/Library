package com.company.strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Zip implements Algorithm {

	//zip��ʽ��ѹ���㷨
	public boolean compress(String source, String to) {
		System.out.println(source + " --> " +to + " ZIPѹ���ɹ�!");
		return true;
	}
	
	//zip��ʽ�Ľ�ѹ���㷨
	public boolean uncompress(String source,String to){
		System.out.println(source + " --> " +to + " ZIP��ѹ���ɹ�!");
		return true;
	}
}
