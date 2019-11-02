package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.testng.Assert.assertTrue;

public class ContactHelper extends HelperBase{

    public boolean acceptNextAlert = true;

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectContact() {
        click(By.id("4"));
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = wd.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public void deleteSelectedContact() {
        acceptNextAlert = true;
        wd.findElement(By.xpath("//input[@value='Delete']")).click();
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }

    public void fillContactForm(ContactData groupData) {
        type(By.name("firstname"), groupData.getFirstName());
        type(By.name("lastname"), groupData.getLastName());
        type(By.name("address"), groupData.getAddress());
        type(By.name("email"), groupData.getEmail());
        type(By.name("mobile"), groupData.getMobile());
    }

    public void submitContactCreation() {
        //click(By.xpath("(//input[@name='submit'])[2]")).click();
        click(By.name("submit"));
    }

    public void returntoHomePage() {
        click(By.linkText("home"));
    }

}
