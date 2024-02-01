import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения массива через пробел");
        String str = scan.nextLine();
        String[] numbers = str.split("\\s+");

        for(String number : numbers){
            if((Integer.parseInt(number) % 3 == 0)){
                System.out.print(number + " ");
            }
        }
    }
}
