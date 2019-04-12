package com.lx.dem03;
/**
 * @author 何工
 * @date 2019年1月9日 下午4:32:48
 * @Desc  求  1-100 的偶数求和 
 *       
 *       1. 打印  1- 100 的偶数 
 *       2. 求和  
 */
public class Demo03 {

	public static void main(String[] args) {
		
		//定义一个变量 
		int sum = 0;

		for (int i = 1; i <= 100 ; i++) {
			
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("求1 - 100  的偶数求和:" + sum);
	}
}
