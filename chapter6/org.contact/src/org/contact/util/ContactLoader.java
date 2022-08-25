package org.contact.util;


import org.contact.internal.XMLUtil;
import org.contact.model.Address;
import org.contact.model.Contact;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class ContactLoader {
    public List<Contact> loadContacts(String fileName) throws ContactLoaderException {
        Document document;
        XMLUtil xmlUtil = new XMLUtil();
        try {
            document = xmlUtil.loadXml(fileName);
        } catch (Exception exception) {
            throw new ContactLoaderException("Failed to load contacts");
        }
        List<Contact> contacts = new ArrayList<>();


        NodeList nList = document.getElementsByTagName("contact");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node contactNode = nList.item(temp);
            if (contactNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) contactNode;

                Contact contact = new Contact();
                contact.setFirstName(xmlUtil.getElement(contactNode, "firstname"));
                contact.setLastName(xmlUtil.getElement(contactNode, "lastname"));
                contact.setPhone(xmlUtil.getElement(contactNode, "phone"));
                Node addressNode = eElement.getElementsByTagName("address").item(0);

                Address address = new Address();
                address.setStreet(xmlUtil.getElement(addressNode, "street"));
                address.setCity(xmlUtil.getElement(addressNode, "city"));
                address.setState(xmlUtil.getElement(addressNode, "state"));
                address.setCountry(xmlUtil.getElement(addressNode, "country"));
                contact.setAddress(address);

                contacts.add(contact);
            }
        }
        return contacts;
    }
}
