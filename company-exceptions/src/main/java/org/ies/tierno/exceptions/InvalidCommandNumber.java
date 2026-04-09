package org.ies.tierno.exceptions;

public class InvalidCommandNumber extends Exception {
    private final int invalidCommand;

    public InvalidCommandNumber(int invalidCommand) {
        super("Número de comando no válido" + invalidCommand);
        this.invalidCommand = invalidCommand;
    }
    public int getInvalidCommand() {
        return invalidCommand;
    }
}
