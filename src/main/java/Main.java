import a.AccountBuilder;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i ++) {
            AccountBuilder accountBuilder = new AccountBuilder();
            Thread thread = new Thread(accountBuilder);
            if(thread.getName().equals("Thread-0")){
                accountBuilder.setCountPosition(0);
            } else {
                accountBuilder.setCountPosition(2);
            }
            thread.start();
        }
    }
}
