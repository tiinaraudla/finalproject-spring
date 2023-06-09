package com.example.finalprojectspring.utils;

import com.example.finalprojectspring.exceptions.UserValidationException;
import com.example.finalprojectspring.models.User;
import com.example.finalprojectspring.models.UserType;

/**
 * @author Tiina Raudla
 * @Date
 */
public class UserValidator {
    public boolean isAdminUser(User user) throws UserValidationException {
        String fullName = user.getFirstName() + " " + user.getLastName();

        if(user.getUserType() == null) {
            throw new NullPointerException(String.format("The user type is null for user: %s", fullName));
        }

        if(UserType.ADMIN.equals(user.getUserType())) {
            return true;
        } else {
            throw new UserValidationException(fullName, "User admin check failed!");
        }
    }
    public String encodePassword(String password) {
        int midIndex = password.length() / 2;

        return password.substring(0, midIndex) +"#sda_java#" + password.substring(midIndex);
    }

}
