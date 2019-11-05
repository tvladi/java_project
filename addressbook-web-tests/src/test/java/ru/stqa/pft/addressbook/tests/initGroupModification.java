package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class initGroupModification extends TestBase{

    @Test
    public void testGroupModification() {
        app.gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test7", null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        //int before = app.getGroupHelper().groupsCount();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test7", "test8", "test9"));
        app.getGroupHelper().submitGroupModification();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        //int after = app.getGroupHelper().groupsCount();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        for (int i = 0; i < after.size(); i++) {
            Assert.assertEquals(before.get(i), after.get(i));
        }
    }
}
