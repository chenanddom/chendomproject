package com.dom.observer;

import java.util.Observable;

public class BlogUser extends Observable {
public void publishBlog(String articleTitle,String articleContent){
	Article article = new Article();
	article.setArticleTitle(articleTitle);
	article.setArticleContent(articleContent);
	System.out.println("�㷢����������:"+articleTitle+"\n"+articleContent);
	this.setChanged();//���������Ѿ��ı�
	this.notifyObservers(article);//֪ͨ�۲���
	
}
}
