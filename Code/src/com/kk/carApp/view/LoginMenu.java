package com.kk.carApp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginMenu {
	public static final int LOGIN_MENU_LOGIN = 1;
	public static final int LOGIN_MENU_REGISTER = 2;
	public static final int LOGIN_MENU_MODIFY = 3;
	public static final int LOGIN_MENU_DELETE = 4;
	public static final int LOGIN_MENU_VIEW = 5;
	public static final int LOGIN_MENU_EXIT = 0;
	
	Scanner sc = new Scanner(System.in);
	public int menu() {
		int menu = 0;
		System.out.println("---------------------");
		System.out.println("  1. �α���");
		System.out.println("  2. ȸ�� ����");
		System.out.println("  3. ȸ�� ���� ����");
		System.out.println("  4. ȸ�� Ż��");
//		System.out.println("  5. (�ӽ�) ȸ�� ���� ����");
		System.out.println("  0. ���α׷� ����");
		System.out.println("---------------------");
		System.out.print("�޴��� �����ϼ��� : ");
		while (true) {
			try {
				menu = sc.nextInt();
				if (menu >= LoginMenu.LOGIN_MENU_EXIT && menu <= LoginMenu.LOGIN_MENU_DELETE) //|| menu == LOGIN_MENU_VIEW)
					break;
				else
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		return menu;
	}
	
}
