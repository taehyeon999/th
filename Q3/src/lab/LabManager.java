package lab;

import java.util.Scanner;

public class LabManager 
{
	Lab lList[];
	int index = 0;
	Scanner scan;
	
	public LabManager(int n)
	{
		lList = new Lab[n];
	}
	
	public void ini()
	{
		lList[index++] = new Lab(1,"OO Lab");
		lList[index++] = new Lab(2,"Cpp PBL");
		lList[index++] = new Lab(3,"웹 Lab");
		lList[index++] = new Lab(4,"Java 1st");
	}
	
	public Lab findLabById(int id)
	{
		for (int i=0;i<index;i++)
		{
			if (lList[i].id == id)
			{
				return lList[i];
			}
		}
		return null;
	}
	
	public void addLab()
	{
		scan = new Scanner(System.in);
		int id;
		String title;
		
		System.out.println("<7. Lab 추가");
		System.out.println("- id: ");
		id = scan.nextInt();
		System.out.println("- 타이틀: ");
		title = scan.next();
		lList[index++] = new Lab(id, title);
		System.out.println(">>"+title+": Lab 추가 성공");
	}
	
	public void showAllLab()
	{
		System.out.println("<8. 모든 Lab 목록>");
		System.out.println("-------------------");
		System.out.println("ID	Lab이름");
		System.out.println("-------------------");
		for(int i=0;i<index;i++)
		{
			lList[i].showData();
		}
		System.out.println("-------------------");
	}
	
	
	public void showAll()
	{
		System.out.println("-------------------");
		System.out.println("ID	Lab이름");
		System.out.println("-------------------");
		for(int i=0;i<index;i++)
		{
			lList[i].showData();
		}
		System.out.println("-------------------");
	}
	
}
