public class ExceptionHandling {
    public static void main(String [] args){
        int[] age = new int[10];
            try{
                for(int i = 0; i <= age.length; i++){
                    System.out.println((age [1]));
                }
            }catch (ArrayIndexOutOfBoundsException object){
                String toString = object.toString();
                System.out.println(object); // toString method to the object is called
            }
        System.out.println("line after exception");
    }
}
