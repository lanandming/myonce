package com.lx.dem03;

/**
 * @author 何工
 * @date 2019年1月9日 下午4:16:06
 * @Desc 打印 5 句好好学习
 */
public class Demo01 {
	public static void main(String[] args) {

		// 有重复执行的代码   可以使用循环 
		System.out.println("好好学习");
		System.out.println("好好学习");
		System.out.println("好好学习");
		System.out.println("好好学习");
		System.out.println("好好学习");
		
		System.out.println("**********循环操作*************");

		for (int i = 0; i < 5; i++) {
			System.out.println("好好学习" + i);
		}
	}
}
