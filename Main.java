 //Topic -> Exceptions

//  Compile time error
//  Run time error
//  Logical error

public class Main{
    public static void main(String[] args){
        int i = 0;
        int j = 8;

        try{
            int result = j/i;
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}