/**
 * ITSC 1212 CandleShop class
 * Created by Bruce Long
 *
 * RUN THIS SIMULATION MULTIPLE TIMES TO SEE HOW THE RESULTS ARE RANDOMIZED
 *
 */
public class CandleShop {

  public static void main(String[] args) {
    Candle type1 = new Candle(1, 2.5, (5*60), 0.01);    // Create a Candle object for a Type 1 candle
    Candle type2 = new Candle(2, 3.75, (7*60), 0.02);   // Create a Candle object for a Type 2 candle
    Candle type3 = new Candle(3, 5.99, (12*60), 0.05);  // Create a Candle object for a Type 3 candle

    //  Each print statement below:
    //  Calls the Candle class toString method to return a String with data about the object being referenced
    //  Prints this String to the console
    System.out.println(type1.toString());  //  Print the type1 object's data
    System.out.println(type2.toString());  //  Print the type2 object's data
    System.out.println(type3.toString());  //  Print the type3 object's data

    /*
     * In the assignment statements below, work from right to left:
     *   1. Determine the value of the expression on the right side of the assignment operator (=)
     *   2. Assign that value to the variable on the left side of the assignment operator
     */

    //  HOW MANY CANDLES OF EACH TYPE SHOULD BE BOUGHT?
    //  Right side:
    //    1. "Math.random()" generates a random double value from 0.0 to as much as 0.99999999
    //    2. Multiplying that by 11 gives you a random double value from 0.0 to as much as 10.99999999
    //    3. Casting that product to an integer truncates the fractional part and leaves you with a random integer from 0 to 10
    //  Left side:
    //    1. Declare one integer variable to hold the number of candles of the type being bought
    //  Result of statement: Assign a random integer from 0 to 10 to an integer variable for each type of candle
    int numType1 = (int)(Math.random()*11);  // Number of Type 1 candles being bought
    int numType2 = (int)(Math.random()*11);  // Number of Type 2 candles being bought
    int numType3 = (int)(Math.random()*11);  // Number of Type 3 candles being bought
    int totalNum = numType1 + numType2 + numType3;  // Compute total number of candles being bought

    //  COMPUTE THE COST OF THAT MANY CANDLES OF EACH TYPE
    //  Right side:
    //    1.  Call that Candle object's getCost method to return the cost for that type of candle
    //    2.  Multiply that cost by the number of that type of candle being bought
    //  Left side:
    //    1.  Declare a double variable to hold the cost of the number of candles of that type being bought
    //  Result of statement: Assign the cost of the number of candles being bought to a double variable for each type of candle
    double costType1 = numType1 * type1.getCost();
    double costType2 = numType2 * type2.getCost();
    double costType3 = numType3 * type3.getCost();
    double totalCost = costType1 + costType2 + costType3;  //  Compute total cost of all types of candles being bought
    
    //Calculate Tax
    double taxCan1 = costType1 * type1.getTax();
    double taxCan2 = costType2 * type2.getTax();
    double taxCan3 = costType3 * type3.getTax();
    double totalTax = taxCan1 + taxCan2 + taxCan3;
    double totWithTax = totalCost + totalTax;
    
    
    //  COMPUTE THE BURN TIME FOR THAT MANY CANDLES OF EACH TYPE
    //  Same process as above but with burn time instead of cost
    int burnType1 = numType1 * type1.getTime();
    int burnType2 = numType2 * type2.getTime();
    int burnType3 = numType3 * type3.getTime();
    int totalBurn = burnType1 + burnType2 + burnType3;  // Total burn time of all types of candles being bought

    //  DISPLAY THE RESULTS OF THIS SIMUATION
    //  Print the results for each type of candle being bought and for the overall totals as well
    System.out.println("This order is for:");
    System.out.println("   " + numType1 + " Type 1 candles that costs $" + costType1 +
            ", plus $" + taxCan1 + " in tax" + " and will burn for " + burnType1 + " minutes");
    System.out.println("   " + numType2 + " Type 2 candles that costs $" + costType2 +
            ", plus $" + taxCan2 + " in tax" + " and will burn for " + burnType2 + " minutes");
    System.out.println("   " + numType3 + " Type 3 candles that costs $" + costType3 +
            ", plus $" + taxCan3 + " in tax" + " and will burn for " + burnType3 + " minutes");
    System.out.println("   The total cost, including tax, of these " + totalNum +
            " candles is $" + totWithTax + " and the total burn time is " + totalBurn + " minutes");
    
  }



}
