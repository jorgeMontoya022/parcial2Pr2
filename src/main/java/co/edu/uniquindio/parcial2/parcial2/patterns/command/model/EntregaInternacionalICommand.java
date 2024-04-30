package co.edu.uniquindio.parcial2.parcial2.patterns.command.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.command.services.ICommand;

public class EntregaInternacionalICommand implements ICommand {
    private Receptor receptor;

    public EntregaInternacionalICommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaInternacional();
    }

    @Override
    public void undo() {
        receptor.deshacerEntregaInternacional();
    }

    @Override
    public void redo() {
        execute();
    }
}