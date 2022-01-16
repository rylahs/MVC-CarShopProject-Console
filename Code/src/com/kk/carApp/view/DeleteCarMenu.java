package com.kk.carApp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteCarMenu {
	public static final int DELETE_MENU_VIEW_ALL = 1;
	public static final int DELETE_MENU_DO = 2;
	public static final int DELETE_MENU_PREV = 0;

	Scanner sc = new Scanner(System.in);

	public int deleteMenu() {
		System.out.println("---------------------");
		System.out.println("    ���� ���� ����");
		System.out.println("---------------------");
		System.out.println(" 1. ��ü ������ ����");
		System.out.println(" 2. �����ϱ�");
		System.out.println(" 0. ��������");
		System.out.println("---------------------");
		System.out.print("�޴��� �����ϼ��� : ");
		int menu = -1;
		while (true) {
			try {
				menu = sc.nextInt();
				if (menu >= DeleteCarMenu.DELETE_MENU_PREV && menu <= DeleteCarMenu.DELETE_MENU_DO)
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
