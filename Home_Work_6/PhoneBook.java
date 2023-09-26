package Home_Work_6;

import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, Set<String>> phoneBook = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Home_Work_6/contacts.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                String phone = parts[1].trim();

                Set<String> phones = phoneBook.getOrDefault(name, new HashSet<>());
                phones.add(phone);
                phoneBook.put(name, phones);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Set<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());
        sortedContacts.sort((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Home_Work_6/new_contacts.csv"))) {
            for (Map.Entry<String, Set<String>> contact : sortedContacts) {
                writer.write(contact.getKey() + "," + String.join(",", contact.getValue()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Контакты после сортировки:");
        for (Map.Entry<String, Set<String>> contact : sortedContacts) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }
    }
}
