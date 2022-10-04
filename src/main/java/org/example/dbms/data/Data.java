package org.example.dbms.data;

import java.util.concurrent.Future;

/**
 * Abstract of any data.
 */
public interface Data {
    Future<Integer> save();

    Future<byte[]> retrieve();

    void setId(Data id);

    Data getId();

    void setPayload(Data payload);

    Data getPayload();
}
