package enumconcepts;

/**
 * Created by rqv035 on 4/21/16.
 */

enum ScopeWithDefaultConstructor {
    Rewards(10), Balances, SwiftID(20);

    int count;

    ScopeWithDefaultConstructor(){
        this.count = 1;
    }

    ScopeWithDefaultConstructor( int count ){
        this.count = count;
    }

    int getCount(){
        return count;
    }

}

public class EnumOrdinal {

    public static void main(String[] args) {
        ScopeWithDefaultConstructor sc;
        System.out.println("Rewards count : " + ScopeWithDefaultConstructor.Rewards + " and " + "ordinal : " + ScopeWithDefaultConstructor.Rewards.ordinal());
        System.out.println("Balances count : " + ScopeWithDefaultConstructor.Balances + " and " + "ordinal : " + ScopeWithDefaultConstructor.Balances.ordinal());
        System.out.println("SwiftID count : " + ScopeWithDefaultConstructor.SwiftID  + " and " + "ordinal : " + ScopeWithDefaultConstructor.SwiftID.ordinal());

        if (ScopeWithDefaultConstructor.Rewards.ordinal()>ScopeWithDefaultConstructor.SwiftID.ordinal()) {
            System.out.println("Rewards is greater then balance");
        } else {
            System.out.println("Rewards is smaller then balance");
        }
    }
}
