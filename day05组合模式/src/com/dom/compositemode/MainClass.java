package com.dom.compositemode;

import java.util.List;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//根目录
		IFile rootFolder = new Folder("C:");
		//字目录
		IFile childFolder1 = new Folder("abc");
		//文件
		IFile files = new Files("a.txt");
		IFile childFolder2 = new Folder("abcdef");
		IFile childFolder3 = new Folder("abcdef2");
		IFile files2 = new Files("b.txt");
		rootFolder.add(childFolder1);
		rootFolder.add(files);
		rootFolder.add(childFolder2);
		childFolder2.add(files2);
		childFolder2.add(childFolder3);
		getFileTree(rootFolder,0);
		
	}
public static void getFileTree(IFile file,int deep){
for(int i=0;i<deep;i++){
	System.out.print("+");
}
	//显示自身的名称
	file.display();
	//获得子树
	List<IFile> children  = file.getChild();
	for(IFile f : children){
		if(f instanceof Files){
			for(int i=0;i<=deep;i++){
				System.out.print("*");	
			}
			f.display();
		}else{
			getFileTree(f,deep+1);
		}
	}
}
}
