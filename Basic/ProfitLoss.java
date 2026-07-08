import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Cost Price:");
        int cost=sc.nextInt();
        System.out.print("Enter Selling Price:");    
        int sell=sc.nextInt();
        if(sell>cost) {
            double profit=sell-cost;
            double profitpercent=(profit/cost)*100.0;
            System.out.println("Profit is Of : "+ profitpercent+"%");
        }
        else if(sell<cost) {
            double loss=cost-sell;
            double losspercent=(loss/cost)*100.0;
            System.out.println("Loss is: "+losspercent+"%");
        }
        else System.out.println("NO PROFIT NO LOSS");    
        sc.close();
    }
}
