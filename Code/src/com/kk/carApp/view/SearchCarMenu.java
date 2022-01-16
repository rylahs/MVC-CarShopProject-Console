package com.kk.carApp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchCarMenu {
	public static final int SEARCH_MENU_VIEW_ALL = 1;
	public static final int SEARCH_MENU_NAME = 2;
	public static final int SEARCH_MENU_PROVIDER = 3;
	public static final int SEARCH_MENU_COLOR = 4;
	public static final int SEARCH_MENU_PRODUCE_DATE = 5;
	public static final int SEARCH_MENU_RECEIVE_DATE = 6;
	public static final int SEARCH_MENU_PRICE = 7;
	public static final int SEARCH_MENU_ACCIDENT = 8;
	public static final int SEARCH_MENU_DISPLACEMENT = 9;
	public static final int SEARCH_MENU_DISTANCE_DRIVEN = 10;
	public static final int SEARCH_MENU_FUEL = 11;
	public static final int SEARCH_MENU_TRANSMISSION = 12;
	public static final int SEARCH_MENU_PREV = 0;
	Scanner sc = new Scanner(System.in);

	public int selectMenu() {
		System.out.println("---------------------------------------------");
		System.out.println(">>\t\t�� ���� ���� ����\t\t   <<");
		System.out.println("---------------------------------------------");
		System.out.print(" 1. ��ü ������ ����");
		System.out.print(" 2. ���� �˻�\t"); // Equal
		System.out.println(" 3. ������ �˻�"); // Equal
		System.out.print(" 4. ���� �˻�\t"); // Equal
		System.out.print(" 5. ������ �˻�\t"); // up down?
		System.out.println(" 6. �԰��� �˻�"); // up down?
		System.out.print(" 7. ���� �˻�\t"); // Equal? Up Down?
		System.out.print(" 8. ����� �˻�\t"); // Equal
		System.out.println(" 9. ��ⷮ �˻�"); // ?
		System.out.print("10. ����Ÿ� �˻�\t"); // ?
		System.out.print("11. ���� �˻�\t"); // ?
		System.out.println("12. ���� �˻� "); // Equal
		System.out.println(" 0. ��������"); // Prev
		System.out.println("---------------------------------------------");
		System.out.print("�޴��� �����ϼ��� : ");
		int menu = -1;
		while (true) {
			try {
				menu = sc.nextInt();
				if (menu >= SearchCarMenu.SEARCH_MENU_PREV && menu <= SearchCarMenu.SEARCH_MENU_TRANSMISSION)
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
