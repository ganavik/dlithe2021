package ganavi.Dlithe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
{
	@Override
	public String toString()
	{
		Collections.sort(data);
		String hai="";
		System.out.println("Listing all the assembly records");
		public Assembly readOne(Integer number) 
		{
		}
		return null;
	}
	
	public Assembly readOne(String name) 
	{
		// TODO Auto-generated method stub
		Assembly temp=null;
		// TODO Auto-generated method stub
		Iterator<Assembly> it=data.iterator();
		while(it.hasNext())
		{
			temp=it.next();
			if(temp.getAssemblyName().equalsIgnoreCase(name))
			{
				return temp;
			}
		}
		return null;
	}
	@Override
	public String readOne(Integer population, String Issue) {
		// TODO Auto-generated method stub
		System.out.println("Finding assemblies matches "+population+" popluation and issue: "+Issue);
		Assembly temp=null;
		String hai="";
		// TODO Auto-generated method stub
		Iterator<Assembly> it=data.iterator();
		while(it.hasNext())
		{
			temp=it.next();
			if(Arrays.toString(temp.getAssemblyIssues()).contains(Issue)&&temp.getAssemblyPopulation()>=population)
			{
				//return temp;
				hai+=temp+"\n";
			}
		}
		return hai;
	}

	@Override
	public String delete(Integer number) 
