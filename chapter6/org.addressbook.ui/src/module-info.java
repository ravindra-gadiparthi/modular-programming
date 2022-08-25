module org.addressbook.ui {
    requires java.logging;
    requires javafx.controls;
    requires org.addressbook.lib;
    exports org.addressbook.ui to javafx.graphics;
}