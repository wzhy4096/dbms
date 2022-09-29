package org.example.dbms.storage;

import java.util.Objects;
import java.util.concurrent.Future;

/**
 * Represents object that is durable.
 */
public interface Durable {
    /**
     * Write data to disk or other non-volatile device.
     * @return future wrapper of write result
     */
    Future<Boolean> save();

    /**
     * Construct from bytes.
     */
    void setBytes();

    /**
     * @return bytes in memory
     */
    byte[] getBytes();

    /**
     * @return data length
     */
    default int getLength() {
        byte[] data = getBytes();
        return Objects.isNull(data) ? 0 : data.length;
    }

    String toString();
}
