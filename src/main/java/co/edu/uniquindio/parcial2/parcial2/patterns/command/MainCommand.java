package co.edu.uniquindio.parcial2.parcial2.patterns.command;

import co.edu.uniquindio.parcial2.parcial2.patterns.command.model.*;
import co.edu.uniquindio.parcial2.parcial2.patterns.command.services.ICommand;

public class MainCommand {
    public static void main(String[] args) {
        Receptor receptor = new Receptor();
        Invoker invoker = new Invoker();

        ICommand local = new EntregaLocalICommand(receptor);
        ICommand nacional = new EntregaNacionalICommand(receptor);
        ICommand internacional = new EntregaInternacionalICommand(receptor);

        invoker.ejecutarComando(local);
        invoker.ejecutarComando(nacional);
        invoker.ejecutarComando(internacional);

        invoker.undo();
        invoker.redo();
    }
}
