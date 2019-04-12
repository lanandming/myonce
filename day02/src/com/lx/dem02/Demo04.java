package com.lx.dem02;

/**
 * @author 何工
 * @date 2019年1月9日 下午2:42:56
 * @Desc 测试 if嵌套
 *       *
 *      ***
 *     *****
 *    *******
 * 
 */
public class Demo04 {

	public static void main(String[] args) {

		int age = 24;

		// if中有if 就是 嵌套 
		if (age > 18) {
			System.out.println("成年人");
			if (age > 20 && age < 35) {
				System.out.println("青年");
			} else {
				System.out.println("小老头");
			}
		} else {
			System.out.println("小学生");
		}
	}
}
