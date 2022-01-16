package com.kk.carApp.DTO;

public class Member {
	private String rank;
	private String id;
	private String password;
	private String memberName;
	private String memberAddress;

	public Member() {
		super();
	}

	public Member(String id, String password, String memberName, String memberAddress) {
		super();
		this.rank = "manager";
		this.id = id;
		this.password = password;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}

	public Member(String rank, String id, String password, String memberName, String memberAddress) {
		super();
		this.rank = rank;
		this.id = id;
		this.password = password;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}

	// Getter, Setter
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassWord(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public void printMemberInfo() {
		System.out.println("���� : " + rank);
		System.out.println("ID : " + id); // �̸�
		System.out.println("��й�ȣ : " + password); // ȸ��
		System.out.println("�̸� : " + memberName);
		System.out.println("�ּ� : " + memberAddress);
		System.out.println("---------------------");
	}

}
