package com.lx.dem02;

/**
 * @author 何工
 * @date 2019年1月9日 下午4:02:37
 * @Desc 测试switch
 */
public class Demo06 {

	public static void main(String[] args) {

		// state 1 . 付款了 2 已发货 3 运行中 4 收到货了 快递丢了

		int state = 3;
		
		//switch 中的类型    int, byte, char, short, 枚举, 字符串;
		
		//和 if() else if() else() 使用基本上是差不多的 

		// 可以使用 switch 来解决这种 问题
		switch (state) {
		case 1: //case子句中的值必须是常量
			System.out.println("付款了");
			
			// break语句用来在执行完一个case分支后使程序跳出switch语句块 
			// break 不能少些   少写 后会 case 穿透 
			
			break;
			//break 后面 不能添加代码 
		case 2:
			System.out.println("已发货 ");
			break;
		case 3:
			System.out.println("运行中");
			break; 
		case 4:
			System.out.println("收到货");
			break;

		default: 
			System.out.println("快递丢了");
			break;
		}

//		if (state == 1) {
//
//		}
//
//		if (state == 2) {
//
//		}
//
//		if (state == 3) {
//
//		}

	}

}
