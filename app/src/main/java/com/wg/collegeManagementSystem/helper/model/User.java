package com.wg.collegeManagementSystem.helper.model;

/**
 * Created by Jerry on 11-06-2017.
 */

public class User {
    public static final String TAG = User.class.getSimpleName();
    public static final String TABLE = "users";

    // Labels Table Columns names
    public static final String KEY_UserId = "userId";
    public static final String KEY_UserName = "userName";
    public static final String KEY_UserEmail = "userEmail";
    public static final String KEY_UserPassword = "userPassword";
    public static final String KEY_UserRoleId = "userRoleId";

    public int userId;
    public String userName;
    public String userEmail;
    public String userPassword;
    public int userRoleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }
}