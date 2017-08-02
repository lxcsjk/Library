package com.company;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all.
 *         
 */
@SuppressWarnings("all")
public class ClassUtils {
	
	//���ݸ�����ҵ����е����࣬Ĭ�����������͸��඼��ͬһ��������
	public static List<Class> getSonClass(Class fatherClass){
		//����һ������ֵ
		List<Class> returnClassList = new ArrayList<Class>();
		//��ð�����
		String packageName = fatherClass.getPackage().getName();
		//��ð��е�������
		List<Class>  packClasses = getClasses(packageName);
		//�ж��Ƿ���������
		for(Class c:packClasses){
			if(fatherClass.isAssignableFrom(c) && !fatherClass.equals(c)){
				returnClassList.add(c);
			}
		}	
		return returnClassList;
	}

	
	
	//��һ�����в��ҳ����е��࣬��jar���в��ܲ���
	private static List<Class> getClasses(String packageName) {
		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = null;
		try {
			resources = classLoader.getResources(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		ArrayList<Class> classes = new ArrayList<Class>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return classes;
	}
	
	
	private static List<Class> findClasses(File directory, String packageName) {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                try {
					classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
            }
        }
        return classes;
    }

}
