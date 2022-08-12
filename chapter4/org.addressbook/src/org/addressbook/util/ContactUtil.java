package org.addressbook.util;

import org.addressbook.model.Contact;

import java.util.Arrays;
import java.util.List;

public class ContactUtil {
  public List<Contact> getContacts() {
    return Arrays.asList(
        new Contact("1", "Ravi", "Gadiparthi", "9766602186"),
        new Contact("1", "Mounika", "Chunduri", "9766602186"),
        new Contact("1", "Shashikanth", "Gadiparthi", "9766602186"),
        new Contact("1", "Anusha", "Kutumbaka", "9766602186"));
  }
}
