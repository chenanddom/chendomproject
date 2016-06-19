package com.dom.proxymode;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//但是这里仍然要创建一个出版社,不够合理
/*		RealSubject realSubject = new RealSubject();
//		realSubject.sailBook();
		ProxySubject subject=new ProxySubject();
		subject.setProxySubject(realSubject);
		subject.sailBook();*/
		//进一步改进
		ProxySubject subject=new ProxySubject();
		subject.sailBook();
	}

}
