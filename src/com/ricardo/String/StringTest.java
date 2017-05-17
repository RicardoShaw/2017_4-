package com.ricardo.String;

public class StringTest {
	
	
	public void testToStringAndIntern(){
		
		/**
		 * String���intern()����������String Pool�ж�̬��Ӷ���,
		 * ����intern����ʱ����������Ѿ�����һ�����ڴ�String������ַ���(ͨ��equals(Object)����ȷ��)���򷵻س��е��ַ�����
		 * ���򣬽���String������ӵ����У����ҷ��ش�String��������á�
		 */
		String s1 = new StringBuilder("go")
    	.append("od").toString();
	System.out.println(s1.intern() == s1); //true
	String s2 = new StringBuilder("ja")
		.append("va").toString();
	System.out.println(s2.intern() == s2); //(��Ϊjvm�����е�ʱ����Ѿ���java�ַ������뵽�ַ���������������,����s2��ʵ��copy��һ��java�ַ�������,�����Ƕ��ַ������������������)false
	
	String s3 = new StringBuilder("test").append("hehe").toString();
	System.out.println(s3.intern() == s3);
	
	}
	
	
	public void test2(){
		String str1 = "HelloWorld"; //str1ָ�򷽷�����HelloWorld�ַ���������
		String str2 = new String("HelloWorld");//str2ָ����ϵ�HelloWorld�ַ������������
		String str3 = "Hello";
		String str4 = "World";
		String str5 = "Hello" + "World"; //��ͬ��"HelloWorld"
		
		/**
		 * �ַ�����+�����䱾���Ǵ�����StringBuilder�������append������
		 * Ȼ��ƴ�Ӻ��StringBuilder������toString���������String����
		 */
		String str6 = str3 + str4;  //�����ڶ��д�����һ���µ�HelloWorld�ַ�������
		System.out.println( str1 == str2);    //(��������HelloWorld����ϵ�HelloWorld����ͬһ������)false
		System.out.println( str1 == str5); 		// true
		System.out.println( str1 == str6);		//false
		System.out.println( str1 == str6.intern()); //true
		System.out.println( str2 == str2.intern());	//false
		System.out.println( str2 == str6); //false
		
		
	
	}
	
	
	
	public static void main(String [] args){
		
		StringTest test = new StringTest();
		test.testToStringAndIntern();
		test.test2();
		
	}
	
}
