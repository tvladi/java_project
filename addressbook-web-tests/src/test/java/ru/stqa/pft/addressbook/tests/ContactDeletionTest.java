package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.gotoContactPage();
      app.getContactHelper().createContact(new ContactData("qwerty", "ws", "test1", "test2", "test3", "test7"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.gotoHomePage();
  }

}
