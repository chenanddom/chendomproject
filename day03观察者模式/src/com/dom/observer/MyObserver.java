package com.dom.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Article article = (Article)arg;
		System.out.println("���������������£���ȥ�����ɣ�");
		System.out.println("����������:"+article.getArticleTitle());
		System.out.println("����������:"+article.getArticleContent());
		
	}

}
