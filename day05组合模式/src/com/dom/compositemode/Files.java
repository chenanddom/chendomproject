package com.dom.compositemode;

import java.util.List;

/**
 * ������һ���ļ���,��û���κε��ֽڵ�
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
