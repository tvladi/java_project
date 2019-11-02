package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("qwerty", "ws", "test1", "test2", "test3"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returntoHomePage();
  }

}
