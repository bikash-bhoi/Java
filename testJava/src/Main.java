import java.io.IOException;
import java.util.*;

public class Main {

    public static void main (String[] args) throws Exception {

        try {
            System.out.print("Enter the string : ");
            Scanner strEntered = new Scanner(System.in);
            String str2 = strEntered.next();
            System.out.print("Enter size of Substring : ");
            int subStrSize = strEntered.nextInt();
            if(subStrSize>str2.length()){
                throw new Exception("Substring size greater than length of string");
            }
            TreeSet<String> strSet = new TreeSet<String>();
            for(int i=0; i<=str2.length() - subStrSize; i++){
                strSet.add(str2.substring(i,i+subStrSize));
            }
            System.out.println(strSet.first());
            System.out.println(strSet.last());

        }catch(Exception e)
        {

            if(e.toString() == "java.util.InputMismatchException")
                System.out.println("Invalid Type");
            else
                System.out.println(e.getLocalizedMessage());
        }
//
//
//        strSet.add("abc");
//
//
//        System.out.println(strSet);
//        System.out.println(strSet.first());
//        System.out.println(strSet.last());


    }
}
