package lms.main;

import java.util.Scanner;

public class MainMenu 
{
	int sel;
	Scanner scan;
	
	public MainMenu()
	{
		scan = new Scanner(System.in);
	}
	
	public int issue()
	{
		System.out.println("---<< 메 인 메 뉴 >>---");
		System.out.println(" 1. 학생 멤버 추가");
		System.out.println(" 2. 학생 멤버 목록 출력");
		System.out.println("");
		System.out.println(" 3. 연구원 멤버 추가");
		System.out.println(" 4. 연구원 멤버 목록 출력");
		System.out.println("");
		System.out.println(" 5. 멤버 조회");
		System.out.println(" 6. 전체 멤버 목록 출력");
		System.out.println("");
		System.out.println(" 7. Lab 추가");
		System.out.println(" 8. Lab 목록 출력");
		System.out.println(" 9. Lab별 멤버 목록 출력");
		System.out.println("");
		System.out.println(" 0. 종료");
		System.out.println("-------------------");
		System.out.println("메뉴 번호? >> ");
		sel = scan.nextInt();
		return sel;
	}
}
