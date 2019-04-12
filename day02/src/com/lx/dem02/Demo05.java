package com.lx.dem02;

import java.util.Scanner;

/**
 * @author 何工
 * @date 2019年1月9日 下午2:47:13
 * @Desc 测试 三目运算符 
 */
public class Demo05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你的年龄:");

		int age = sc.nextInt();
		
		//定义一个 信息 
		String msg;
		
//		if (age > 18) {
//			msg = "小伙子长大成人了 ....";
//		}else {
//			msg = "好好学习天天向上";
//		}

		// 判断条件 ? 结果1 : 结果2 
		// 条件为true   结果1  
		// 条件为false  结果2  
		msg = age > 18 ? "小伙子长大成人了 ...." : " 好好学习天天向上" ;		
		System.out.println(msg);
	}
}
