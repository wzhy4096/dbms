package org.example.dbms.data;

public interface Data {
    byte[] getBytes();

    void setId(Data id);

    Data getId();

    void setPayload(Data payload);

    Data getPayload();
}
