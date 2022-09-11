package CRUD;


public class mainCRUD {
    public static void main(String[] args) {
        UsersRepositoryFileImpl usersRepositoryFile = new UsersRepositoryFileImpl();
        usersRepositoryFile.init();
        Switch sw = new Switch();
        while(true)  {
            sw.select();
           }
    }
}
