package com.dom.observer;

public class MainClass {
	
	public static void main(String[] args) {
		BlogUser user=new BlogUser();//����һ�����۲���
		user.addObserver(new MyObserver());//ע��һ���۲���
		user.publishBlog("��������", "�Ժ������");

	}

}
