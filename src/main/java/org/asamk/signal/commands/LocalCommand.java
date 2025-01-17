package org.asamk.signal.commands;

import net.sourceforge.argparse4j.inf.Namespace;

import org.asamk.signal.OutputWriter;
import org.asamk.signal.commands.exceptions.CommandException;
import org.asamk.signal.manager.Manager;

public interface LocalCommand extends CliCommand {

    void handleCommand(Namespace ns, Manager m, OutputWriter outputWriter) throws CommandException;
}
