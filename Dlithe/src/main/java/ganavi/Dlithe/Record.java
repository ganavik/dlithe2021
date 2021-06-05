package ganavi.Dlithe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Record implements Assemblyworks
{
	private ArrayList<Assembly> data=new ArrayList<Assembly>();
	private Scanner scanner=new Scanner(System.in);

	@Override
	public void createNewRecord(Assembly object) 
	{
		data.add(object);
		System.out.println(object.getAssemblyName()+" has added to the record");
	}

	@Override
	public String toString()
	{
		//System.out.println(data);
		String hai="";
		System.out.println("Listing all the assembly records");
		for(Assembly ptr:data)
		{
			hai+=ptr+"\n";
		}
		return hai;
	}

	@Override
	public Assembly readOne(Integer number) {
		Assembly temp=null;
		// TODO Auto-generated method stub
		Iterator<Assembly> it=data.iterator();
		while(it.hasNext())
		{
			temp=it.next();
			if(temp.getAssemblyNumber()==number)
			{
				return temp;
			}
		}
		return null;
	}

	@Override
	public String delete(Integer number) 
	{
		Assembly yet=null;
		for(Assembly tmp:data)
		{
			if(tmp.getAssemblyNumber()==number)
			{
				yet=tmp;break;
			}
		}
		String name=yet.getAssemblyName();
		data.remove(yet);
		return name;
	}

	@Override
	public void update(Integer number) 
	{
		for(Assembly ptr:data)
		{
			if(ptr.getAssemblyNumber()==number)
			{
				System.out.println("Tell us what you wish to update in the "+ptr.getAssemblyName());
				String aspect=scanner.next();// population
				switch(aspect)
				{
				case "population":
					System.out.println("Tell us new population value in the "+ptr.getAssemblyName());
					Integer newone=scanner.nextInt();
					ptr.setAssemblyPopulation(newone);
					System.out.println(ptr.getAssemblyName()+" has updated the "+aspect);
					return;
				case "contact":
					System.out.println("Tell us new contact number for the "+ptr.getAssemblyName());
					Long mobile=scanner.nextLong();
					ptr.setAssemblyContact(mobile);
					System.out.println(ptr.getAssemblyName()+" has updated the "+aspect);
					return;
				case "AssemblyName":
					System.out.println("Tell us new AssemblyName for the "+ptr.getAssemblyName());
					String AsemblyName=scanner.next();
					ptr.setAssemblyName(AsemblyName);
					System.out.println(ptr.getAssemblyName()+"has updated the "+aspect);
					return;
				case "AssemblyNumber":
					System.out.println("Tell us new AssemblyNumber for the "+ptr.getAssemblyName());
					Integer AsemblyNumber=scanner.nextInt();
					ptr.setAssemblyNumber(AsemblyNumber);
					System.out.println(ptr.getAssemblyName()+"has updated the "+aspect);
					return;
					
							
				}
			}
		}
	}
}