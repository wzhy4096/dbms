package org.example.dbms.concurrent;

import org.example.dbms.storage.MetaCommand;

import java.util.List;

public interface Transaction {

    long getTxid();

    List<MetaCommand> listMetaCommands();
}
