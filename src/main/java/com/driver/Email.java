// package com.driver;

// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

// public class Email {

//     private String emailId;
//     private String password;

//     public Email(String emailId){
//         this.emailId = emailId;
//         this.password = "Accio@123";
//     }

//     public String getEmailId() {
//         return emailId;
//     }

//     public String getPassword() {
//         return password;
//     }
//     private static final String PasswordPattern =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
//     private static final Pattern password_pattern =  Pattern.compile(PasswordPattern);
//     public void changePassword(String oldPassword, String newPassword){
//         //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
//         // 1. It contains at least 8 characters
//         // 2. It contains at least one uppercase letter
//         // 3. It contains at least one lowercase letter
//         // 4. It contains at least one digit
//         // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

//         if(oldPassword.equals(this.password)){
//             if(isValid(newPassword)){
//                 this.password = newPassword;
//             }
//         }
//     }
//     private static boolean isValid(final String newPassword){
//         Matcher matcher= password_pattern.matcher(newPassword);
//         return matcher.matches();
//     }


// }
package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(this.password.equals(oldPassword))
        {
            if(newPassword.length()>=8)
            {
                int upper=0;
                int lower=0;
                int digit=0;
                int sp=0;
                for(int i =0 ; i <newPassword.length();i++)
                {
                    char ch =newPassword.charAt(i);
                    if(ch >='A' && ch <='Z')
                        upper++;
                    else if(ch>='a' && ch<='z')
                        lower++;
                    else if(ch>='0' && ch <='9')
                        digit++;
                    else
                        sp++;
                }
                if(upper >=1 && lower>=1 && digit >=1 && sp>=1)
                {
                    this.password=newPassword;
                }

            }

        }
    }
}
