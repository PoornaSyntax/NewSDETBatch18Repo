package homework;

/*
Write program: User that has a constructor that initializes instance variable name and mobile number.
Create a subclass/child class  userInfo that will have user address variable and it also being initialized
through constructor call. Print users name, mobile number and address in userDetails method. Test your code
 */
public class User {
    private String name;
    private String mobileNumber;

    public User (String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
}

class UserInfo extends User{
    private String address;

    public UserInfo(String name, String mobileNumber,String address){
        super(name,mobileNumber);
        this.address=address;
    }

    public void userDetails(){
        System.out.println("User Details");
        System.out.println(getName());
        System.out.println(getMobileNumber());
        System.out.println(address);
    }

}
