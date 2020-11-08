package it.unical.info.banking.data.helpers;

/**
 * Enumeration of Bank Account Type
 * Grouping based on their position in the enum
 *
 * @author r0d0
 * @version 1.0
 */
public enum AccountType {

    NORMAL, ENTERPRISE, SHARED;

    private int value;

//    AccountType() {
//        value = 1 + ordinal();
//    }

    /**
     * Returns the value of a particular type
     * @return AccountType's value
     */
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}