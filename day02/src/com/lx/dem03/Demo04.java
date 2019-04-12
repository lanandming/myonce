package com.lx.dem03;
/**
 * @author 何工
 * @date 2019年1月9日 下午4:35:48
 * @Desc  问  ? 0  - 2019 有多个闰年 
 *       1. 拿到所有的年份   for循环 
 *       2. 判断 年份是否为  闰年    
 *                                如果是  100 倍数    整除 400      year % 100 == 0 && year%400 == 0
 *                                             || 
 *                                不是100 倍数            整除  4       year % 100 != 0 && year%4 == 0                 
 *                             
 *       3. 统计 有多少个闰年 
 */
public class Demo04 {

	public static void main(String[] args) {
		
		//定义一个统计的变量  
		int count = 0;
		
		//拿到所有的年份  
		for (int i = 0; i <= 2019; i++) {
			
			// 判断是否是闰年 
			if (( i % 100 == 0 && i%400 == 0) || (i % 100 != 0 && i%4 == 0)) {
				 
				//统计的操作 
				count++;
			}
			
		}
		System.out.println("闰年一共有:" + count);
	}
}
