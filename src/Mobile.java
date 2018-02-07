

public class Mobile implements Structure{

    private Branch br,bl;
    
    
    public Mobile(Branch bleft, Branch bright) {
        bl = bleft;
        br = bright;
    }
    
    
    // our contract with the interface class!
    public double totalWeight() {
        return bl.totalWeight() + br.totalWeight();
    }
    
    public boolean isBalanced() {
        return bl.torque() == br.torque()  && bl.isBalanced() && br.isBalanced() ;
    }
    
    
    
    // Just to get nicer printout
    static private int indent = 0;
    public void setIndent()
    {
        indent=0;
    }
    private String indentSpaces()
    {
        String str = "";        
        for (int ii=0; ii<indent; ++ii)
                str +="\t";
        return str;
    }        
    
    public String toString()
    {
        String str1 = "{ Mobile (isBalanced=" + isBalanced() + " totalWeight=" + totalWeight() + ")";
        indent++;
        String str2 = "\n"+ indentSpaces() + "--> Left  " + bl.toString();
        String str3 = "\n"+ indentSpaces() + "--> Right " + br.toString();
        String str4 = " }";
        indent--;
        return str1+str2+str3+str4;
    }
    
}
