package com.dom.commmandmode;

public class Waiter {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void sail() {
		command.sail();
	}
}
