package com.kk.carApp.DTO;

public class Car {
	// �߰��� �Ǹ� ���α׷�
	// Member Variable
	private String name; // ����
	private String provider; // ȸ��
	private String color; // ����
	private String produceDate; // ������
	private String receiveDate; // �԰���
	private int price; // ����
	private String accident; // �����
	private int displacement; // ��ⷮ
	private int distanceDriven; // �Ÿ�
	private String fuel; // ���� ����
	private String transmission; // ����, ����

	// Default Construct (just use Debug) �������� ������ ����
	public Car() {
		super();
	}

	// Constructor
	public Car(String name, String provider, String color, String produceDate, String receiveDate, int price,
			String accident, int displacement, int distanceDriven, String fuel, String transmission) {
		super();
		this.name = name;
		this.provider = provider;
		this.color = color;
		this.produceDate = produceDate;
		this.receiveDate = receiveDate;
		this.price = price;
		this.accident = accident;
		this.displacement = displacement;
		this.distanceDriven = distanceDriven;
		this.fuel = fuel;
		this.transmission = transmission;
	}

	// Getter , Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProduceDate() {
		return produceDate;
	}

	public void setProduceDate(String produceDate) {
		this.produceDate = produceDate;
	}

	public String getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAccident() {
		return accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getDistanceDriven() {
		return distanceDriven;
	}

	public void setDistanceDriven(int distanceDriven) {
		this.distanceDriven = distanceDriven;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	// print Object
	public void printCarInfo() {
		System.out.println(" ���� : " + name); // �̸�
		System.out.println(" ȸ�� : " + provider); // ȸ��
		System.out.println(" ���� : " + color); // ����
		System.out.println(" ������ : " + produceDate); // ������
		System.out.println(" ������ : " + receiveDate); // �޴� ��¥
		System.out.println(" ���� : " + price); // ����
		System.out.println(" ��� : " + accident);
		System.out.println(" ��ⷮ : " + displacement); // ��ⷮ
		System.out.println(" ����Ÿ� : " + distanceDriven); // �Ÿ�
		System.out.println(" ���� : " + fuel); // ���� ����
		System.out.println(" ���� : " + transmission); // ����, ����
		System.out.println("-----------------------");
	}
}
