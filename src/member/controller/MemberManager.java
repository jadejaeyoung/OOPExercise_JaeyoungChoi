package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	
	
	public MemberManager() {}
	
	
	
	public void insertMember() {
		System.out.println("아이디 : ");
		String userId = sc.next();
		System.out.println("패스워드 : ");
		String userPwd = sc.next();
		System.out.println("이름 : ");
		String userName = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("성별  : ");
		char gender = sc.next().charAt(0);
		System.out.println("이메일 : ");
		String email = sc.next();
		
		//코드가 잘 떠오르지 않았음
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		ctn++;
		
	}
	

	public void searchId() {
		
		System.out.println("검색할 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		
		//for문...............어렵다. 이해 안감. 거의 보고 씀
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
		
		
		
	}
	
	
	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String userName = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
			}
		}
		
		
	}
	
	
	public void searchEmail() {
		System.out.println("검색할 이메일을 입력하세요 : ");
		String userEmail = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(userEmail)) {
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 이메일이 존재하지 않습니다.");
			}
		}
		
		
		
		
	}
	
	
	
	public void updatePwd() {
		
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		//어렵다
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
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
		
	}
	
	
	
}
