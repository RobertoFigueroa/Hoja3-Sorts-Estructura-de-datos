public class Item  implements Comparable {

    private Integer item;

    public Item(Integer i){
        item = i;
    }

    @Override
    public int compareTo(Object object) {
        Item obj = (Item)object;
        int valueToReturn = item.compareTo(obj.getItem());
        return valueToReturn;

    }
    public int getItem(){
        return item;
    }
}
