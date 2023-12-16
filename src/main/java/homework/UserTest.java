package homework;

  class User1 {
    // Parent class

        private String name;
        private String mobileNumber;

        // Constructor for User
        public User1(String name, String mobileNumber) {
            this.name = name;
            this.mobileNumber = mobileNumber;
        }

        // Getter methods (optional)
        public String getName() {
            return name;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }
    }

    // Subclass
    class UserInfo1 extends User1 {
        private String address;

        // Constructor for UserInfo
        public UserInfo1(String name, String mobileNumber, String address) {
            super(name, mobileNumber);
            this.address = address;
        }

        // Method to print user details
        public void userDetails() {
            System.out.println("User Details:");
            System.out.println("Name: " + getName());
            System.out.println("Mobile Number: " + getMobileNumber());
            System.out.println("Address: " + address);
        }
    }

    public class UserTest {
        public static void main(String[] args) {
            // Create an object of UserInfo
            UserInfo1 user1 = new UserInfo1("John Doe", "1234567890", "123 Main St, City");

            // Call userDetails method to print details
            user1.userDetails();
        }
    }


