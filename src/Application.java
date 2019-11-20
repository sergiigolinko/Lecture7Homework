import java.util.Scanner;

public class Application {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount bA = new BankAccount("Sergii", "Golinko", 'm', 10082.3, 5000, true);
        int optionNumber = -1;
        while (optionNumber != 0) {
            printMenu();
            optionNumber = getCommandLineInput();
            switch (optionNumber) {
                case 1: {
                    System.out.println(bA.isActive());
                    break;
                }
                case 2: {
                    bA.printInfo();
                    break;
                }
                case 3: {
                    bA.printBalance();
                    break;
                }
                case 4: {
                    bA.put(250);
                    break;

                }
                case 5: {
                    bA.withdraw(500);
                    break;

                }
                case 6: {
                    bA.block();
                    break;

                }
                case 7: {
                    bA.unblock();
                    break;
                }
                default: {
                    System.out.println("Unresolved command!");
                    break;
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("1 - зарегистрировать счет");
        System.out.println("2 - распечатать информацию по счету");
        System.out.println("3 - распечатать баланс");
        System.out.println("4 - пополнить счет");
        System.out.println("5 - вывести средства");
        System.out.println("6 - заблокировать счет");
        System.out.println("7 - разблокировать счет");
        System.out.println("0 - завершить работу");
    }

    private static int getCommandLineInput() {
        System.out.print("Пожалуйста, введите номер опции >> ");
        return SCANNER.nextInt();
    }
}