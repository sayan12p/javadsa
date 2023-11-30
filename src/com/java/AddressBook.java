package com.java;



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String FILE_NAME = "src/main/resources/AAA.txt";


    private String addressBookName;
    private ArrayList<Contact> friends = new ArrayList<>();


    public AddressBook(String name) {
        this(name, new ArrayList<Contact>());
    }

    public AddressBook(String addressBookName, ArrayList<Contact> phonebook) {
        super();
        this.friends = phonebook;
        this.addressBookName = addressBookName;
    }

    public AddressBook() {
        this.friends = new ArrayList<>();
    }



    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    public ArrayList<Contact> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Contact> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "AddressBook [addressBookName=" + addressBookName + ", phonebook=" + friends + "]";
    }


    public void addFriend(String name, String phoneNumber) {
        Contact friend = new Contact(name, phoneNumber);
        friends.add(friend);
    }

    public void displayFriendsSortedByName() {
        // Sort friends by name
        Collections.sort(friends, Comparator.comparing(Contact::getName));

        // Display the sorted list
        for (Contact friend : friends) {
            System.out.println("Name: " + friend.getName() + ", Phone: " + friend.getPhoneNumber());
        }
    }

    public void saveToFile(AddressBook addressBook) {
        Path filePath = Paths.get("C://Users//SAYAN//Downloads", "addressbook1.txt");
        List<Contact> contactList=null;
        try  {
            contactList=addressBook.getFriends();
            for(int i=0;i<contactList.size();i++) {
                Files.writeString(filePath, contactList.get(i).getName()+ "\n", StandardOpenOption.APPEND);
                Files.writeString(filePath, contactList.get(i).getPhoneNumber() +"\n", StandardOpenOption.APPEND);
            }
            // Write the friend list to the file
            System.out.println("Address book saved to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveToFilefor2(AddressBook addressBook) {
        Path filePath = Paths.get("C://Users//SAYAN//Downloads", "addressbook2.txt");
        List<Contact> contactList=null;
        try  {
            contactList=addressBook.getFriends();
            for(int i=0;i<contactList.size();i++) {
                Files.writeString(filePath, contactList.get(i).getName()+ "\n", StandardOpenOption.APPEND);
                Files.writeString(filePath, contactList.get(i).getPhoneNumber()+ "\n", StandardOpenOption.APPEND);
            }
            // Write the friend list to the file
            System.out.println("Address book saved to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static AddressBook readAddressBookFromFile(String filePath) {
        AddressBook addressBook=new AddressBook();
        ArrayList<Contact> contactList=new ArrayList<>();
        try  {
            String text=Files.readString(Path.of(filePath)).strip();
            String[] input=text.split("\n");
            for(int i=0;i<input.length;i=i+2){
                for(int j=i;j<=i+1;j++){
                    Contact c=new Contact(input[j].trim(),input[j+1].trim());
                    contactList.add(c);
                    break;
                }
            }
            addressBook.setFriends(contactList);
            // Write the friend list to the file
            System.out.println("Address read successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return addressBook;
    }


    public static void main(String[] args) throws IOException {
       AddressBook addressBook1 = new AddressBook();
       AddressBook addressBook2=new AddressBook();
//        // Display friends sorted by name

        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the number of friends :");
        int input = Integer.parseInt(bfn.readLine());
        if(input>0){
            for(int i=0;i<input;i++){
                System.out.println("Enter name:");
                String name=bfn.readLine();
                System.out.println("Enter phonenumber:");
                String phonenumber=bfn.readLine();
                addressBook1.addFriend(name,phonenumber);
            }
        }
        addressBook1.displayFriendsSortedByName();

        // Save address books to files
        addressBook1.saveToFile(addressBook1);

        addressBook1 = readAddressBookFromFile("C://Users//SAYAN//Downloads//addressbook1.txt");
        System.out.println("Enter the second address book :");
        System.out.println("Enter the number of friends :");
        int input1 = Integer.parseInt(bfn.readLine());
        if(input1>0){
            for(int i=0;i<input1;i++){
                System.out.println("Enter name:");
                String name=bfn.readLine();
                System.out.println("Enter phonenumber:");
                String phonenumber=bfn.readLine();
                addressBook2.addFriend(name,phonenumber);
            }
        }
        addressBook2.saveToFilefor2(addressBook2);
        addressBook2 = readAddressBookFromFile("C://Users//SAYAN//Downloads//addressbook2.txt");
        List<Contact> contactList1=addressBook1.getFriends();
        List<Contact> contactList2=addressBook2.getFriends();
        List<String> namelist1=contactList1.stream().map(c->c.getName()).collect(Collectors.toList());
        List<String> namelist2=contactList2.stream().map(c->c.getName()).collect(Collectors.toList());
        List<String> duplicatenames=namelist1.stream().filter(namelist2::contains).collect(Collectors.toList());
        namelist1.removeIf(duplicatenames::contains);
        namelist2.removeIf(duplicatenames::contains);
        List<String> finalstring=Stream.of(namelist1,namelist2).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println((finalstring));
    }
}



