package Setup.project.modals;

import lombok.Data;

@Data
public class LoginModal {


    public static String username = "USERNAME";

    public static String password = "PASSWORD";

    public static String expectedError = "EXPECTED_ERROR";

    public static String expectedUrl = "EXPECTED_URL";


    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getExpectedError() {
        return expectedError;
    }

    public static String getExpectedUrl() {
        return expectedUrl;
    }
}