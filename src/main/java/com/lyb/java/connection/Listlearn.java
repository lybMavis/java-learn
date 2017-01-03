/**
 * 
 */
package com.lyb.java.connection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liangyongbiao
 *
 */
public class Listlearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();
		list.add(1);
		list.add("dddd");
		for (Object object : list) {
			System.out.println(object);
		}

		// 三个问题：
		//考察Integer
		Integer a = 100, b = 100;
		Integer c = 150, d = 150;
		System.out.println(a == b);
		System.out.println(c == d);

		//考察常量池、堆內存、String的理解
		String str1 = new StringBuilder("计算机").append("软件").toString();
		String str2=new StringBuilder("ja").append("va").toString();
		System.out.println(str1.intern()==str1);
		System.out.println(str2.intern()==str2);
		
		//考察堆float的理解，一般建议使用Bigdecimal
		Float xx= 2.0f;
		Float yy=1.8f;
		Float tt = xx-yy;
		System.out.println(tt);
		//使用下面的方法解决上面的问题
		BigDecimal x1 = new BigDecimal(Double.toString(2.0));
		BigDecimal y1 = new BigDecimal(Double.toString(1.8));
		double t1 = x1.subtract(y1).doubleValue();
		System.out.println(t1);
	}

}
