package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class initGroupModification extends TestBase{

    @Test
    public void testGroupModification() {
        app.gotoGroupPage();
        //new
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test7", null, null));
        }
        //***
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test7", "test8", "test9"));
        app.getGroupHelper().submitGroupModification();
    }
}
