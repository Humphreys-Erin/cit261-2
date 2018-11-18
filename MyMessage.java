//print a message

public class MyMessage {

   private String message;

   //constructor
	
   public MyMessage(String message){
      this.message = message;
   }
      
   // returns the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
}  