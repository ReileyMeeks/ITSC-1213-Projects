/**
 * ITSC 1212 Candle class
 * Created by Bruce Long
 *
 * THIS CLASS IS USED AS A TEMPLATE TO CREATE CANDLE OBJECTS
 * EACH SUCH OBJECT CONTAINS ITS OWN COPY OF ALL THE DATA AND METHODS SHOWN BELOW
 */
public class Candle {

  // ATTRIBUTES (also called FIELDS or INSTANCE VARIABLES)
  private int type;      // This candle object's Type: 1, 2, or 3
  private double cost;   // This candle object's cost
  private int burnTime;  // This candle object's burn time in minutes
  private double tax;    
  
  // CONSTRUCTOR
  // User must supply three arguments: int, double, int (representing Type, cost, and burn time in that order) when creating this Candle object
  // See lines 11-13 in the CandleShop class to see how this constructor is used
  public Candle(int typ, double cst, int brn, double tx) {
    this.type = typ;      // Store the first user-suplied argument (int) in the Type attribute
    this.cost = cst;      // Store the second user-supplied argument (double) in the cost attribute
    this.burnTime = brn;  // Store the third user-supplied argument (int) in the burnTime attribute
    this.tax = tx;
  }

  // GETTER FOR COST
  public double getCost() {
    return this.cost;  // Return the cost of the current Candle object
  }

  //  GETTER FOR BURN TIME
  public int getTime() {
    return this.burnTime;  // Return the burn time of the current Candle object
  }
  
  public double getTax(){
    return this.tax;
  }

  // Returns a String object with all the data from the current Candle object
  public String toString() {
    return "Each type " + this.type + " candle costs $" + this.cost +
           " and burns for " + this.burnTime + " minutes" + this.tax + " tax";
  }

}
