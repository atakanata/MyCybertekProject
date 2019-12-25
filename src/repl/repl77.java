package repl;

public class repl77 {
    public static void main(String[] args) {
//        Write a program that will print out information about user based on email. Print first and last name from the upper case.
//
//        Example:
//        Input: craig_federighi@apple.com
//        Output:
//        First name: Craig
//        Last name: Federighi
//        Domain: apple
//        Top-Level Domain: com

        String email = "craig_federighi@apple.com";

        String Domain = email.substring(email.indexOf("@")+1,email.indexOf(".")          );
        String TLDomain = email.substring(email.indexOf(".")+1                );
        String FirstName = email.substring( 1, email.indexOf("_")     );
        String FirstlNameALLCAPS= email.toUpperCase();
        String LastName = email.substring(  email.indexOf("_")+1,   email.indexOf("@")        );
        char LastnameALLCAPS = LastName.toUpperCase().charAt(0);
        System.out.println("First name: "+ FirstlNameALLCAPS.charAt(0) +FirstName );
        System.out.println(  "Last name: "+LastnameALLCAPS+LastName.substring(1)       );
        System.out.println("Domain: " + Domain);
        System.out.println("Top-Level Domain: "+TLDomain);



    }
}
