package org.example.dbms.storage;

import org.example.dbms.data.Data;

/**
 * Container of durable objects. Storage consists : (1) config  (2) fsm  (3) wal  (4) payload  (5) index
 */
public interface Storage extends Durable {
    void setConfig(Data config);

    Data getConfig();

    void setFsm(Data fsm);

    Data getFsm();

    void setWal(Data log);

    Data getWal();

    void setPayload(Data payload);

    Data getPayload();

    void setIndex(Data index);

    Data getIndex();

}
