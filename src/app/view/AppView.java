package app.view;

import java.util.Scanner;

public class AppView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getOption() {
        System.out.print("""
                
                \u2B07\uFE0F   Яку каву бажаєте:
                
                1\uFE0F\u20E3   Еспресо
                2\uFE0F\u20E3   Капучино
                3\uFE0F\u20E3   Лате
                
                0\uFE0F\u20E3   Закрити додаток
                
                """);
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
