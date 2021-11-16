package main;

import model.Directory;
import model.File;

public class CommandLineApp {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//@SuppressWarnings("resource")
		//Scanner in = new Scanner(System.in);
		
		String function = args[0];
		String path = args[1];
		String name = args[2];
		String type = args[3];
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
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
			if(type.equals("file")) {  
				@SuppressWarnings("deprecation")
				File file = (File) Class.forName("model.FileLocal").newInstance();
				file.delete(path, name);
			}else if(type.equals("dir")){
				@SuppressWarnings("deprecation")
				Directory directory = (Directory) Class.forName("model.DirectoryLocal").newInstance();
				directory.delete(path, name);
			}
		}
		if(function.equals("move")) {
			//......
		}
		if(function.equals("find")) {
			//......
		}
	}
}
