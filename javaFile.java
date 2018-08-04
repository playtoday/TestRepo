import java.util.Random;
public class javaFile {

    public static void main(String... args) {
        System.out.println("Hello, world");
        Random r = new Random();

        String result = "";
        for (int i = 0; i < 4; i++) {

            result += r.nextInt(10);
        }
        System.out.println("New password is " + result);
    }
} 
