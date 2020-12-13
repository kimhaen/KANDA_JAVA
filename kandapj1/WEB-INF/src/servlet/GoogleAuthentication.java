package servlet;




import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;



public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
    public GoogleAuthentication(){
        passAuth = new PasswordAuthentication("구글아이디", "앱 비밀번호");
    }
    public PasswordAuthentication getPasswordAuthentication() {
        return passAuth;
    }
}