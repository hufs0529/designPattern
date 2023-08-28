package factory;

public abstract class ItemCreator {

    public Item create() {
        Item item;

        // step1
        requestItemsInfo();
        // step2
        item = cteateItem();
        // step3
        createItemLog();

        return item;
    }

    // 아이템 요청
    abstract protected void requestItemsInfo();

    // 아이템 생성
    abstract protected void createItemLog();

    // 아이템 생성 알고리즘
    abstract protected Item cteateItem();
}
