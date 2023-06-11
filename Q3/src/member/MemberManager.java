package member;
import java.util.Scanner;

import lab.LabManager;
import lab.Lab;

public class MemberManager 
{
	Member mList[];
	int index = 0;
	Scanner scan;
	LabManager lm;
	Lab lab;
	
	public MemberManager(int n)
	{
		mList = new Member[n];
		scan = new Scanner(System.in);
	}
	
	public void ini(LabManager lm)
	{
		mList[index++] = new Student(index+1, "홍학생", lm.findLabById(1), "소프트웨어");
		mList[index++] = new Student(index+1, "김학생", lm.findLabById(2), "게임공학");
		mList[index++] = new Student(index+1, "박학생", lm.findLabById(1), "컴퓨터공학");
		mList[index++] = new Researcher(index+1, "홍연구", lm.findLabById(1), "Happy co.");
		mList[index++] = new Researcher(index+1, "박연구", lm.findLabById(3), "(주)행복");
	}
	
	public void addStudent(LabManager lm)
	{
		int id = index+1;
		String name, major;
		Lab lab;
		int lid=100;
		
		System.out.println("<1. 학생 멤버 추가>");
		System.out.println(" - ID: "+id);
		System.out.println(" - 이름: ");
		name = scan.next();
		System.out.println(" - 전공: ");
		major = scan.next();
		lm.showAll();
		
		while(lid!=0)
		{
			System.out.println(" - Lab ID: ");
			lid = scan.nextInt();
			lab = lm.findLabById(lid);
			
			if (lab!=null)
			{
				mList[index++] = new Student(id, name, lab, major);
				System.out.println("=> "+name+": 학생을 추가했습니다.");
				return;
			}
		}
		mList[index++] = new Student(id, name, null, major);
		System.out.println("=> "+name+": 학생을 추가했습니다.");
	}
	
	public void addResearcher(LabManager lm)
	{
		int id = index+1;
		String name, org;
		Lab lab;
		int lid=100;
		
		System.out.println("<3. 연구원 멤버 추가>");
		System.out.println(" - ID: "+id);
		System.out.println(" - 이름: ");
		name = scan.next();
		System.out.println(" - 회사: ");
		org = scan.next();
		lm.showAll();
		
		while(lid!=0)
		{
			System.out.println(" - Lab ID: ");
			lid = scan.nextInt();
			lab = lm.findLabById(lid);
			
			if (lab!=null)
			{
				mList[index++] = new Researcher(id, name, lab, org);
				System.out.println("=> "+name+": 연구원을 추가했습니다.");
				return;
			}
		}
		mList[index++] = new Researcher(id, name, null, org);
		System.out.println("=> "+name+": 연구원을 추가했습니다.");
	}
	
	public void FindMemberByName()
	{
		System.out.println("<5. 멤버 조회>");
		System.out.println(" - 이름: ");
		String name = scan.next();
		
		Member m = FindMemberByName(name);
		if(m==null)
		{
			System.out.println(" =>"+name+": 그런 멤버 없음");
		}
		else
		{
			System.out.println("<찾은 멤버>");
			System.out.println("-----------------------");
			System.out.println("구분	ID	이름	Lab	전공/회사");
			System.out.println("-----------------------");
			m.showData();
			System.out.println("-----------------------");
		}
	}
	
	public Member FindMemberByName(String name)
	{
		for(int i=0;i<index;i++)
		{
			if((mList[i].getName()).equals(name)==true)
			{
				return mList[i];
			}
		}
		return null;
	}
	
	public void showMemeberStu()
	{	
		System.out.println("<2. 학생 멤버 목록 출력>");
		System.out.println("----------------------------");
		System.out.println("ID	이름	Lab	전공");
		System.out.println("----------------------------");
		for(int i=0;i<index;i++)
		{
			if (mList[i] instanceof Student)
			{
				mList[i].showData();
			}
		}
		System.out.println("----------------------------");
	}
	
	public void showMemberRes()
	{
		System.out.println("<4. 연구원 멤버 목록 출력>");
		System.out.println("----------------------------");
		System.out.println("ID	이름	Lab	회사");
		System.out.println("----------------------------");
		for(int i=0;i<index;i++)
		{
			if (mList[i] instanceof Researcher)
			{
				mList[i].showData();
			}
		}
		System.out.println("----------------------------");
	}
	
	public void showMemberByLab(LabManager lm)
	{
		int id;
		System.out.println("<9. Lab별 멤버 목록>");
		System.out.println("-------------------");
		lm.showAll();
		System.out.println(" - Lab ID: ");
		id = scan.nextInt();
		System.out.println("<"+lm.findLabById(id)+": 멤버 목록>");
		for (int i=0;i<index;i++)
		{
			if((mList[i].getLab()).equals(lm.findLabById(id))==true)
			{
				mList[i].showDataplus();
			}
		}
		System.out.println("-------------------");
	}
	
	public void showAll()
	{
		System.out.println("<6. 모든 멤버 목록 출력>");
		System.out.println("---------------------------");
		System.out.println("구분	ID	이름	Lab	전공/회사");
		System.out.println("---------------------------");
		for (int i=0;i<index;i++)
		{
			mList[i].showDataplus();
		}
		System.out.println("---------------------------");
	}
}
