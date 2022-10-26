package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class UserManager {

    private Collection<String> userStorage;

    public UserManager() {
        userStorage = new ArrayList<>();
    }

    public boolean addUser(String userEmail) throws DuplicateUserException{
        for (String s : userStorage) {
            if (s.equals(userEmail)) {
                throw new DuplicateUserException("User already exists");
            }

        }
        return userStorage.add(userEmail);

    }

    public String getUser(String userEmail) {
        return userStorage.stream().filter(user -> user.equals(userEmail)).findFirst().orElse(null);
    }

    public boolean deleteUser(final String userEmail) {
        return userStorage.removeIf(e -> e.equals(userEmail));
    }
}
