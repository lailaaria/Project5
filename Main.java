import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("Hello, " + name);
    System.out.println("About, how much money did you spend Nov. 2020?");
    double novMoney = scan.nextDouble();
    System.out.println("About, how much money did you spend Dec. 2020?");
    double decMoney = scan.nextDouble();
    System.out.println("About, how much money did you spend Jan. 2021?");
    double janMoney = scan.nextDouble();

    double aveSpendings = moneySpent(novMoney, decMoney, janMoney);

    System.out.println("You spent an average of $" + aveSpendings + " the last 3 months.");

    

  }

  // method averages money spent the last three months
  static double moneySpent(double novMoney, double decMoney, double janMoney) {
    double total = novMoney + decMoney + janMoney;
    double aveSpendings = total / 3.0;
    return aveSpendings;
  }

  // method returns how to regulate spending
  public static void regulateMoney(double aveSpendings) {
    Scanner scan = new Scanner(System.in);
    if(aveSpendings <= 150){
     System.out.println("Good job regulating your spending. What is your average spending now?");
     double newSpending = scan.nextDouble();
     regulateMoney(newSpending);
    }else{
    System.out.println("Good effort spending $" + aveSpendings + ", but try spending about $10 less, in order to regulate your spending.");
      
    }
  }

}
