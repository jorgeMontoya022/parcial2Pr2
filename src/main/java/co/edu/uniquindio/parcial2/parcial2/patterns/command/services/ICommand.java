package co.edu.uniquindio.parcial2.parcial2.patterns.command.services;

public interface ICommand {
    void execute();
    void undo();
    void redo();
}
