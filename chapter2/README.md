Command to execute java class

```
java --module-path out/production --module org.addressbook/org.addressbook.Main
```

Command to compile module and run the main

```
javac -d out --module-source-path src --module org.addressbook
java --module-path out --module org.addressbook/org.addressbook.Main
```