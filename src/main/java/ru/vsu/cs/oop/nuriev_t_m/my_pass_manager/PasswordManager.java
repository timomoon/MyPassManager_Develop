package ru.vsu.cs.oop.nuriev_t_m.my_pass_manager;

import java.util.ArrayList;
import java.util.List;

public class PasswordManager {
    private List<PasswordEntry> entries;

    public PasswordManager() {
        entries = new ArrayList<>();
    }

    public void addEntry(PasswordEntry entry) {
        entries.add(entry);
    }

    public void removeEntry(PasswordEntry entry) {
        entries.remove(entry);
    }

    public PasswordEntry findByService(String serviceName) {
        for (PasswordEntry entry : entries) {
            if (entry.getServiceName().equalsIgnoreCase(serviceName)) {
                return entry;
            }
        }

        return null;
    }

    public List<PasswordEntry> getAllEntries() {
        return new ArrayList<>(entries);
    }
}
