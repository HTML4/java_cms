package com.mp.common;

public class Const {
    public static final String CURRENT_USER = "currentUser";

    /**
     * 用户权限 admin = 0  user = 1
     */
    public interface Role {
        int ROLE_CUSTOMER = 1;
        int ROLE_ADMIN = 0;
    }

    public interface CategoryStatus {
        int CATEGORY_OPEN = 1;
        int CATEGORY_CLOSE = 2;
        int CATEGORY_DELETE = 3;
    }
}
