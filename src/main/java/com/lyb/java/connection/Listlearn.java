/**
 * 
 */
package com.lyb.java.connection;

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

	}

}
