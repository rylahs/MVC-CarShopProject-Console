package com.kk.carApp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kk.carApp.DTO.Car;

public class InsertCarMenu {
	Scanner sc = new Scanner(System.in);

	public Car insertData() {
		System.out.println("-----------------");
		System.out.println("���� ���� �Է��� �����մϴ�.");
		System.out.print("���� �̸� : ");
		String iCarName = sc.nextLine();
		System.out.print("������ : ");
		String iCarProvider = sc.nextLine();
		System.out.print("���� : ");
		String iCarColor = sc.nextLine();
		System.out.print("������ : ");
		String iCarProduceDate = sc.nextLine();
		System.out.print("�԰��� : ");
		String iCarReceiveDate = sc.nextLine();
		System.out.print("���� : ");
		int iCarPrice = 0;
		while (true) {
			try {
				iCarPrice = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				System.out.print("���� : ");
			}
		}
		sc.nextLine();
		System.out.print("�������(��� or �����) : ");
		String iCarAccident = sc.nextLine();
		System.out.print("��ⷮ : ");
		int iCarDisplacement = 0;
		while (true) {
			try {
				iCarDisplacement = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				System.out.print("��ⷮ : ");
			}
		}
		sc.nextLine();
		System.out.print("����Ÿ� : ");
		int iCarDistanceDriven = 0;
		while (true) {
			try {
				iCarDistanceDriven = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				System.out.print("����Ÿ� : ");
			}
		}
		sc.nextLine();
		System.out.print("���� : ");
		String iCarFuel = sc.nextLine();
		System.out.print("����/���� : ");
		String iCarTransmission = sc.nextLine();
		return new Car(iCarName, iCarProvider, iCarColor, iCarProduceDate, iCarReceiveDate, iCarPrice, iCarAccident,
				iCarDisplacement, iCarDistanceDriven, iCarFuel, iCarTransmission);
	}
}
