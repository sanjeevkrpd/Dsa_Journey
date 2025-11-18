package SOLID;

public class S {

        //  S -> Single Responsibility Principal


      public void CreateBill(){

      }

      public void DeleteBill(){

      }

      public void SendMail(){

      }

    public static void main(String[] args) {
        
    }
    
    public class Bill {

      public void CreateBill(){

      }

      public void DeleteBill(){

      }
            
    }

    public class Mail{

      public void SendMail(){

      }

    }

}

// wrong
