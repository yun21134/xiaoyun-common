package com.lipengyun.rk.domain;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 随机数的处理类
 * @ClassName: RandomUtil 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月11日 下午8:15:12
 */
public class RandomUtil {

	
	/**
	 * 从1-9a-Z中随即获取随即获取length个数
	 * @Title: randomString 
	 * @Description: TODO
	 * @param length
	 * @return
	 * @return: String
	 */
	public static String randomString(int length){
		String str="";
		for(int i =0;i<length;i++) {
			str+=randomCharacter();
		}
		return str;
		}
	
	/**
	 * 从1-9a-Z中随即获取
	 * @Title: randomCharacter 
	 * @Description: TODO
	 * @return
	 * @return: char
	 */
	public static char randomCharacter (){
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
		}
	
	
	/**
	 * set集合中存储无序不重复的集合
	 * @Title: subRandom 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom (int min, int max, int subs){
		//定义数组,subs为数组的长度
		int[] values = new int[subs];
		
		//set集合
		Set<Integer> set = new HashSet<>();
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		int j=0;
		for(Integer integer:set) {
			values[j]=integer;
			j++;
		}
		
		return values;
		//TODO 实现代码
		}
	
	//从min - max 中获取随机数
	public static int random(int min, int max){
		//TODO 实现代码
		
		Random r = new Random();
		return r.nextInt(max-min+1)+min;
		}
	
	
	
}
