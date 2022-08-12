package org.addressbook;

import org.addressbook.model.Contact;
import org.addressbook.util.ContactUtil;
import org.util.SortUtil;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Modules");
    List<Contact> contactList = new ContactUtil().getContacts();
    System.out.println(contactList);
    List<Contact> sortedList = new SortUtil().sort(contactList);
    System.out.println(sortedList);
  }
}
