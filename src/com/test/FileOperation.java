package com.test;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\file operation");
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		File f1=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\file operation\\To\\Homepage");
		boolean mkdirs1 = f1.mkdirs();
		System.out.println(mkdirs1);
		boolean directory = f.isDirectory();
		System.out.println(directory);
		File f2=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\file operation\\operion.txt");
		boolean createNewFile = f2.createNewFile();
		System.out.println(createNewFile);
		boolean canWrite = f2.canWrite();
		System.out.println(canWrite);
		boolean canRead = f2.canRead();
		System.out.println(canRead);
		boolean canExecute = f2.canExecute();
		System.out.println(canExecute);
		boolean file = f2.isFile();
		System.out.println(file);
		
		
		
		
	}

}
