package UdacityProject.exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[] args) {

        String[] numbers = new String[4];
        numbers[0] = "123-5678";
        numbers[1] = "null";
        numbers[2] = "234-4567";
        numbers[3] = "345-5678";

        for (int i = 0; i < numbers.length; i++) {
            try{
                System.out.println(new Phone("iphone", numbers[i]));
            }catch(IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }

        }
    }
}
