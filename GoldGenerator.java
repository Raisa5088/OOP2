public class GoldGenerator extends ItemFactory {
    @Override
    public GemItem createItem() {
        GoldReward goldReward = new GoldReward();
        goldReward.open();
        return goldReward;
    }