package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class initContactModification extends TestBase {

    @Test
    public void testContactModification() {
        app.gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().modifyContact();
        app.getContactHelper().fillContactForm(new ContactData("qwerty", "ws", "test1", "test2", "test3", null), false);
        app.getContactHelper().submitContactModification();
        app.gotoHomePage();
    }
}
