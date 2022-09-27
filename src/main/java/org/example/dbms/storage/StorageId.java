package org.example.dbms.storage;

public interface StorageId extends Comparable<StorageId> {

    String toString();

    byte[] toBytes();
}
