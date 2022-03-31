


import ExceptionHandling.InvalideZipCodeException;

import java.util.Scanner;

public class swiggy {

    static  public void validate(int zipCode){
        try {
            if(zipCode!=123 && zipCode!=456 && zipCode!=789){
                System.out.println("Delivery available in your area");
            }else {
                throw  new InvalideZipCodeException();
//                throw  new InvalideZipCodeException("Delivery not available");
            }
        }catch (InvalideZipCodeException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thank you for visting our app!");
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int code=scn.nextInt();
        validate(code);
    }
}
