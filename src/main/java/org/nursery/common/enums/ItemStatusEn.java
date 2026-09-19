package org.nursery.common.enums;

public enum ItemStatusEn {
    AVAILABLE("0"),
    SOLD("SOLD");

    private final String value;

    ItemStatusEn(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ItemStatusEn fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return AVAILABLE;
        }
        for (ItemStatusEn status : ItemStatusEn.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        return AVAILABLE;
    }
}
