package org.example.dbms.concurrent;

import org.example.dbms.storage.StorageId;

public interface Lock {

    LockManager getLockManager();

    Transaction getOwner();

    StorageId getStorageId();

    boolean lock();

    boolean unlock();
}
