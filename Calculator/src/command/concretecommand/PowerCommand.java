package command.concretecommand;

import receiver.Screen;

import command.Command;

public class PowerCommand implements Command {

	private Screen screen;
	
	public PowerCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute(double number) {
		double result = Math.pow(number, 2);
		screen.printNumber(result);
	}

}
