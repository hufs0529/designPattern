package factory;

import java.util.Date;

public class HpCreator extends ItemCreator{
    @Override
    protected void requestItemsInfo() {
        System.out.println("Get Item from DB");
    }

    @Override
    protected void createItemLog() {
        System.out.println("Create Item" + new Date());
    }

    @Override
    protected Item cteateItem() {
        return new HpPortion();
    }
}
