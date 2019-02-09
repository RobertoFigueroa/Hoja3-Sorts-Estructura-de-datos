public class Item  implements Comparable {

    private Integer item;

    public Item(Integer i){
        item = i;
    }

    @Override
    public int compareTo(Object object) {
        int valor = ((Integer)object).intValue();
        int valueToReturn = Integer.compare(item,valor);
        return valueToReturn;
    }
}
