package properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {
    private static Properties properties= new Properties();

    static {
        try{
            InputStream in = TestProperties.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(in);
        }
        catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }

    public static String getDriverPath(){
        String driverPath = properties.getProperty("driverPath");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the application.properties file.");
    }

    public static String getEmailAddress(){
        String emailAddress = properties.getProperty("emailAddress");
        if(emailAddress!= null) return emailAddress;
        else throw new RuntimeException("emailAddress not specified in the application.properties file.");
    }

    public static String getAccountTitleText(){
        String accountTitle = properties.getProperty("verifyAccountTitle");
        if(accountTitle!= null) return accountTitle;
        else throw new RuntimeException("Account title not specified in the application.properties file.");
    }

    public static String getPassword(){
        String password = properties.getProperty("password");
        if(password!= null) return password;
        else throw new RuntimeException("Password not specified in the application.properties file.");
    }
}
