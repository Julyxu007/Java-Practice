package Basic.ControlFlow;

public class ConditionalStatements {
    public static void main(String[] args) {
        int temp= 32;
        if(temp > 30) {
            System.out.println("it's a hot day");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }



        // improving if statement
        int income = 120_000;
        boolean hasHighIncome = (income >100_000);

        // ternaryOperator
//      int income1 = 120_000;
//      String className;
//      if (income1 > 100_000) {
//          className = "First";
//      }else {
//          className = "Economy";
//      }
        //improving
        int income1 = 120_000;
        String className = income1 > 100_000? "First" :"Economy";

        //Switch Statements
        String role = "admin";
        if (role == "admin"){
            System.out.println("you are an admin");
        }
        else if (role == "moderator"){
            System.out.println("you are a moderator");
        }
       else{
            System.out.println("you are a guest");
        }
       // turn above into switch

        switch (role){
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
             break;
            default:
                System.out.println("you are a guest");
        }




    }




}
