package com.dom.mediatormode2;

import com.dom.mediatormode.Person;

public class Mediator {
private Man man;
private Women women;
public void setMan(Man man) {
	this.man = man;
}
public void setWomen(Women women) {
	this.women = women;
}
public void getPartner(com.dom.mediatormode2.Person p) {
if(p instanceof Man){
	this.setMan((Man)p);
}else{
	this.setWomen((Women)p);
}
if(man==null || women ==null){
	System.out.println("ͬ־ͨ��");
}else{
if(man.getCondition()==women.getCondition()){
	System.out.println(man.getName()+"��"+women.getName()+"������Խ��");
}else{
	System.out.println("������ƥ����");
	}
}
}
}
