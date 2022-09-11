package CRUD;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UsersRepositoryFileImpl  {
Scanner scanner = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    long sleep() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date = new Date();
        return date.getTime();
    }

    void init() {
        users.add(new User(sleep(), "Nick", "Andrianov", 41, true));
        users.add(new User(sleep(), "Maria", "Andrianova", 35, true));
        users.add(new User(sleep(), "Serafim", "Andrianov", 6, false));
        users.add(new User(sleep(), "Sofia", "Andrianova", 10, false));
        writerIO(users);
    }

    User findById(long id) {
        users = readerIO();
        for (User user : users) {
            if (user.getID() == id) return user;
        }
        return null;
    }

    void create(User user) {
        users = readerIO();
        users.add(user);
        writerIO(users);
    }

    void update(User user) {
        System.out.println("Введите обновленное имя");
        user.setName(scanner.nextLine());
        System.out.println("Введите обновленную фамилию");
        user.setLastName(scanner.nextLine());
        System.out.println("Введите новый статус работы да/нет");
        if("да".equals(scanner.nextLine())) user.setWork(true);
                else user.setWork(false);
        users.clear();
        users = readerIO();
        users.add(user);
        writerIO(users);
    }

    void delete(long id) {
        users = readerIO();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getID() == id) users.remove(i);
        }
        writerIO(users);
    }

    void print() {
        users = readerIO();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    ArrayList<User> readerIO() {
        StringBuilder stringBuilder = new StringBuilder();
        users.clear();
        try (FileReader reader = new FileReader("file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] words = stringBuilder.toString().split("\\|");
        for (int i = 0; i < words.length; ) {
            User user = new User();
            user.setID(Long.parseLong(words[i]));
            i++;
            user.setName(words[i]);
            i++;
            user.setLastName(words[i]);
            i++;
            user.setAge(Integer.parseInt(words[i]));
            i++;
            if (words[i].equals("true")) user.setWork(true);
            else user.setWork(false);
            i++;
            users.add(user);
        }
        return users;
    }

    void writerIO(ArrayList<User> users) {
        String[] str = new String[users.size()];
        for (int i = 0; i < users.size(); i++) {
            str[i] = users.get(i).convert();
        }
        try (FileWriter writer = new FileWriter("file.txt")) {
            for (int i = 0; i < str.length; i++) {
                writer.write(str[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
