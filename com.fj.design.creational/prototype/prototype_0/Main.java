package prototype.prototype_0;

public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for(int i = 0; i < 10; i++) {
            mail.setName("姓名:" + i);
            mail.setEmailAddress("姓名：" + i + "@qq.com");
            mail.setContent("恭喜您，此次抽奖活动中奖了");
            MailUtil.sendMail(mail);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
