package com.dom.proxymode;

public class ProxySubject implements Subject {
private RealSubject realSubject;
/*public void setProxySubject(RealSubject realSubject) {
	
	this.realSubject = realSubject;
}*/

@Override
public void sailBook() {
	// TODO Auto-generated method stub
	discount();
	if(realSubject==null){
		realSubject=new RealSubject();
	}
	realSubject.sailBook();
	voucher();
}
public void discount(){
	System.out.println("´òÕÛ");
}
public void voucher(){
	System.out.println("´ú½ðÈ¯");
}
}
