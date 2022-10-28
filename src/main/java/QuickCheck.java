public class QuickCheck {
    public static void main(String [] args){
        int num1 = 0;
        try{

            int num2 = 20/num1;

        }catch (ArithmeticException e){
            System.out.println("Divide by 0");
        }finally{
            System.out.println("inside finally block");
        }
            System.out.println("This line will be printed");
    }
}
