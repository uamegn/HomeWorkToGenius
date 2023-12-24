import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomAge = generateRandomAge();
        boolean canGoOut = canGoOut(randomAge);

        System.out.println("Возраст:" + randomAge);
        System.out.println("Можно ли идти гулять?");
    }

    public static int generateRandomAge() {
       Random random = new Random();
        return random.nextInt(101); // генератор случаных чисел от 0 до 100
    }
    public static boolean canGoOut(int age) {
        return age >= 18;
    }

}