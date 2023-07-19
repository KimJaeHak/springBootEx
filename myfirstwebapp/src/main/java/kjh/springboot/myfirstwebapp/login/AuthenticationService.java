package kjh.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password)
    {
        
        boolean isValidUserName = username.equalsIgnoreCase("kjh");
        boolean isValidPwd = password.equalsIgnoreCase("dummy");
        return isValidUserName && isValidPwd;
    }
}
