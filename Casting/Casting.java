public class Casting {
    public static void main(String[] args){
//Widening Casting;
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
//Narrowing Casting: must be done manually by placing the type in parentheses in front of the value;
double myDoublee = 9.78d;
int myIntt = (int) myDoublee; // Manual casting: double to int

System.out.println(myDouble);   // Outputs 9.78
System.out.println(myInt);      // Outputs 9
    }
    
}
