package co.edu.uniquindio.parcial2.parcial2.patterns.command.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.command.services.ICommand;

public class EntregaNacionalICommand implements ICommand {
    private Receptor receptor;

    public EntregaNacionalICommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaNacional();
    }

    @Override
    public void undo() {
        receptor.deshacerEntregaNacional();
    }

    @Override
    public void redo() {
        execute();
    }
}