package ui;

import model.Category;
import model.Transaction;
import model.Type;
import model.WalletService;

import java.util.Scanner;


public class ConsolUI {

    public void start(){
        System.out.println("Выберите операцию: ");
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        WalletService walletService = new WalletService();
        while (running){


            System.out.println("1. Добавить транзакцию.");
            System.out.println("2. Вывести список транзакций.");
            System.out.println("3. Получить баланс");
            System.out.println("4. Вывести последнюю транзакцию");
            System.out.println("5. Выйти.");



            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Transaction transaction = new Transaction();
                    System.out.println("Выберите тип транзакции: 1. Доход. 2. Трата.");
                    int choiceTransactionType = scanner.nextInt();
                    if (choiceTransactionType == 1) {
                        transaction.setType(Type.INCONE);
                    } else if(choiceTransactionType == 2) {
                        transaction.setType(Type.EXPENSE);
                    } else {
                        System.out.println("INCORRECT INPUT!");
                    }

                    System.out.println("Введите сумму транзакции: ");
                    transaction.setAmount(scanner.nextInt());

                    System.out.println("Выберите категорию транзакции: \n1. Еда \n2. Транспорт \n3. Обучение \n4. Отдых");
                    int choiceCategory = scanner.nextInt();
                    switch (choiceCategory){
                        case 1-> transaction.setCategory(Category.FOOD);
                        case 2-> transaction.setCategory(Category.TRANSPORT);
                        case 3-> transaction.setCategory(Category.LEARNING);
                        case 4-> transaction.setCategory(Category.RELAXING);
                    }
                    scanner.nextLine();
                    System.out.println("Добавьте описание транзакции: ");
                    String inputDescription = scanner.nextLine();
                    transaction.setDescription(inputDescription);


                    walletService.addTransaction(transaction);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    running = false;
                    break;
            }




        }
    }
}
