package a;

import lombok.Data;

@Data
public class Account {
    private String id;
    private int money;

    public Account(String id, int money) {
        this.id = id;
        this.money = money;
    }
}
