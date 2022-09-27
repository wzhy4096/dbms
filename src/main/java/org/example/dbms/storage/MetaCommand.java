package org.example.dbms.storage;

public interface MetaCommand {

    CommandType getCommandType();

    StorageId getStorageId();

    Object getPayload();

    enum CommandType {
        READ(1), WRITE(2);

        private final int value;

        CommandType(int value) {
            this.value = value;
        }

        int intValue() {
            return value;
        }

        static CommandType fromInt(int value) {
            return switch (value) {
                case 1 -> CommandType.READ;
                case 2 -> CommandType.WRITE;
                default -> throw new IllegalArgumentException();
            };
        }
    }
}
