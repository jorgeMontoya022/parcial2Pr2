package co.edu.uniquindio.parcial2.parcial2.patterns.command.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.command.services.ICommand;

public class EntregaLocalICommand implements ICommand {
    private Receptor receptor;

    public EntregaLocalICommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaLocal();
    }

    @Override
    public void undo() {
        receptor.deshacerEntregaLocal();
    }

    @Override
    public void redo() {
        execute();
    }
}
