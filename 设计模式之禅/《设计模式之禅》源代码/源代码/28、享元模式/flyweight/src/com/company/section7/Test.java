package com.company.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Test {

    public static void main(String[] args) { 
        String str1 = "��г"; 
        String str2 = "���"; 
        String str3 = "��г���"; 
        String str4; 

        str4 = str1 + str2; 
        System.out.println(str3 == str4); 

        str4 = (str1 + str2).intern(); 
        System.out.println(str3 == str4); 
    } 
}
