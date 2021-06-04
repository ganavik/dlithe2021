package ganavi.Dlithe;

import ganavi.Dlithe.model.Assembly;
import ganavi.Dlithe.controller.Record;

	public static void main( String[] args )
        assembly1.setAssemblyPopulation(200000);
        assembly1.setAssembyNumber(87);
        assembly1.setAssemblyMemberName("Rohan");
        assembly1.setAssemblyIssues(new String[] {"Traffic Issue","Drinage issue"});
        assembly1.setAssemblyIssues(new String[] {"Traffic","Drinage"});
        Assembly assembly2=new Assembly(98,312903,"Shivmoga","Jilani",new String[] {"Water","Electricity","Network"},98767876776L);
        Assembly assembly3=new Assembly(12,287945,"Madiwala","Ganavi",new String[] {"Hospitality","Transportation"},1234323454L);
        Assembly assembly4=new Assembly(34,312903,"Bangalore East","Oliver",new String[] {"Agriculture","Traffic","Pollution"},87656787634L);

        System.out.println("Assembly Details are: \n"+assembly1);
        //System.out.println("Assembly name: "+assembly1.getAssemblyName()+" assembly member: "+assembly1.getAssemblyMemberName()+" assembly popluation: "+assembly1.getAssemblyPopulation()+" assembly Contact: "+assembly1.getAssemblyContact());
        Record record=new Record();
        record.createNewRecord(assembly1);
        record.createNewRecord(assembly2);
        record.createNewRecord(assembly3);
        record.createNewRecord(assembly4);


        Assembly assembly2=new Assembly(98,312903,"Shivmoga","Jilani",new String[] {"Water","Electricity","Network"},98767876776L);
        System.out.println("Assembly Details are: ");
        System.out.println("assembly popluation: "+assembly2.getAssemblyPopulation()+" assembly Member: "+assembly2.getAssemblyMemberName());
        //System.out.println(record);

		/*
		 * Assembly hai=record.readOne(100); System.out.println("REceived "+hai);
		 */

		/*
		 * String assem=record.delete(98);
		 * System.out.println("Deleted assemebly from record is: "+assem);
		 */
        record.update(12);
    }
}