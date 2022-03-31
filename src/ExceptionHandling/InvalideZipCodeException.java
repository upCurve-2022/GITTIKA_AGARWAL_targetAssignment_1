package ExceptionHandling;

public class InvalideZipCodeException  extends  Exception{
   public InvalideZipCodeException(){
       super("Sorry gentlemen delivery is not availabe in your area");
   }
   public  InvalideZipCodeException(String message){
       super(message);
   }

}
