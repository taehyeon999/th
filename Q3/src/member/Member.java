package member;

import lab.Lab;

public class Member
{
	int id;
	String name;
	Lab lab;
	
	public Member(int _id, String _name, Lab _lab)
	{
		id = _id;
		name = _name;
		lab = _lab;
	}
	
	public void showData()
	{
		System.out.println(id+"\t"+name+"\t"+lab);
	}
	public void showDataplus()
	{
		
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public Lab getLab()
	{
		return lab;
	}
}

class Researcher extends Member
{
	String org;
	public Researcher(int id, String name, Lab lab, String org)
	{
		super(id, name, lab);
		this.org = org;
	}
	
	public String getOrg()
	{
		return org;
	}
	
	public void showData()
	{
		System.out.println(id+"\t"+name+"\t"+lab.getTitle()+"\t"+org);
	}
	public void showDataplus()
	{
		System.out.println("연구원"+"\t"+id+"\t"+name+"\t"+lab.getTitle()+"\t"+org);
	}
}

class Student extends Member
{
	String major;
	public Student(int id, String name, Lab lab, String major)
	{
		super(id, name, lab);
		this.major = major;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public void showData()
	{
		System.out.println(id+"\t"+name+"\t"+lab.getTitle()+"\t"+major);
	}
	public void showDataplus()
	{
		System.out.println("학생"+"\t"+id+"\t"+name+"\t"+lab.getTitle()+"\t"+major);
	}
}
