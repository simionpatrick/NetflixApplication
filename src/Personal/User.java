package Personal;

import Personal.Profile;

import java.util.ArrayList;

public class User {
    private String email;
    private String password;
    private ArrayList<Profile> userProfiles;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        userProfiles = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getNumberOfProfiles() {
        return userProfiles.size();
    }

    public void addProfile(String profileName) {
        Profile profile = new Profile(profileName);
        if (userProfiles.size() <= 4) {
            userProfiles.add(profile);
        } else {
            System.out.println("The maximum number of profiles has been reached");
        }
    }
}
