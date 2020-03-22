/*
 * # nextLine()과 next()의 차이
 * 1. nextLine() : 문장 한라인 전체를 입력받는다. 
 * 2. next() : 공백을 기준으로 한단어씩 입력받는다.
 */
package day_28;

import java.util.Scanner;

public class StringEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * # hello java 입력시,
		 * nextLine() 메서드는 Hello Java 모두 출력되지만,
		 * next() 메서드는 Hello만 출력된다.
		 */
		
		System.out.print("이름 입력");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println();
		System.out.print("이름 입력");
		name = sc.next();
		System.out.println(name);
	}
}
