package org.example.dbms.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public interface MetaStorage extends StorageContainer {

    Future<byte[]> getData();

    Future<Boolean> persistData(byte[] data);

    default List<StorageContainer> listSubStorageContainers() {
        return new ArrayList<>();
    }
}
