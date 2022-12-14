package vib.track.cerberus.data;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("code")
    private String code;

    @SerializedName("ringLogin")
    private boolean ringLogin;

    @SerializedName("userName")
    private String userName;

    @SerializedName("hashedPwd")
    private String hashedpassword;

    public String getCode() {
        return code;
    }

    public boolean getringLogin() { return ringLogin; }

    public String getUserName() { return userName; }

    public String getHashedpassword() { return hashedpassword; }
}
