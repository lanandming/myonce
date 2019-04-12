package com.lx.dem02;

import java.util.Scanner;

/**
 * @author 何工
 * @date 2019年1月9日 下午2:33:20
 * @Desc 测试 if()else if() 语句
 */
public class Demo03 {

	public static void main(String[] args) {

		// 输入 你的银行存款 买车
		// 50- 100 万 保时捷
		// 20 - 50 汉兰达
		// 5 - 20 吉利
		// 5 < 买 捷安特 自行车
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你的情况存款 :");

		int money = sc.nextInt();
		// 50_0000 < money < 100_0000 java中没有这种写法
		// 先判断 if 之后 一次判断 elseif 都不满足 最后判断  else
		if (money >= 50_0000) {
			System.out.println("买保时捷 ");
		} else if (money >= 20_0000 && money < 50_0000) {
			System.out.println("买汉兰达 ");
		} else if (money >= 5_0000 && money < 20_0000) {
			System.out.println("买汉兰达 ");
		} else {
			System.out.println("买一辆自行车 ");
		}
		
	}

}
