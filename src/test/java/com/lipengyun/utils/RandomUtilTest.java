package com.lipengyun.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lipengyun.rk.domain.RandomUtil;
/**
 * 随机数的测试类
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月11日 下午8:18:11
 */
public class RandomUtilTest {

	/**
	 * 随机获取min-max的随机数
	 * @Title: test 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test() {
		
		
		for(int i=0;i<3;i++) {
			int random = RandomUtil.random(1, 3);
			System.out.println(random);
		}
	}
	
	/**
	 * 随机获取subs个在min-max范围内的随机数
	 * @Title: test01 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test01() {
		
		int[] is = RandomUtil.subRandom(1, 10, 3);
		for(int i:is) {
			System.out.println(i);
		}
	}
	
	/**
	 * 随机随即获取的1-9a-Z的随机数
	 * @Title: test02 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test02() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
	
	/**
	 * 随机获取的1-9a-Z的多个随机数
	 * @Title: test03 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test03() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}
	/**
	 * 2的32次方
	 * @Title: test04 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test04() {
		System.out.println(Math.pow(2, 32));
	}
}
