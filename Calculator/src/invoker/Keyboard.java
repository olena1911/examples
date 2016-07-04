package invoker;

import java.util.HashMap;
import java.util.Map;

import command.Command;

public class Keyboard {
	Map<String, Command> commands = new HashMap<String, Command>();

	public void setCommand(String commandName, Command command) {
		commands.put(commandName, command);
	}
	
	// executeCommand == press button
	public void executeCommand(String commandName, double number) {
		Command command = commands.get(commandName);
		if (command == null) {
			throw new RuntimeException("Unsupported command: " + command);
		}
		command.execute(number);
	}
}
