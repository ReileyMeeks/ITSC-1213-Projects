/**
 * ITSC 1212 CandlePurchase class
 * Created by Adam Whaley
 *
 * 
 *
 */


public class CandlePurchase {
  
  //Declare fields for CandlePurchase
  private int numType1;
  private int numType2;
  private int numType3;
  private final int PURCHASE_THRESHOLD = 7;
  private final int DISCOUNT_THRESHOLD = 7; //Discount Threshhold
  Candle type1 = new Candle(1, 2.5, (5*60),.01);    // Create a Candle object for a Type 1 candle
  Candle type2 = new Candle(2, 3.75, (7*60), .03);   // Create a Candle object for a Type 2 candle
  Candle type3 = new Candle(3, 5.99, (12*60), .05);  // Create a Candle object for a Type 3 candle
  
  public CandlePurchase(int numType1, int numType2, int numType3) {
    //Set input values equal to variables
    this.numType1 = numType1; 
    this.numType2 = numType2;
    this.numType3 = numType3;
    
    return;
    
  }
  
  public double getSubTotal() {
    //Caclculate value of candles with discount
    if(this.numType1 + this.numType2 + this.numType3 >= DISCOUNT_THRESHOLD){
      double priceType1 = this.numType1 * type1.getCost();
      double priceType2 = this.numType2 * type2.getCost();
      double priceType3 = this.numType3 * type3.getCost();
      double totalCost = priceType1 + priceType2 + priceType3 - (5/100 * priceType1 + priceType2 + priceType3);
      
      return totalCost;
      
    }else{
      //Calculate without discount
      double priceType1 = this.numType1 * type1.getCost();
      double priceType2 = this.numType2 * type2.getCost();
      double priceType3 = this.numType3 * type3.getCost();
      double totalCost = priceType1 + priceType2 + priceType3;
      
      return totalCost;
      
    }
    
    
  }
  //Calculate the tax
  public double getTotalTax() {
    double taxCan1 = (this.numType1 * type1.getCost()) * type1.getTax();
    double taxCan2 = (this.numType2 * type2.getCost()) * type2.getTax();
    double taxCan3 = (this.numType3 * type3.getCost()) * type3.getTax();
    double totalTax = taxCan1 + taxCan2 + taxCan3;
    
    return totalTax;
  }
  //Calculate the burn time
  public int getTotalBurnTime() {
    int burnType1 = this.numType1 * type1.getTime();
    int burnType2 = this.numType2 * type2.getTime();
    int burnType3 = this.numType3 * type3.getTime();
    int totalBurn = (burnType1 + burnType2 + burnType3) / 60;  // Total burn time of all types of candles being bought
    
    return totalBurn;
  }
  
  // method that calculates the grand total of a purchase
  // by combining the returns of getSubTotal and getTotalTax
  public double getTotal() {
    
    return getSubTotal() + getTotalTax();
    
  }
  
  public void getPurchaseBreakdown() {
    //Determine print statement based off of discount or no discount
    if(this.numType1 + this.numType2 + this.numType3 >= DISCOUNT_THRESHOLD){
      System.out.println("You have recieved a 5% discount for buying 7 or more candles!");
    }else{
      System.out.println("You were not eligable to revieve a discount, requires purchase of 7 or more candles.");
    }
    //Print statements to show claculated values
    System.out.println("The sub total is: $" + getSubTotal());
    System.out.println("The total amount of tax is: $" + getTotalTax());
    System.out.println("The grand total is: $" + getTotal());
    System.out.println("The expected burn time is: " + getTotalBurnTime() + " hours");
  } 
  //Create the 4 histogram loops for each candle and all candles combined
  public void can1Hist(){
    System.out.println("Number of type 1 candles purchased:");
    for(int numStars = 0; numStars < this.numType1; numStars++){
      System.out.print("*"); 
    }
  }
  public void can2Hist(){
    System.out.println("\n" + "Number of type 2 candles purchased:");
    for(int numStars = 0; numStars < this.numType2; numStars++){
      System.out.print("*"); 
    }
  }
  public void can3Hist(){
    System.out.println("\n" + "Number of type 3 candles purchased:");
    for(int numStars = 0; numStars < this.numType3; numStars++){
      System.out.print("*"); 
    }
  }
  public void canHistTot(){
    System.out.println("\n" + "Total number of candles purchased:");
    for(int numStars = 0; numStars < this.numType1 + this.numType2 + this.numType3; numStars++){
      System.out.print("*"); 
    }
  }
}