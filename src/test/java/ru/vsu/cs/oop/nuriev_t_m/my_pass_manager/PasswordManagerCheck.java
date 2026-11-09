package ru.vsu.cs.oop.nuriev_t_m.my_pass_manager;

import java.sql.SQLOutput;

public class PasswordManagerCheck {

    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();

        PasswordEntry google = new PasswordEntry(
                "Google",
                "exampleG@gmail.com",
                "google123"
        );
        PasswordEntry steam = new PasswordEntry(
                "Steam",
                "exampleS@gmail.com",
                "steam123"
        );
        PasswordEntry telegram = new PasswordEntry(
                "Telegram",
                "exampleT@gmail.com",
                "telegram123"
        );

        manager.addEntry(google);
        manager.addEntry(steam);
        manager.addEntry(telegram);

        System.out.println("Количество записей в списке: " + manager.getAllEntries().size());

        PasswordEntry found = manager.findByService("google");

        System.out.println("Найдена запись : " + found.getServiceName());
        System.out.println("Логин : " + found.getUsername());

        manager.removeEntry(google);

        System.out.println("Количество записей после удаления: " + manager.getAllEntries().size());

        System.out.println("Оставшиеся записи:");
        for (PasswordEntry entry : manager.getAllEntries()){
            System.out.println(entry.getServiceName());
        }
    }

}