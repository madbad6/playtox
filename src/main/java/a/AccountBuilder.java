package a;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class AccountBuilder implements Runnable,Inter{

    private static List<Account> accounts;
    private Transaction transaction = new Transaction();
    int countPosition;

    {
        int count = 0;
        accounts = new ArrayList<>();
        while (count < 4) {
            accounts.add(new Account(generationId(), 10000));
            count++;
        }
    }

    String generationId() {
        int length = 8;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    @Override
    public void run() {
        for (int i = 0; i <15; i++) {
            acauntB();
        }
    }

    @Override
    public Transaction acauntB() {
        transaction.toTransaction(accounts, countPosition);
        return transaction;
    }
}

