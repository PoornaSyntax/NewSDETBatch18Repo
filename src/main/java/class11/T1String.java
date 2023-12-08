package class11;
/*
Store username, password and confirm password from a user and heck
the following requirements:
1. Username or Password cannot be empty, if
   so--> message = "Username or Password cannot
   be empty".
2. Password should be minimum 8 characters, if less-->message="Password is too short"
3.Password cannot contain username if so -> message="Password cannot contain username"
4. Password should match confirmed password, if not->message="Passwords do not match".
Only after all requirements met ->message "Your username and password has been created"
 */


import java.util.Scanner;

public class T1String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Please Enter Username");
//        String userName = sc.nextLine();
//        System.out.println("Please Enter Password");
//        String password = sc.next();
//        System.out.println("Confirm password");
//        String confirmPassword= sc.next();
        String userName = "user1234";
        String password ="pass1234";
        String confirmPassword = "pass1234";
        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }




    }
}
