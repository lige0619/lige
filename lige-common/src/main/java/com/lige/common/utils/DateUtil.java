
    /**  
    * @Title: DateUtil.java
    * @Package com.lige.common.utils
    * @Description: TODO(用一句话描述该文件做什么)
    * @author DELL
    * @date 2019年10月11日
    * @version V1.0  
    */
    
package com.lige.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
    * @ClassName: DateUtil
    * @Description: 日期工具类
    * @author DELL
    * @date 2019年10月11日
    *
    */

public class DateUtil {
	
	/**
	 * 
	    * @Title: getDateByInitMonth
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param 根据当前日期求出年龄
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static int getAge(Date birthday) {
		
		//获取日历类
		Calendar c = Calendar.getInstance();
		//获取当前日期
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);
		//获取年龄日期
		int yearBirthday = c.get(Calendar.YEAR);
		int monthBirthday = c.get(Calendar.MONTH);
		int dateBirthday = c.get(Calendar.DAY_OF_MONTH);
		//年龄
		int age = yearNow-yearBirthday;
		//判断
		if(monthBirthday > monthNow) {
			age--;
		}
		if(monthBirthday==monthNow && dateBirthday>dateNow) {
			age--;
		}
		return age;
	}
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
	//TODO 实现代码

		//获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期在初始化日历类
		c.setTime(src);
		//改变日期 设置为月初
		c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
	    //让传过来的日期的月份加一 然后再把传过来的时 分  秒变为0 然后在用秒减1
		//获取日历类
	    Calendar c = Calendar.getInstance();
	    c.setTime(src);
	    //让月份加一
		c.add(Calendar.MONTH, 1);
		//调用月初的方法  返回月初
		Date date = getDateByInitMonth(c.getTime());
		//用月初的初始化日历类
		c.setTime(date);
		//让日期减去一秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}


}
