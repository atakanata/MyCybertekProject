package repl;

public class repl153 {


    public static void main(String[] args) {
//        The method person get a string with this format : "name,last name,age"
//        for example:
//
//        person("jon,doe,30");
//
//        the output is:
//
//        person name: jon last name: doe age: 30
//
//        hint: use the split method to split the string to a string array where there is a "," char

String s = "jon,doe,30";
person(s);

    }

    public static void person (String s){

        String [] arr = s.split(",");
        System.out.println(     "person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]      );
    }
}
