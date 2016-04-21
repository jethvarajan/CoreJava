/**
 * Created by Rajan Jethva on 4/20/16.
 */
public class ScopeEnum {
    enum Scope{
        balances,rewards,swift
    }

    public static void main(String args[]){
        Scope scope;
        scope = Scope.swift;

        switch (scope){
            case balances : System.out.println("Balances scope passed");
                break;
            case rewards: System.out.println("Rewards scope passed");
                break;
            case swift: System.out.println("Swift scope passed");
                break;
            default: System.out.println("Default scope passed");
        }
    }
}
