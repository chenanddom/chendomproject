package com.dom.flyweightmode;

import java.util.HashMap;
import java.util.Map;


public class CharacterFactory {
	private Map<Character,MyCharacter> pool;
	public CharacterFactory() {
		// TODO Auto-generated constructor stub
		pool=new HashMap<Character, MyCharacter>();
	}
	public MyCharacter getMyCharacter(Character character) {
		MyCharacter myChar = pool.get(character);
		if(myChar == null) {
			myChar = new MyCharacter(character);
			pool.put(character, myChar);
		}
		return myChar;
	}
}
