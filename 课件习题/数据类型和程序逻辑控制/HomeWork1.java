import java.util.Scanner;
//import java.lang.Math;
public class HomeWork1{
	public static void main1(String[] args) {
		// 给定两个int变量, 交换变量的值
		int a = 10;
		int b = 20;
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println(a); // 20
		System.out.println(b); // 10

		// 给定三个int变量, 求其中的最大值和最小值
		// 10 15 20
		int a = 10;
		int b = 15;
		int c = 20;
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if(a < c) {
			int tmp = a;
			a = c;
			c = tmp;
		}
		if(b < c) {
			int tmp = b;
			b = c;
			c = tmp;
		}
		System.out.println(a); // 20
		System.out.println(c); // 10
	}


	public static void main2(String[] args) {
		// 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19 - 28), 中年(29 - 55), 老年(56以上)
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age <= 0) {
			System.out.println("您的输入有误");
		} else if(age <= 18) {
			System.out.println("少年");
		} else if(age > 18 && age <= 28) {
			System.out.println("青年");
		} else if(age > 28 && age <= 55) {
			System.out.println("中年");
		} else {
			System.out.println("老年");
		}
	}

	public static void main3(String[] args) {
		// 判断一个数字是否是素数
		// 素数: 一个大于1的正整数, 除了1和它本身以外, 不能被其他正整数整除
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 输入一个数字
		if(num < 2) {
			System.out.println("不是素数");
		}
		int i = 2;
		for(i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("不是素数");
				break;
			}
		}
		if(i == num) {
			System.out.println("是素数");
		}
		
		// 打印1 - 100 之间所有的素数
		int i = 1;
		for(i = 1; i <= 100; i++) {
			if(i < 2) {
				System.out.println("");
			}
			int j = 2;
			for(j = 2; j < i; j++) {
				if(i % j == 0) {
					break;
				}
			}
			if(j == i) {
				System.out.println(i);
			}
		}
		
	}


	public static void main4(String[] args) {
		// 输出1000到2000之间所有的闰年
		int year = 1000;
		int count = 0;
		for(year = 1000; year <= 2000; year++) {
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print("" + year + ",");
				count++;
			}
		}
		System.out.println("");
		System.out.println(count); // 243
	}

	public static void main5(String[] args) {
		// 输出乘法口诀表
		int i = 1; 
		for(i = 1; i <= 9; i++) {
			int j = 1;
			for(j = 1; j <= i; j++) {
				int ret = i * j;
				System.out.print(i + "*" + j + "=" + ret + " ");
			}
			System.out.println();
		}
	}

	public static void main6(String[] args) {
		// 求两个正整数的最大公约数
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a < 0 || b < 0) {
			System.out.println("您的输入有误");
		}
		int i = (a > b ? b : a); // 让i为两个数中的较小值
		while(i > 0) {
			if(a % i == 0 && b % i == 0) {
				System.out.println("最大公约数为: " + i);
				break;
			}
			i--;
		}
	}


	public static void main7(String[] args) {
		// 计算 1/1 - 1/2 + 1/3 - 1/4 + 1/5 ...... + 1/99 - 1/100
		int i = 1;
		double j = 1.0;
		double ret = 0;
		for(i = 1; i <= 100; i++) {
			ret = ret + j / i;
			j = -j;
		}
		System.out.println(ret);
	}


	public static void main8(String[] args) {
		// 编写程序计算一下 1 - 100 中有多少个数字9
		// 个位: 9 19 29 39 49 59 69 79 89 99
		// 十位: 90 91 92 93 94 95 96 97 98 99
		int i = 1;
		int count = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 10 == 9) {
				count++;
			}
			if (i / 10 == 9) {
				count++;
			}
		}
		System.out.println(count);
	}


	public static void main(String[] args) {
		
		int i = 0;
		double sum = 0;
		for(i = 0; i <= 999; i++) {
			int j = i;
			if(j > 99) {
				while(j != 0) {
					sum = sum + Math.pow((j % 10), 3);
					j /= 10;
				}
				if(sum == i) {
					System.out.println(i);
				}
				sum = 0;
			} 
		}
	}
}