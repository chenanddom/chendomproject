package com.dom.compositemode;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile {
	private String name;
	private List<IFile> children;

	public Folder(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		children = new ArrayList<IFile>();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public boolean add(IFile file) {
		// TODO Auto-generated method stub
		return children.add(file);
	}

	@Override
	public boolean remove(IFile file) {
		// TODO Auto-generated method stub
		return children.remove(file);
	}

	@Override
	public List<IFile> getChild() {
		// TODO Auto-generated method stub
		return children;
	}

}
