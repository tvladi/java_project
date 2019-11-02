package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectContact() {
        click(By.id("8"));
    }

    public void deleteSelectedContact() {
        wd.findElement(By.xpath("//input[@value='Delete']")).click();
        wd.switchTo().alert().accept();
    }

    public void fillContactForm(ContactData groupData) {
        type(By.name("firstname"), groupData.getFirstName());
        type(By.name("lastname"), groupData.getLastName());
        type(By.name("address"), groupData.getAddress());
        type(By.name("email"), groupData.getEmail());
        type(By.name("mobile"), groupData.getMobile());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void returntoHomePage() {
        click(By.linkText("home"));
    }

    public void modifyContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }
}
