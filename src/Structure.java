
// Interface class is like a contract, setting expectations.
// 
// If a class implements an interface, it has to supply all the functions
// defined in the interface.
//
// Than, other things can be sure this class has these interfaces.
//


public interface Structure {

    // Interface: 
    //    Methods are "public abstract"
    //    Variables are "public static final"
    //      e.e, public static final int x = 123;

    public abstract double totalWeight();
    boolean isBalanced();

}
