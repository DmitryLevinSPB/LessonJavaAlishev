import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scan.nextInt();
        switch (age){
            case 0:
            System.out.println("Только родился");
            break;
                case 15:
                System.out.println("Ты подросток");
                break;
                case 20:
                    System.out.println("Ты здоровяк");
                    break;
            default:
                System.out.println("Ничего не подходит");
            }
        }
    }
