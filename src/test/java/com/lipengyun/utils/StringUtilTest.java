package com.lipengyun.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.lipengyun.rk.domain.DateUtil;
import com.lipengyun.rk.domain.StringUtil;

/**
 * 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月11日 下午8:11:58
 */
public class StringUtilTest {

	/**
	 * 测试判断源字符串是否有值，空引号(空白字符串)也算没值
	 * @Title: testHasLength 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testHasLength() {
		String str="111";
		boolean hasLength = StringUtil.hasLength(str);
		System.out.println(hasLength);
	}

	/**
	 * 测试判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	 * @Title: testHasText 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testHasText() {
		String str="111";
		boolean hasLength = StringUtil.hasText(str);
		System.out.println(hasLength);
	}

	/**
	 * 返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内
	 * @Title: testRandomChineseString 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString();
		System.out.println(string);
	}
	
	/**
	 * 返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内,拼接获取到的汉字
	 * @Title: randomChineseString1 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void randomChineseString1() {
		String string = StringUtil.randomChineseString1(4);
		System.out.println(string);
	}

	/**返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字
	 * 
	 * @Title: testGenerateChineseName 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	/**
	 * 获取时间日期
	 * @Title: testDateUtil 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testDateUtil() {
		//获取日历类
		Calendar c = Calendar.getInstance();
		//设置起始时间
		c.set(2010, 0,1);
		//转换日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<100;i++) {
			//调用工具类
			Date date = DateUtil.randomDate(c.getTime());
			System.out.println(df.format(date));
		}
	}

}
