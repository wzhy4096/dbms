package org.example.dbms.storage;

/**
 * Container of durable objects. Bytes of storage consists : (1) durable config (2) durable fsm  (3) durable index
 * (4) durable log
 */
public interface Storage extends Durable {
    void setConfig(Durable config);

    Durable getConfig();

    void setFsm(Durable fsm);

    Durable getFsm();

    void setIndex(Durable index);

    Durable getIndex();

    void setLog(Durable log);

    Durable getLog();

    void setData(Durable data);

    Durable getData();
}
