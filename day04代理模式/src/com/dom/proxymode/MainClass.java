package com.dom.proxymode;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����������ȻҪ����һ��������,��������
/*		RealSubject realSubject = new RealSubject();
//		realSubject.sailBook();
		ProxySubject subject=new ProxySubject();
		subject.setProxySubject(realSubject);
		subject.sailBook();*/
		//��һ���Ľ�
		ProxySubject subject=new ProxySubject();
		subject.sailBook();
	}

}
