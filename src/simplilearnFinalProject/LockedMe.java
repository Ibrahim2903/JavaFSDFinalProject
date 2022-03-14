package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 
{
	static final String projectFilesPath="E:\\JAVA FULL STACK\\Project\\LockedMe";
   
	/**
	 * This method will display the menu for end user
	 */
	
	
	
	
	public static void displayMenu()
   {
	   System.out.println("***************************************************");
	   System.out.println("\tWelcome to LockedMe.com secure app");
	   System.out.println("\tDeveloped by : Lakdawala Mohd Ibrahim");
	   System.out.println("***************************************************");
	   System.out.println("\t1. Display all files");
	   System.out.println("\t2. Add a new file");
	   System.out.println("\t3. Delete a file");
	   System.out.println("\t4. Search file");
	   System.out.println("\t5. Exit");
	   System.out.println("***************************************************");
   }
	
	/**
	 * This method will retrieve all the file
	 */
   
   public static void getAllFiles()
   {
	   File folder = new File(projectFilesPath);
	   File[] listOfFiles = folder.listFiles();
	   
	   if(listOfFiles.length>0)
	   {
		   System.out.println("FILES LIST IS BELOW:\n");
		   for(var l:listOfFiles) 
	      
	   {
		   System.out.println(l.getName());
	   }	    
   }
	   else
	   {
		   System.out.println("The Folder Is Empty");
	   } 
	   
	   }
   
   /**
    * This method will read file details from user and create files
    */
   public static void createFiles()
   {
	try
	{
		//Variable declaration
	   Scanner obj = new Scanner(System.in);
	   String fileName;
	   
	   //Read file name from user
	   System.out.println("Enter the file name:");
	   fileName=obj.nextLine();
	   
	   int linesCount;
	   System.out.println("Enter how many lines in the file");
	   linesCount=Integer.parseInt(obj.nextLine());
	   
	   FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName);
	  
	   //Read line by line from user
	   for(int i=1;i<=linesCount;i++)
	   {
		   	System.out.println("Enter file line");
		   	fw.write(obj.nextLine()+"\n");
	   }
	   System.out.println("File Created Successfully");
	   fw.close();
     }
	 catch(Exception Ex)
     {
		   
	 }
   }
    
   /**
    * This method will delete the files
    */
   public static void deleteFiles()
   {
	try
	{
		//Variable declaration
	   Scanner obj = new Scanner(System.in);
	   String fileName;
	   System.out.println("Enter the file name to be deleted:");
	   fileName=obj.nextLine(); 
	   
	   //Get all files names into a list
	   ArrayList<String> allFilesNames = new ArrayList<String>();
	   
	   File folder = new File(projectFilesPath);
	   
	   File[] listOfFiles = folder.listFiles();
	   
	   if(listOfFiles.length>0)
	   {
		   for(var l:listOfFiles)
		   {
			   allFilesNames.add(l.getName());
		   }
	   }
	   
	   File f= new File(projectFilesPath+"\\"+fileName);
	   
	   if(allFilesNames.contains(fileName))
	   {
		   f.delete();
		   System.out.println("File deleted succcessfully");  
	   }
	   else
	   {
		   System.out.println("File doesnot exist");
	   }
	}
	catch (Exception Ex)
	{
		System.out.println("Unable to delete file. Please contact : admin@test.com");
	}
   }
   
   /**
    * This method will search the files
    */

   public static void searchFiles()
   {
	try
    {
		//Variable declaration
	  Scanner obj = new Scanner(System.in);
	  String fileName;
	  System.out.println("Enter the file name to be searched:");
	  fileName=obj.nextLine();
	  
	  //Get all files names into a list
	   ArrayList<String> allFilesNames = new ArrayList<String>();
	   
	   File folder = new File(projectFilesPath);
	   
	   File[] listOfFiles = folder.listFiles();
	   
	   if(listOfFiles.length>0)
	   {
		   for(var l:listOfFiles)
		   {
			   allFilesNames.add(l.getName());
		   }
	   }
	   
	   File f= new File(projectFilesPath+"\\"+fileName);
	   
	   if(allFilesNames.contains(fileName))
	   {
		   System.out.println("File is available");
	   }
	   else
	   {
		   System.out.println("File is not available");
	   }
    }
	catch(Exception Ex)
	{
		
	}
   
   } 
}




