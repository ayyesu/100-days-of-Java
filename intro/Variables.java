public class Variables {
    public static void main(String[] args) {
        String name = "Daniel";
        System.out.println(name);
    //Assigning numbers;
        int myNum = 19;
        System.out.println(myNum);
    /*You can also declare a variable without assigning the value, and assign the 
    value later:*/
        String myString;
        myString = "I love to code";
        System.out.println(myString);
    /*If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", 
    which means unchangeable and read-only): */
        final int myPick = 20;
        System.out.println(myPick);
    //Demonstrating other types;
        int mySelect = 12;
        System.out.println(mySelect);
        String myLetter = "Software Engineering";
        System.out.println(myLetter);
        char pick = 'a';
        System.out.println(pick);
        boolean result = true;
        System.out.println(result);
        float myFloat = 4.2134f;
        System.out.println(myFloat);

    }
}



