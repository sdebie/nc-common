package org.nursery.common.enums;

public enum ImportStatusEn {
    PENDING("Pending"),
    ACTIVE("Active"),
    REJECTED("Rejected");

    private final String displayName;

    ImportStatusEn(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static ImportStatusEn fromString(String value) {
        try {
            return ImportStatusEn.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            return PENDING;
        }
    }
}
