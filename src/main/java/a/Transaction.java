package a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Transaction {

    private static final Logger LOGGER = LoggerFactory.getLogger(Transaction.class);

    public int random() {
        Random r = new Random();
        int x = r.nextInt(1000) + 1;
        return x;
    }

    public void toTransaction(List<Account> accounts, int countPosition) {
        List<Account> account = new ArrayList<>();
        account.add(accounts.get(countPosition));
        account.add(accounts.get(countPosition + 1));

            int random = random();
            if (account.get(0).getMoney() < random) {
                account.get(0).getMoney();
                account.get(1).getMoney();
            } else {
                account.get(0).setMoney(account.get(0).getMoney() - random);
                account.get(1).setMoney(account.get(1).getMoney() + random);
            }

        LOGGER.info("Ычет снятия: " + account.get(0).getId() + " " + account.get(0).getMoney() + "Счет зачисления: " + account.get(1).getId() + " " + account.get(1).getMoney());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
