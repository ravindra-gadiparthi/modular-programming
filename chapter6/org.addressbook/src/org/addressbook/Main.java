package org.addressbook;


import org.contact.model.Contact;
import org.contact.util.ContactLoader;
import org.contact.util.ContactLoaderException;
import org.util.SortUtil;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Starting Contact processing");
        List<Contact> contactList = null;
        try {
            contactList = new ContactLoader().loadContacts("C:\\Workspaces\\Personal\\Java\\modular-programming\\input.xml");
        } catch (ContactLoaderException e) {
            logger.severe(e.getMessage());
            System.exit(0);
        }
        System.out.println(contactList.toString());
        List<Contact> sortedList = new SortUtil().sort(contactList);
        System.out.println(sortedList.toString());
        logger.info("ending Contact processing");
    }
}
