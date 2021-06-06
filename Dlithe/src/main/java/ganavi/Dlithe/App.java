package ganavi.Dlithe;
import java.util.Scanner;


public class App
{

	public static void main( String[] args )
    {
        Assembly assembly1=new Assembly();
        // Classname object=new Constructor()
        assembly1.setAssemblyName("Bangalore West");
        assembly1.setAssemblyContact(76543456785L);
        assembly1.setAssemblyPopulation(200000);
        assembly1.setAssemblyNumber(87);
        assembly1.setAssemblyMemberName("Rohan");
        assembly1.setAssemblyIssues(new String[] {"Traffic","Drinage"});
        Assembly assembly2=new Assembly(98,312903,"Shivmoga","Jilani",new String[] {"Water","Electricity","Network"},98767876776L);
        Assembly assembly3=new Assembly(12,287945,"Madiwala","Ganavi",new String[] {"Hospitality","Transportation"},1234323454L);
        Assembly assembly4=new Assembly(34,312903,"Bangalore East","Oliver",new String[] {"Agriculture","Traffic","Pollution"},87656787634L);

        Scanner scanner=new Scanner(System.in);
        Record record=new Record();
        record.createNewRecord(assembly1);
        record.createNewRecord(assembly2);
        record.createNewRecord(assembly3);
        record.createNewRecord(assembly4);


        //System.out.println(record);

		/*
		 * Assembly hai=record.readOne(100); System.out.println("REceived "+hai);
		 */
        Boolean more=false;
        do
        {
        	System.out.println("What you wish to do: ");
        	System.out.println("new\nviewall\nupdate\nread\ndelete");
            String process=scanner.next();// new, viewall
            switch(process)
            {
            case "new":
            	System.out.println("Tell us assembly number,population,name,membername,issues,contact");
            	Assembly assembly=new Assembly();
            	assembly.setAssemblyNumber(scanner.nextInt());
            	assembly.setAssemblyPopulation(scanner.nextInt());
            	assembly.setAssemblyName(scanner.next());
            	assembly.setAssemblyMemberName(scanner.next());
            	System.out.println("Tell us how many issues in "+assembly.getAssemblyName());
            	Integer count=scanner.nextInt();//4
            	String[] tmp=new String[count];
            	System.out.println("Tell us "+count+" of issues one by one: ");
            	for(int index=0;index<count;index++)
            	{
            		tmp[index]=scanner.next();
            	}
            	assembly.setAssemblyIssues(tmp);
            	System.out.println("Tell us assembly contact: ");
            	assembly.setAssemblyContact(scanner.nextLong());
            	record.createNewRecord(assembly);
            	break;
            case "viewall":
            	System.out.println(record);
            }
            System.out.println("Do wish to continue(true/false): ");
            more=scanner.nextBoolean();
        }while(more);

		/*
		 * String assem=record.delete(98);
		 * System.out.println("Deleted assemebly from record is: "+assem);
		 */
        record.update(12);
        scanner.close();
    }
}