package com.lx.dem02;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * if else 语句 
 */
public class Demo02 {

	public static void main(String[] args) {

		// 键盘输入学生成绩  如果大于 80 奖励 小米手机一部  否则 代码一天
		
		// 创建扫描器 
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("请输入你的考试成绩:");
		
		//定义一个分数变量 
		int score = sc.nextInt();
		
		//判断 分数 
		if (score > 80) {
			//如果满足 走这个代码块 
			System.out.println("奖励小米手机一部 ");
		} else {
			//否则就走这个代码块 
			System.out.println("代码一天 ");
		}
	}

}
