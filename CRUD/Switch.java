package CRUD;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Switch  {
    UsersRepositoryFileImpl usersRepositoryFile = new UsersRepositoryFileImpl();
    private User user;
    Scanner scanner = new Scanner(System.in);
    void fabric() {
        Date date = new Date();
        user.setID(date.getTime());
        System.out.println("Введите имя");
        user.setName(scanner.nextLine());
        System.out.println("Введите фамилию");
        user.setLastName(scanner.nextLine());
        System.out.println("Введите возраст");
        user.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Есть ли у него работа? да/нет");
        if (scanner.nextLine().equals("да")) user.setWork(true);
        else user.setWork(false);
        usersRepositoryFile.create(user);
    }
    void select() {
        System.out.println("Введите тип операции с пользователем: " +
                "1 - поиск по ID; 2 - создание; 3 - обновление; 4 - удаление; 5 - показать весь список.");
        int a = Integer.parseInt(scanner.nextLine());
        long b;
        switch (a) {
            case 1:  //Поиск по ID
                System.out.println("Введите ID");
                b = Long.parseLong(scanner.nextLine());
                System.out.println(usersRepositoryFile.findById(b).toString());
                break;
            case 2:  //Создание
                fabric();
                break;
            case 3: // Обновление
                System.out.println("Введите ID");
                b = Long.parseLong(scanner.nextLine());
                user = usersRepositoryFile.findById(b);
                usersRepositoryFile.delete(b);
                usersRepositoryFile.update(user);
                break;
            case 4:  // Удаление
                System.out.println("Введите ID");
                usersRepositoryFile.delete(Long.parseLong(scanner.nextLine()));
                break;
            case 5: // Вывод всего списка
                usersRepositoryFile.print();
                break;
        }
    }
}
