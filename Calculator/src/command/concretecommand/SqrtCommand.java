package command.concretecommand;

import receiver.Screen;

import command.Command;

public class SqrtCommand implements Command {

	private Screen screen;
	
	public SqrtCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute(double number) {
		double result = Math.sqrt(number);
		screen.printNumber(result);
	}

}
