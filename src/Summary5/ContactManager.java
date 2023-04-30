package Summary5;

import java.util.HashSet;

/*
Реализовать класс Contact с полями name (тип данных String) и phoneNumber (тип данных String).
    Реализовать класс ContactManager, который будет управлять списком контактов.
    Класс ContactManager должен содержать следующие методы:
        addContact(Contact contact): добавляет контакт в список. Если контакт с таким именем и
        номером телефона уже существует, необходимо выдать сообщение об ошибке.
        removeContact(Contact contact): удаляет контакт из списка.
        getContacts(): возвращает список всех контактов.
        getContactByName(String name): возвращает контакт по имени.
        getContactByPhoneNumber(String phoneNumber): возвращает контакт по номеру телефона.
 */
public class ContactManager {
    HashSet <Contact> contactInfo;

    public static void addContact(HashSet <Contact> contactInfo, Contact contact){
        if (contactInfo.contains(contact)){
            System.out.println("This contact already exist.");
        } else {
            contactInfo.add(contact);
        }
    }
    public static void removeContact(HashSet <Contact> contactInfo, Contact contact){
        if (contactInfo.contains(contact)){
            contactInfo.remove(contact);
            System.out.println("Contact been removed");
        } else {
            System.out.println("Such contact doesn't exist");
        }
    }
    public static void printAllContacts (HashSet <Contact> contactInfo){
        for (Contact element: contactInfo) {
            System.out.println(element);
        }
    }
}
