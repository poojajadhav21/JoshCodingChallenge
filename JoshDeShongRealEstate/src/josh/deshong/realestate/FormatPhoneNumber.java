/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josh.deshong.realestate;

import java.util.regex.Pattern;
import java.io.*;
/**
 *
 * @author Pooja Jadhav Eshwarlal 
 */
public class FormatPhoneNumber {public static void E164Format(String phone_number) {
        int i = phone_number.length();
        if (i == 10) {
            //Using java pattern class to check if the input phone_number pattern contains 10 digits
            Pattern pattern = Pattern.compile("\\d{10}");
            //Performing the pattern match method and storing the resultant boolean value into a variable 
            Boolean valid = pattern.matcher(phone_number).matches();
            if (valid == true) {
                //Converting the phone_number into E.164 format if the input is a valid 10 digit number
                String E164_format = "+1" + phone_number;
                System.out.println("Given phone number is " + phone_number);
                System.out.println("E.164 format is " + E164_format);
            } else {
                System.out.println("Invalid Phone Number! Please try again");
            }
        } else {
            System.out.println("Invalid Phone Number! Please try again");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter ten digits of the phone number in this format 4087013333 ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        E164Format(s);
    }
}
