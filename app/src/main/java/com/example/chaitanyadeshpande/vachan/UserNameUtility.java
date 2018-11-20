package com.example.chaitanyadeshpande.vachan;

public class UserNameUtility {
    private static final String LOG_TAG = "UserNameUtility";
    private static UserNameUtility instance;

    String userName;

    private UserNameUtility() {
    }

    public static UserNameUtility getInstance() {
        if (instance == null) {
            instance = new UserNameUtility();
        }
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
