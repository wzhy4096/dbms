package org.example.dbms.concurrent;

import java.util.List;

public interface LockManager {

    List<Lock> getTransactionLock(Transaction transaction);

    List<Lock> getIntentionLock(Transaction transaction);
}
