/*
 * # nextLine()�� next()�� ����
 * 1. nextLine() : ���� �Ѷ��� ��ü�� �Է¹޴´�. 
 * 2. next() : ������ �������� �Ѵܾ �Է¹޴´�.
 */
package day_28;

import java.util.Scanner;

public class StringEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * # hello java �Է½�,
		 * nextLine() �޼���� Hello Java ��� ��µ�����,
		 * next() �޼���� Hello�� ��µȴ�.
		 */
		
		System.out.print("�̸� �Է�");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println();
		System.out.print("�̸� �Է�");
		name = sc.next();
		System.out.println(name);
	}
}
