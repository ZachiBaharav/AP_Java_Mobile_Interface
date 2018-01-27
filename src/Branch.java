

public class Branch {
    private double myLength;
    private Structure myS;       // either a mobile or weight

    
    // We are NOT concerned about whether it is Mobile or a Weight. All we care is that
    // it is a Structure!!
    // Structure is like the 'lowest common denominator' for all these
    public Branch(double l, Structure s) {
        myLength = l;
        myS = s;
    }
    
    public double totalWeight() {
        return myS.totalWeight();
    }

    public double torque() {
        return myS.totalWeight()*myLength;
    }
    
    
    public String toString() {
        return "length=" + myLength + " " + myS.toString();
    }
    
}
