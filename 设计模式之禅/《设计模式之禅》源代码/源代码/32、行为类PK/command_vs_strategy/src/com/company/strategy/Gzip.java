package com.company.strategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Gzip implements Algorithm {

	//gzip��ѹ���㷨
	public boolean compress(String source, String to) {
		System.out.println(source + " --> " +to + " GZIPѹ���ɹ�!");
		return true;		
	}
	
	//gzip��ѹ���㷨
	public boolean uncompress(String source,String to){
		System.out.println(source + " --> " +to + " GZIP��ѹ���ɹ�!");
		return true;
	}
}
