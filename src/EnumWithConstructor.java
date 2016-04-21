/**
 * Created by rqv035 on 4/21/16.
 */
enum Scopes {

    rewards(10), balances(20), swiftid(30);

    //Declare instance variable in enum
    int count;

    //Declare constructor
    Scopes(int i) {
        count = i;
    }

    //Declare method inside enum
    int getCount() {
        return count;
    }
}

public class EnumWithConstructor {

    public static void main(String args[])
    {
        System.out.println("Balances count : " + Scopes.balances.getCount());
        System.out.println("Rewards count : " + Scopes.rewards.getCount());
        System.out.println("SwiftID count : " + Scopes.swiftid.getCount());
    }
}


