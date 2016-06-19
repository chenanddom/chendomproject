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
	System.out.println("同志通道");
}else{
if(man.getCondition()==women.getCondition()){
	System.out.println(man.getName()+"和"+women.getName()+"般配可以结婚");
}else{
	System.out.println("条件不匹配捏");
	}
}
}
}
