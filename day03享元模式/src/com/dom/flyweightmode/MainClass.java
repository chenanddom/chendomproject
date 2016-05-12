package com.dom.flyweightmode;

public class MainClass {
	public static void main(String[] args) {
		MyCharacter myCharacter1 = new MyCharacter('1');
		MyCharacter myCharacter2 = new MyCharacter('2');
		MyCharacter myCharacter3 = new MyCharacter('3');
		MyCharacter myCharacter4 = new MyCharacter('2');
		MyCharacter myCharacter5 = new MyCharacter('5');
		myCharacter1.display();
		myCharacter2.display();
		myCharacter3.display();
		myCharacter4.display();
		myCharacter5.display();
		if(myCharacter2==myCharacter4){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		System.out.println("------------------------------------------");
		CharacterFactory factory = new CharacterFactory();
		MyCharacter character1 = factory.getMyCharacter('1');
		MyCharacter character2 = factory.getMyCharacter('2');
		MyCharacter character3 = factory.getMyCharacter('3');
		MyCharacter character4 = factory.getMyCharacter('2');
		MyCharacter character5 = factory.getMyCharacter('5');
		character1.display();
		character2.display();
		character3.display();
		character4.display();
		character5.display();
		if(character2==character4){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
