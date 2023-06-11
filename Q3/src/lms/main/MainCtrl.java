package lms.main;

import lab.LabManager;
import member.MemberManager;

public class MainCtrl 
{
	public static void main(String[] args)
	{
		MainMenu mm = new MainMenu();
		LabManager lm = new LabManager(50);
		lm.ini();
		MemberManager mma = new MemberManager(50);
		mma.ini(lm);
		
		int sel;
		while (true)
		{
			switch(sel=mm.issue())
			{
			case 1:
				System.out.println("==>선택메뉴: 1. 학생 멤버 추가");
				mma.addStudent(lm);
				break;
			case 2:
				System.out.println("==>선택메뉴: 2. 학생 멤버 목록 출력");
				mma.showMemeberStu();
				break;
			case 3:
				System.out.println("==>선택메뉴: 3. 연구원 멤버 추가");
				mma.addResearcher(lm);
				break;
			case 4:
				System.out.println("==>선택메뉴: 4. 연구원 멤버 목록 출력");
				mma.showMemberRes();
				break;
			case 5:
				System.out.println("==>선택메뉴: 5. 멤버 조회");
				mma.FindMemberByName();
				break;
			case 6:
				System.out.println("==>선택메뉴: 6. 전체 멤버 목록 출력");
				mma.showAll();
				break;
			case 7:
				System.out.println("==>선택메뉴: 7. Lab 추가");
				lm.addLab();
				break;
			case 8:
				System.out.println("==>선택메뉴: 8. Lab 목록 출력");
				lm.showAllLab();
				break;
			case 9:
				System.out.println("==>선택메뉴: 9. Lab별 멤버 목록 출력");
				mma.showMemberByLab(lm);
				break;
			case 0:
				System.out.println("==>선택메뉴: 0. 종료");
				System.out.println("==>시스템을 종료합니다...");
				return;
			default:
				System.out.println("==>그런 메뉴는 없습니다.");
				break;
			}
		}
	}
}
