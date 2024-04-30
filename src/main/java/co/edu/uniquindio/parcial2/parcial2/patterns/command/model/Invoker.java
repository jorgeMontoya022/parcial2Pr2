package co.edu.uniquindio.parcial2.parcial2.patterns.command.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.command.services.ICommand;

import java.util.Stack;

public class Invoker {
    private Stack<ICommand> historial = new Stack<>();
    private Stack<ICommand> pilaRehacer = new Stack<>();

    public void ejecutarComando(ICommand comando) {
        comando.execute();
        historial.push(comando);
    }

    public void undo() {
        if (!historial.isEmpty()) {
            ICommand ICommand = historial.pop();
            ICommand.undo();
            pilaRehacer.push(ICommand);
        }
    }

    public void redo() {
        if (!pilaRehacer.isEmpty()) {
            ICommand ICommand = pilaRehacer.pop();
            ICommand.redo();
            historial.push(ICommand);
        }
    }
}
