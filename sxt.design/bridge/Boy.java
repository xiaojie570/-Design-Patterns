package bridge;

public class Boy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pursue(Girl girl) {
        Gift gift = new WarmGift(new Ring());
    }

    public void give(Girl girl, Gift gift) {
    }


}
