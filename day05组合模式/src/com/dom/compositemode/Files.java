package com.dom.compositemode;

import java.util.List;

/**
 * 该类是一个文件类,他没有任何的字节点
 * 
 * @author adminster
 * 
 */
public class Files implements IFile {
	private String name;

	public Files(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public boolean add(IFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(IFile file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<IFile> getChild() {
		// TODO Auto-generated method stub
		return null;
	}

}
