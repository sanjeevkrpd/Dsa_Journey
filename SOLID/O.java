package SOLID;

public class O {
    //  O-> Open/Closed Principal


        public class  Mail {
            
            public void send(String message, String type){

                if (type == "Notification") {
                    
                    // code for send notification
                }
                else if (type == "SMS") {
                    

                    // code for send sms
                }
            }
            
        }

    public static void main(String[] args) {
        
    }

            public abstract class Notification {
                public abstract void send(String message);
            }


        public class EmailNotification extends Notification {
            
            @Override
            public void send(String message) {
                System.out.println("Sending email: " + message);
            }
        }

            public class SmsNotification extends Notification   {
            
                
                @Override
                public void send(String message){
                    
                    System.out.println("send the sms message");
                }
            }

}
