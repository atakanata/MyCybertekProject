package day33;

public class Warmup {
    public static void main(String[] args) {

   String spelledNameSera = Warmup.getSpelledName("Sera");
        System.out.println("spelledNameSera = " + spelledNameSera);
    System.out.println(getSpelledName2("Zeynep") );

    }

    public static String getSpelledName (String name){
        String result = "";
        for (int x = 0; x < name.length(); x++) {
            result =result +name.charAt(x);
            if (x!=name.length()-1){
                result = result + "-";
            }
        }

        return result;
    }
    public static String getSpelledName2 (String name){
        String result = "";
        for (int x = 0; x < name.length(); x++) {
            result =result +name.charAt(x)+"-";

        }

        return result.substring(0,result.length()-1       );
    }
}
