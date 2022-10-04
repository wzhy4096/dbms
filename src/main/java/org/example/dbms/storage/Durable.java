package org.example.dbms.storage;

import org.example.dbms.data.Data;

import java.util.concurrent.Future;

/**
 * Represents object that can be persisted to disk or other non-volatile device.
 */
public interface Durable {
    /**
     * Set data in memory.
     *
     * @param data in memory
     */
    void setData(Data data);

    /**
     * Retrieve data from memory or disk.
     *
     * @return data
     */
    Data getData();

    /**
     * Set storage of data.
     *
     * @param storage of data
     */
    void setStorage(Storage storage);

    /**
     * Get storage of data
     *
     * @return storage of data
     */
    Storage getStorage();

    /**
     * Write memory data to disk or other non-volatile device.
     *
     * @return future wrapper of saved length
     */
    Future<Integer> save();
}
