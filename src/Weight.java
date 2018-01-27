


public class Weight implements Structure{
    
    private double myWeight;
    
    public Weight(double w) {
        myWeight = w;
    }
    
    
    // Our contract with the interface class!
    public double totalWeight() {
        return myWeight;
    }
    
    public boolean isBalanced() {
            return true;
    }
    
    // just so we things things nicer
    public String toString() {
        return "[ Weight (isBalanced=" + isBalanced() + " totalWeight=" + totalWeight() + ") ]";
    }
    
}
