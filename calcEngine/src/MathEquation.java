/**
 * Created by Biks on 5/16/2017.
 */
public class MathEquation {
    private double val1 ;
    private double val2;
    private char opCode = '+';
    private double result;

    public double getVal1() {return val1;}
    public void setVal1(double val1) {this.val1 = val1;}
    public double getVal2() {return val2;}
    public void setVal2(double val2) {this.val2 = val2;}
    public char getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult() {return result;}

    //Constructors
    public MathEquation() {}

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double val1, double val2){
        this(opCode);
        this.val1 = val1;
        this.val2 = val2;
    }

    public void execute(double val1, double val2){
        this.val1 = val1;
        this.val2 = val2;
        execute();
    }

    public void execute(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
        execute();
        result = (int)result;
    }

    public void execute(){
        switch (opCode) {
            case '+':
                result = val1 + val2;
                break;
            case '-':
                result = val1 - val2;
                break;
            case '*':
                result = val1 * val2;
                break;
            case '/':
                result = val2 != 0 ? val1 / val2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode");
                break;
        }
    }

}
