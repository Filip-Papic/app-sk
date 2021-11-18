package main;

import java.util.Scanner;

import model.Directory;
import model.File;
import model.Storage;

public class CommandLineApp {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Storage storage = (Storage) Class.forName("model.StorageT").newInstance();
		
		String function = args[0];
		String path = args[1];
		String name = args[2];
		String type = args[3];
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		if(function.equals("create")) {
			if(type.equals("file")) {  
				File file = (File) Class.forName("model.FileT").newInstance();
				file.create(path, name);
			}else if(type.equals("dir")){
				Directory directory = (Directory) Class.forName("model.DirectoryT").newInstance();
				directory.create(path, name);
				//Paths.get(path).toFile().mkdir();
			}
		}
		
		if(function.equals("delete")) {
			if(type.equals("file")) {  
				File file = (File) Class.forName("model.FileT").newInstance();
				file.delete(path, name);
			}else if(type.equals("dir")){
				Directory directory = (Directory) Class.forName("model.DirectoryT").newInstance();
				directory.delete(path, name);
				//Paths.get(path).toFile().mkdir();
			}
		}
		//storage.createDir("1CRHPlTATSYb6ZsbPLemASrVYC1j5LeOR", "test");
		//storage.deleteDir("1CRHPlTATSYb6ZsbPLemASrVYC1j5LeOR", null);
		//storage.createDir(null, "smog");
		//storage.moveDir("1W1JjJFsMRj-wTyoMF5r68VqRCA_us5Zv", "1rJLv3EJVs9pETR_5h4aoKLJQfZZJmI1h");
		
		//storage.createMultipleDirs("1CRHPlTATSYb6ZsbPLemASrVYC1j5LeOR", "blyat", 4);
		
		//storage.createFile("1QnfzOCWQheJXGLXP5B9C32LUTQw5XOOE", "fajl");
		//storage.createFile(null, "fajl");
		//storage.moveFile("1ixMZH4qGcXSjlBmILNInIPAxkrMx7_w8", "1CRHPlTATSYb6ZsbPLemASrVYC1j5LeOR");
		//storage.createMultipleFiles("1CRHPlTATSYb6ZsbPLemASrVYC1j5LeOR", "filetest", 3);
		//storage.deleteFile("1f4gyD2OwIkWL47P1_ZzVAWxzGpSQ-qB4", null);
		
		//Directory dir = (Directory) Class.forName("model.DirectoryRemote").newInstance();
		//dir.createMultiple("1CRHPlTATSYb6ZsbPLemASrVYC1j5LeOR", "testara", 4);
		
		//storage.getUser();
		/*
		String function = args[1];
		String path = args[2];
		String name = args[3];
		String type = args[4];
		//
		
		
		if(function.equals("create")) {
			
			if(type.equals("file")) {  
				/*
				storage.create(path, name);
				*/
		/*
				File file = (File) Class.forName("model.FileLocal").newInstance(); //model.StorageLocal delete C:\\nzmbrt nzmbrt dir
				file.createMultiple(path, name, 3);
			}
		}
		if(function.equals("delete")) {
			if(type.equals("file")) {
				File file = (File) Class.forName("model.FileLocal").newInstance();
				file.delete(path, name);
			}
			if(type.equals("dir")) {
				Directory directory = (Directory) Class.forName("model.DirectoryLocal").newInstance();
				directory.delete(path, name);
			}
		}
		*/
		/*
		int i = 0;
		do {
			//@SuppressWarnings("resource")
			//Scanner in = new Scanner(System.in);
			
			String function = args[0];
			String path = args[1];
			String name = args[2];
			String type = args[3];
			
			if(args.length!=4) {  
				System.out.println("usage java -jar app.jar <function> <path> <name> <type>   ");
				System.exit(0);  //npr: java -jar app-sk-0.0.1-SNAPSHOT.jar create D:\Desktop aaa dir
			}
			
			if(function.equals("create")) {
				if(type.equals("file")) {  
					@SuppressWarnings("deprecation")
					File file = (File) Class.forName("model.FileLocal").newInstance();
					file.create(path, name);
				}else if(type.equals("dir")){
					@SuppressWarnings("deprecation")
					Directory directory = (Directory) Class.forName("model.DirectoryLocal").newInstance();
					directory.create(path, name);
					//Paths.get(path).toFile().mkdir();
				}
			}
			if(function.equals("delete")) {
				//......
			}
			if(function.equals("move")) {
				//......
				if(type.equals("file")) {
					@SuppressWarnings("deprecation")
					File file = (File) Class.forName("model.FileLocal").newInstance();
					System.out.println(file);
					System.out.println(path);
					file.move(path, name);
					
				}
			}
			if(function.equals("find")) {
				//......
			}
			
			i++;
		} while (i < 10);
	}
	
	*/
	/*
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Uneti lokaciju skladista: ");
		while(true) {
			String command = in.nextLine();
			System.out.println("sad sledeca\n");
			
		}
	}
	*/
	}
}
