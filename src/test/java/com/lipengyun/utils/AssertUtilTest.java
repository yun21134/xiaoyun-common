/*package com.lipengyun.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.lipengyun.rk.domain.AssertUtil;

*//**
 * 测试断言和BigDecimal应用
 * @ClassName: AssertUtilTest 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月12日 下午8:08:40
 *//*
public class AssertUtilTest {

	*//**
	 * 测试断言为真
	 * @Title: testIsTrue 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testIsTrue() {
		String str="123";
		String str1="1234";
		AssertUtil.isTrue(str.equals(str1), "两次结果不一样");
	}

	*//**
	 * 断言为假；
	 * @Title: testIsFalse 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testIsFalse() {
		String str="123";
		String str1="123";
		AssertUtil.isFalse(str.equals(str1), "两次结果怎么能一样呢");
	}

	*//**
	 * 断言对象不为空；
	 * @Title: testIsNull 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testIsNull() {
		
		AssertUtil.isNull(null, "返回结果怎么能是空呢");
	}

	*//**
	 * 断言对象必须空；
	 * @Title: testNotNull 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testNotNull() {
		String str="jjj";
		AssertUtil.notNull(str, "这个对象必须是空的才行");
	}

	*//**
	 * 断言 List 或 Set 集合不为空，没有元素也算空
	 * @Title: testIsNotEmptyCollectionString 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testIsNotEmptyCollectionString() {
		Set set = new HashSet();
		set.add("1");
		AssertUtil.isNotEmpty(set, "这个集合是空的呀!");
	}

	*//**
	 * 断言 Map 集合不为空，没有元素也算空；
	 * @Title: testIsNotEmptyMapOfQQString 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testIsNotEmptyMapOfQQString() {
		Map map = new HashMap<>();
		map.put("1", "1");
		AssertUtil.isNotEmpty(map, "这个集合是空的呀老铁");
	}

	*//**
	 * 断言字符串必须有值，去掉空格后，长度必须大于 0
	 * @Title: testHasText 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testHasText() {
		String str=" ";
		AssertUtil.hasText(str, "这个字符串去掉空格后就是空的呀");
	}

	*//**
	 * 断言值必须是正数(值大于 0)；
	 * @Title: testIsPostive 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testIsPostive() {
		AssertUtil.isPostive(-1>0, "这个数不是正数");
	}
	
	
	*//**
	 * 测试精度,用BigDecimal计算,不损失精度
	 * @Title: testBigDecimal 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void testBigDecimal() {
		double x =  62.77;
		double y = 100;
		System.out.println(x*y);
		BigDecimal b1 = new BigDecimal("66.24");
		BigDecimal b2 = new BigDecimal("100");
		
		System.out.println(b1.multiply(b2));
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.divide(b2));
	}
	
	*//**
	 * pattern用来判断
	 * @Title: test1 
	 * @Description: TODO
	 * @return: void
	 *//*
	@Test
	public void test1() {
		Pattern p = Pattern.compile("a*b");
		 Matcher m = p.matcher("aaaaab");
		 boolean b = m.matches();
		 System.out.println(b);
	}

}
*/