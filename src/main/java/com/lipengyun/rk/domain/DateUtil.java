package com.lipengyun.rk.domain;

import java.util.Calendar;
import java.util.Date;

/**
 * DateUtil
 * @author 李鹏云
 * 
 */
public class DateUtil {

	/**
	 * 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 * @Title: getDateByFullMonth 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByFullMonth(Date src){
		//TODO 实现代码
		//用传入的日期,初始化日历类. 然后让当前日期设置为下个月的月初,最后在
		//月初减去 1秒.  就能变成传入日期的月末了
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		//让当前月份加1
		c.add(Calendar.MONTH, 1);
		//获取月初
		Date monthStart = getDateByInitMonth(c.getTime());
		//用月初初始化日历类
		c.setTime(monthStart);
		//用月初时间  -1 秒
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
		
		}
	
	/**
	 * 获取当月一号日期
	 * @Title: getDateByInitMonth 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByInitMonth(Date src){
		//获取Calendar对象
		Calendar c = Calendar.getInstance();
		//用传入的时间初始化日历对象
		c.setTime(src);
		
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		System.out.println(c.getTime());
		return c.getTime();
		}
	
	
	/**
	 * 定义一个起始时间,在起始时间和当前时间中随机生成一个时间
	 * @Title: randomDate 
	 * @Description: TODO
	 * @param startDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		//获取当前时间的毫秒数
		long endMillis = c.getTimeInMillis();
		//用传入的日期初始化日历类Calendar
		c.setTime(startDate);
		//获取开始时间的毫秒数
		long startMillis = c.getTimeInMillis();
		//在开始时间毫秒数和当前时间毫秒数之间随机生成一个毫秒数
		long x = (long)(Math.random()*(endMillis-startMillis+1)+startMillis);
		//用时间差创建日历类
		c.setTimeInMillis(x);
		return c.getTime();
	}
	
	public static Date augmentDate(Date date, Integer number) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.HOUR, number);
		return c.getTime();
	}
	
	
	
}
