public class Main {

    public static void main(String[] args) {
/*
        int[] theVals = {1, 3, 5, 7};
        int sum = 0;
        //foreach loop
        for (int currVal : theVals)
            sum += currVal;

        System.out.println(sum);
*/
        //Switch case statement + arrays
//        double[] val1 = {10.0d, 15.0d, 50.0d, 99.0d};
//        double[] val2 = {5.0d, 3.0d, 5.0d, 33.0d};
//        char[] opCodes  = {'+', '-' ,'*' , '/'};
//        double[] results = new double[opCodes.length];
//
//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.println("Test = " + testEquation.getResult());

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('+', 10.0d, 5.0d);
        equations[1] = new MathEquation('-', 15.0d, 3.0d);
        equations[2] = new MathEquation('*', 50.0d, 5.0d);
        equations[3] = new MathEquation('+', 99.0d, 33.0d);


        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("Result : " + equation.getResult());
        }
    }
//
//    public static  MathEquation create (double val1, double val2, char opCode){
//        MathEquation equation = new MathEquation();
//        equation.setVal1(val1);
//        equation.setVal2(val2);
//        equation.setOpCode(opCode);
//        return equation;
//    }

}