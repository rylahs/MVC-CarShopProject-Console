package com.kk.carApp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModifyCarMenu {
	public static final int MODIFY_MENU_VIEW_ALL = 1;
	public static final int MODIFY_MENU_DO = 2;
	public static final int MODIFY_MENU_PREV = 0;

	public static final int MODIFY_MOD_ALL = 1;
	public static final int MODIFY_MOD_NAME = 2;
	public static final int MODIFY_MOD_PROVIDER = 3;
	public static final int MODIFY_MOD_COLOR = 4;
	public static final int MODIFY_MOD_PRODUCE_DATE = 5;
	public static final int MODIFY_MOD_RECEIVE_DATE = 6;
	public static final int MODIFY_MOD_PRICE = 7;
	public static final int MODIFY_MOD_ACCIDENT = 8;
	public static final int MODIFY_MOD_DISPLACEMENT = 9;
	public static final int MODIFY_MOD_DISTANCE_DRIVEN = 10;
	public static final int MODIFY_MOD_FUEL = 11;
	public static final int MODIFY_MOD_TRANSMISSION = 12;
	public static final int MODIFY_MOD_PREV = 0;

	Scanner sc = new Scanner(System.in);

	public int modifyModSelect() {
		System.out.println("---------------------------------------------");
		System.out.println(">>\t\t�� ���� ���� ����\t\t   <<");
		System.out.println("---------------------------------------------");
		System.out.print(" 1. ��ü ������ ����");
		System.out.print(" 2. ���� ����\t");
		System.out.println(" 3. ������ ����");
		System.out.print(" 4. ���� ����\t");
		System.out.print(" 5. ������ ����\t");
		System.out.println(" 6. �԰��� ����");
		System.out.print(" 7. ���� ����\t");
		System.out.print(" 8. ����� ����\t");
		System.out.println(" 9. ��ⷮ ����");
		System.out.print("10. ����Ÿ� ����\t");
		System.out.print("11. ���� ����\t");
		System.out.println("12. ���� ���� ");
		System.out.println(" 0. ��������");
		System.out.println("---------------------------------------------");
		System.out.print("�޴��� �����ϼ��� : ");
		int menu = -1;
		while (true) {
			try {
				menu = sc.nextInt();
				if (menu >= ModifyCarMenu.MODIFY_MOD_PREV && menu <= ModifyCarMenu.MODIFY_MOD_TRANSMISSION)
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

	public int modifyMenu() {
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
				if (menu >= ModifyCarMenu.MODIFY_MENU_PREV && menu <= ModifyCarMenu.MODIFY_MENU_DO)
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
