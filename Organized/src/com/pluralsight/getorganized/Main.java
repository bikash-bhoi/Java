package com.pluralsight.getorganized;

public class Main {

    public static void main(String[] args) {
        int[] theVals ={1,3,5,7};
        int sum = 0;
        //foreach loop
        for (int currVal : theVals)
            sum += currVal;

        System.out.println(sum);

        //Switch case statement + arrays
        double[] val1 = {10.0d, 15.0d, 50.0d, 99.0d};
        double[] val2 = {5.0d, 3.0d, 5.0d, 33.0d};
        char[] opCodes  = {'+', '-' ,'*' , '/'};
        double[] results = new double[opCodes.length];

        for (int i =0 ; i<opCodes.length; i++){
            switch (opCodes[i]){
                case '+':
                    results[i] = val1[i] + val2[i];
                    break;
                case '-':
                    results[i] = val1[i] - val2[i];
                    break;
                case '*':
                    results[i] = val1[i] * val2[i];
                    break;
                case '/':
                    results[i] = val2[i] != 0 ? val1[i] / val2[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode");
                    break;
            }
        }

        for (double theRes : results){
            System.out.println("Result : " + theRes);
        }

    }
}
