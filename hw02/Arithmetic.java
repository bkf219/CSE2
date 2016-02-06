//Brian Falkenstein
//homework 2
//Februrary 6 2016
//CSE 2

public class Arithmetic //main class
{
    public static void main(String args[]) //required main method
        {
            //Number of pairs of pants
            int numPants = 3;
            //Cost per pair of pants
            double pantsPrice = 34.98;
            //Number of shirts
            int numShirts = 2;
            //Cost per shirt
            double shirtPrice = 24.99;
            //Number of belts
            int numBelts = 1;
            //cost per box of belts
            double beltCost = 33.99;
            //the tax rate
            double paSalesTax = 0.06;
            
            //instantiating variables
            //total cost of pants
            double totalCostOfPants;
            //total cost of shirts
            double totalCostOfShirts;
            //total cost of belts
            double totalCostOfBelts;
            //sales tax for pants
            double totalTaxOfPants;
            //sales tax of shirts
            double totalTaxOfShirts;
            //sales tax of belts
            double totalTaxOfBelts;
            //total price before tax
            double totalPriceNoTax;
            //total sales tax
            double totalSalesTax;
            //total cost
            double totalCost;
            
            //calculate cost of pants before tax
            totalCostOfPants=numPants*pantsPrice;
            //print out the cost of pants
            System.out.println("The cost of pants before tax is $" + totalCostOfPants);
            //calculate cost of shirts before tax
            totalCostOfShirts=numShirts*shirtPrice;
            //print out cost of shirts
            System.out.println("The cost of shirts before tax is $" + totalCostOfShirts);
            //calculate cost of belts before tax
            totalCostOfBelts=numBelts*beltCost;
            //print out cost of belts
            System.out.println("The cost of belts before tax is $" + totalCostOfBelts);
            
            //calculate the tax on pants
            totalTaxOfPants= (int)((totalCostOfPants*paSalesTax)*100);
            totalTaxOfPants=totalTaxOfPants/100;
            //print out the tax on pants
            System.out.println("The total tax on pants is $" + totalTaxOfPants);
            //calculate the tax on shirts
            totalTaxOfShirts=(int)((totalCostOfShirts*paSalesTax)*100);
            totalTaxOfShirts=totalTaxOfShirts/100;
            //print out the tax on shirts
            System.out.println("The total tax on shirts is $" + totalTaxOfShirts);
            //calculate the tax on belts
            totalTaxOfBelts=(int)((totalCostOfBelts*paSalesTax)*100);
            totalTaxOfBelts=totalTaxOfBelts/100;
            //print out the tax on belts
            System.out.println("The total tax on belts is $" + totalTaxOfBelts);
            
            //calculate the total cost before tax
            totalPriceNoTax=totalCostOfBelts+totalCostOfPants+totalCostOfShirts;
            //print out the total cost before tax
            System.out.println("The total cost before tax is $" + totalPriceNoTax);
            
            //calculate the total sales tax
            totalSalesTax=totalTaxOfBelts+totalTaxOfPants+totalTaxOfShirts;
            //print out the total tax
            System.out.println("The total sales tax is $" + totalSalesTax);
            
            //calculate the total cost
            totalCost=totalPriceNoTax+totalSalesTax;
            //print out the total cost
            System.out.println("The total cost is $" + totalCost);
            
        }
}