package lab;

public class Lab
{
	int id;
	String title;
	
	public Lab(int _id, String _title)
	{
		id = _id;
		title = _title;
	}
	
	public int getLid()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void showData()
	{
		System.out.println(id+"\t"+title);
	}
}
