package com.lx.dem03;
/**
 * @author 何工
 * @date 2019年1月9日 下午4:26:58
 * @Desc 求 1 - 5 求和 
 *   1.打印  1- 5的数字 
 *   2.求和 
 * 
 */
public class Demo02 {

	public static void main(String[] args) {
		
		//定义一个求和的变量 
		int sum = 0 ;
		
		for (int i = 1; i <= 100; i++) {
			
			/**
			 *    sum = sum + i;
			 *    1     0     1
			 *    3     1     2
			 *    6     3     3
			 *    10    6     4
			 *    15    10    5
			 */
			sum +=i; // sum = sum + i; 写法一样
		}
		
		System.out.println("求和的结果:"+ sum);
	}
}
