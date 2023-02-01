
package twentytwo.fall.oop.l2.a2;

public class M22W0385 {
    public static void main(String[] args){

        char ascii_character = 177;
        //here we are define the character of ascii
        System.out.println("special ASCII character is: "+ascii_character);
        //here we print the character of ascii which output will be "special ascii character is"

        int result = (int)Math.pow(4, 8)/2;
        //It is usd for returns the value of a base raised to a power.
        System.out.println("Result_value = "+ result);
        // here we are print output which shown as "result_value = "

        System.out.println("The short data type range is approximately " + ascii_character+ result +"."+"#"+ascii_character+ (result-1));

        int minimum = 32768;
        //here integer was used to describe the value

        System.out.println(("The maximum is: +")+--minimum);
        //this is used for print the integer value

        int maximum = 32768;
        //here also using the integer value

        System.out.println(("The minimum is: -")+maximum);
        //this is also print the integer value

    }
}
