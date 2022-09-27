package org.example.dbms.storage;

import java.util.List;

public interface StorageContainer {

    StorageId getStorageId();

    List<StorageContainer> listSubStorageContainers();
}
