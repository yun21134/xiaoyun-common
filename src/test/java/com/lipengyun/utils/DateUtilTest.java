package com.lipengyun.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.lipengyun.rk.domain.DateUtil;

public class DateUtilTest {

	/**
	 * 测试月初
	 * @Title: test 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.getDateByInitMonth(new Date());
		System.out.println(df.format(date));
	}
	
	/**
	 * 测试月末
	 * @Title: testGetDateByFullMonth 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 1);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		System.out.println(df.format(date));
		
	}
	
	/**
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil
	 * 工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串
	 * @Title: test1 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test1() {
	
		SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd");
		String startDate = df.format(DateUtil.getDateByInitMonth(new Date()));
		String endDate = df.format(DateUtil.getDateByFullMonth(new Date()));
		
		String sql = "select * from t_order where create_time>='{1}'"
				+ " and create_time<='{2}' ";
		
		String sql1 = sql.replace("{1}", startDate);
		String sql2 = sql1.replace("{2}", endDate);
		System.out.println(sql2);
		
	
	}

}
