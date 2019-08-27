package com.lipengyun.rk.domain;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;


/**
 * 断言编程法和BigDecimal应用
 * 
 * 
 * @ClassName: AssertUtil 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月12日 下午8:06:25
 */
public class AssertUtil {

	/**
	 *  断言为真，如果为假，则抛出自定义异常
	 * @Title: isTrue 
	 * @Description: TODO
	 * @param condition
	 * @param message
	 * @return: void
	 */
	public static void isTrue(boolean condition, String message){
		if(!condition) {
			throw new CMSRuntimeException(message);
		}
	 
	}
	/**
	 * 断言为假，如果为真，则抛出自定义异常
	 * @Title: isFalse 
	 * @Description: TODO
	 * @param condition
	 * @param message
	 * @return: void
	 */
	public static void isFalse(boolean condition, String message){
		if(condition) {
			throw new CMSRuntimeException(message);
		}
	 
	}
	/**
	 * 断言对象不为空，如果为空，则抛出自定义异常
	 * @Title: notNull 
	 * @Description: TODO
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void notNull(Object obj, String message){
		if(obj==null) {
			throw new CMSRuntimeException(message);
		}
	 
	}
	/**
	 * 断言对象必须空，如果不为空，则抛出自定义异常
	 * @Title: isNull 
	 * @Description: TODO
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNull(Object obj, String message){
		if(obj!=null) {
			throw new CMSRuntimeException(message);
		}
	 
	}
	/**
	 * 断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常
	 * @Title: notEmpty 
	 * @Description: TODO
	 * @param coll
	 * @param message
	 * @return: void
	 */
	public static void notEmpty(Collection<?> coll, String message){
		if(coll==null || coll.size()<1 ||coll.isEmpty()) {
			throw new CMSRuntimeException(message);
		}
	 
	}
	/**
	 * 断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常
	 * @Title: notEmpty 
	 * @Description: TODO
	 * @param map
	 * @param message
	 * @return: void
	 */
	public static void notEmpty(Map<?,?> map, String message){
		if(map.isEmpty() || map.size()<1) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常
	 * @Title: hasText 
	 * @Description: TODO
	 * @param condition
	 * @param message
	 * @return: void
	 */
	public static void hasText(String condition, String message){
		if(condition==null || condition.trim().length()==0) {
			throw new CMSRuntimeException(message);
		}
	 
	}
	/**
	 * 断言值必须大于0，如果小于或等于0，则抛出自定义异常
	 * @Title: greaterThanZero 
	 * @Description: TODO
	 * @param value
	 * @param message
	 * @return: void
	 */
	public static void greaterThanZero(BigDecimal value, String message){
		if(value.intValue()<=0) {
			throw new CMSRuntimeException(message);
		}
	 
	}
	
}
