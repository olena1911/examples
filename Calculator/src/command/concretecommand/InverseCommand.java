package command.concretecommand;

import receiver.Screen;

import command.Command;

public class InverseCommand implements Command {

	private Screen screen;
	
	public InverseCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute(double number) {
		double result = -number;
		screen.printNumber(result);
	}

}
