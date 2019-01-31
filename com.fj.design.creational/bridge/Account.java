package bridge;

public interface Account {
    // 打开账号
    Account oppenAccount();
    // 查看账号类型：活期储蓄 与 定期储蓄
    void showAccountType();
}
