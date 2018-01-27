/*
 This program will create a mobile, and test whether it is balanced (or not).

Below is an example Mobile.

                 6  |   5
            +-------+-----+
          1 |  4          |
         +------+         12
         |      |
         8      2

We will combine the description of what mobile is, with some Java-talk:
1. Mobile is composed of two Branches: Left Branch and Right Branch.
Therefore, it's constructor should have the signature:
    public Mobile(Branch bleft, Branch bright)

2. Each branch has a Length, and a Structure at the end.
Branch constructor:
    public Branch(double l, Structure s)

3. The Structure can be either a Mobile or a Weight.
We will make Struct an interface class, that Weight and Mobile implement it.
(we will see in a minute why these are the required function)
    public interface Structure {
        double totalWeight();
        boolean isBalanced();
    }

4. Weight class constructor looks like:
        public Weight(double w)



For example, the below Mobile can be described as:

                 6  |   5
            +-------+-----+
          1 |  4          |
         +------+         12
         |      |
         8      2

        Branch b1l = new Branch(1,new Weight(8));
        Branch b1r = new Branch(4,new Weight(2));
        Mobile m1 = new Mobile(b1l,b1r);
        
        Branch b2l = new Branch(6,m1);
        Branch b2r = new Branch(5,new Weight(12));
        Mobile m2 = new Mobile(b2l,b2r);
        
How do we check if a Mobile is balanced?
    1. Each of it's branches is balanced.  ( A weight is always balanced)
    2. The torque is equal for it's two branches. To compute the torque,
we will need to know the total-weight of each branch.


For example, in the mobile above we need:
        1*8  =? 2*4  ==> Yes
        10*6 =? 5*12 ==> Yes
        
**********************************

You will need to write 4 (=FOUR) files.
1. Mobile.java
2. Structure.java   (<-- This one is literally given above)
3. Weight.java
4. Branch.java

such that the below testing program will work.

*/


public class Main {

    public static void main(String[] args) {
        /*
                 6  |   5
            +-------+-----+
          1 |  4          |
         +------+         12
         |      |
         8      2
        
        */
        
        Branch b1l = new Branch(1,new Weight(8));  // <-- Note: constructor with Weight
        Branch b1r = new Branch(4,new Weight(2));
        Mobile m1 = new Mobile(b1l,b1r);
        
        Branch b2l = new Branch(6,m1);             // Constructor with Mobile
        Branch b2r = new Branch(5,new Weight(12));
        Mobile m2 = new Mobile(b2l,b2r);
        

        System.out.println("Mobile is balanced: " + m2.isBalanced());
        
        
        //m2.setIndent();
        System.out.println("Mobile structure:\n" + m2.toString());
        
    }

    
}
