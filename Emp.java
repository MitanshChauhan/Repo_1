import java.util.*;
class Emp
{
	int id;
	int sal;
	void accept()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Id:");
	id=s.nextInt();
	System.out.println("Enter sal:");
	sal=s.nextInt();
	}
	void display()
	{
	System.out.println("Id:"+id);
	System.out.println("Sal:"+sal);
	}
	public static void main(String args[])
	{
	int i,d=0;
	Emp e[]=new Emp[5];
	for(i=0;i<5;i++)
	{
	e[i]=new Emp();
	e[i].accept();
	}
	System.out.println("Highest sal");
	float max=e[0].sal;
	for(i=0;i<5;i++)
	{
	if(e[i].sal>max)
	{
		max=e[i].sal;
		d=i;
	}
	e[i].display();
	}
}
}