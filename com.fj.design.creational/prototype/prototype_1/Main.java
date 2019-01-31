package prototype.prototype_1;
// 原型模式是对二进制流进行克隆复制
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化 mail：" + mail);
        for(int i = 0; i < 10; i++) {
            // 用原始的Mail 去克隆
            Mail tempMail = (Mail) mail.clone();
            tempMail.setName("姓名:" + i);
            tempMail.setEmailAddress("姓名：" + i + "@qq.com");
            tempMail.setContent("恭喜您，此次慕课网活动中奖了");
            System.out.println("克隆出来的 mail：" + tempMail);
            MailUtil.sendMail(tempMail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
