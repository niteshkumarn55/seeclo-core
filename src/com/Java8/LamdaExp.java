package com.Java8;

public class LamdaExp {

    public static void main(String[] args) {
        LamdaExp lamdaExp = new LamdaExp();
        lamdaExp.someAction.someAction();

        System.out.println(lamdaExp.someWork.someWorkNeed(new Work("Learning lambda functions")));
    }

    // Java 7
    public void performAction() {
        System.out.println("Hello world...");
    }


    // Java 8
    SomeActionLambda someAction = () -> {
        System.out.println("Hello world greeting...");
    };
    SomeWorkLambda someWork = (Work work)->{
        return work.working(work.whatWork);
    };

    interface SomeActionLambda{
        void someAction();
    }
    interface SomeWorkLambda{
        String someWorkNeed(Work work);
    }
}
