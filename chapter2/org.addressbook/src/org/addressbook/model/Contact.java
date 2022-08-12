package org.addressbook.model;

public class Contact implements Comparable<Contact> {
  private String id;
  private String firstName;
  private String lastName;
  private String phoneNumber;

  public Contact(String id, String firstName, String lastName, String phoneNumber) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Contact{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
  }

  @Override
  public int compareTo(Contact o) {
    return this.lastName.compareTo(o.lastName);
  }
}
