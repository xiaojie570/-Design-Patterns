package bridge;

public class SavingAccount implements Account{
    @Override
    public Account oppenAccount() {
        System.out.println(" 打开活期账号 ");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println(" 这是一个 活期账号");
    }
}
