package repl;

import java.util.Scanner;

public class repl54 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        String message;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int status = scan.nextInt();
        //WRITE YOUR CODE HERE
//        200, OK
//        201, Created
//        202, Accepted
//        301, Moved Permanently
//        303, See Other
//        304, Not Modified
//        307, Temporary Redirect
//        400, Bad Request
//        401, Unauthorized
//        403, Forbidden
//        404, Not Found
//        410, Gone
//        500, Internal Server Error
//        503, Service Unavailable

        switch (status){
            case 200 : message="OK";
            break;
            case 201: message="Created";
            break;
            case 202 : message="Accepted";
                break;
            case 301: message="Moved Permanently";
                break;
            case 303 : message="See Other";
                break;
            case 304: message="Not Modified";
                break;
            case 307 : message="Temporary Redirect";
                break;
            case 400: message="Bad Request";
                break;
            case 401 : message="Unauthorized";
                break;
            case 403: message="Forbidden";
                break;
            case 404 : message="Not Found";
                break;
            case 410: message="Gone";
                break;
            case 500 : message="Internal Server Error";
                break;
            case 503: message="Service Unavailable";
                break;
            default: message="Invalid status code!";
break;
        }
        System.out.println(message);



    }
}
