
    /**  
    * @Title: DateUtilTest.java
    * @Package com.lige.common.utils
    * @Description: TODO(用一句话描述该文件做什么)
    * @author DELL
    * @date 2019年10月11日
    * @version V1.0  
    */
    
package com.lige.common.utils;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.junit.Test;

/**
    * @ClassName: DateUtilTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author DELL
    * @date 2019年10月11日
    *
    */

public class DateUtilTest {

	public void testgetAge() {
		int i = DateUtil.getAge(new Date());
		System.out.println(i);
	}
	//月初
	@Test
	public void testGetDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2018, 2, 25, 14, 12, 28);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	
	@Test
	public void testGetDateByFullMonth() {
	 
		Calendar c = Calendar.getInstance();
		c.set(2018, 1, 25, 14, 12, 28);
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}
