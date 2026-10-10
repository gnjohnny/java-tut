
@FunctionalInterface 
interface Calculations{
    int add(int i, int j);
}

public class Main{
    public static void main(String[] args){

        Calculations calc = (i, j) -> i + j;

        int results = calc.add(1, 7);
        System.out.println(results);
    }
}