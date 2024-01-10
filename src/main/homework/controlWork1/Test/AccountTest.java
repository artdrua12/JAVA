package main.homework.controlWork1.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.controlWork1.Account;
import main.homework.controlWork1.DateUtil;

public class AccountTest {

    @Test
    public void testFindAccounts() {
        Assert.assertEquals(Account.findAccounts("c 12345-54321 на 12335-54321  2000").toString(),
                "[Date of processing " + DateUtil.curentDate() + " from 12345-54321 to 12335-54321 amount 2000$\n]");
    }
}
