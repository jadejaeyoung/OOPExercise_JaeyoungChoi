package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	
	
	public MemberManager() {}
	
	
	
	public void insertMember() {
		System.out.println("���̵� : ");
		String userId = sc.next();
		System.out.println("�н����� : ");
		String userPwd = sc.next();
		System.out.println("�̸� : ");
		String userName = sc.next();
		System.out.println("���� : ");
		int age = sc.nextInt();
		System.out.println("����  : ");
		char gender = sc.next().charAt(0);
		System.out.println("�̸��� : ");
		String email = sc.next();
		
		//�ڵ尡 �� �������� �ʾ���
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
		
	}
	

	public void searchId() {
		
		System.out.println("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		
		//for��...............��ƴ�. ���� �Ȱ�. ���� ���� ��
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
		
		
		
	}
	
	
	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
		
		
	}
	
	
	public void searchEmail() {
		System.out.println("�˻��� �̸����� �Է��ϼ��� : ");
		String userEmail = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(userEmail)) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��� ȸ�� �̸����� �������� �ʽ��ϴ�.");
			}
		}
		
		
		
		
	}
	
	
	
	public void updatePwd() {
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		//��ƴ�
		for()
		
		
	}

	
	public void updatedName() {
		
		System.out.println(1);
	}
	
	
	public void updateEmail() {
		
		System.out.println(1);
	}
	
	
	public void deleteOne() {
		
		System.out.println(1);
	}
	
	
	public void deleteAll() {
		
		for(int i = 0; i <= ctn; )
		
		System.out.println(1);
		
	}
	
	
	public void printAllMember() {
		
		System.out.println(1);
	}
	
	
	public void printOne(Member m) {
		
		System.out.println("ID : " + m.getUserId());
		System.out.println("PassWord : " + m.getUserPwd());
		System.out.println("�̸� : " + m.getUserName());
		System.out.println("���� : " + m.getAge());
		System.out.println("���� : " + m.getGender());
		System.out.println("�̸��� : " + m.getEmail());
		
	}
	
	
	
}
