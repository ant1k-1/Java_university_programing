package new_pracs.practice_26;

import java.util.ArrayList;
import java.util.Map;

public class hashtab {

    int realSize;
    int currentSize;

    Element[] table;

    private Integer hashtabHash(int iKey){
        return iKey % currentSize;
    }

    public void hashtabInit(){
        realSize = 0;
        currentSize = 8;
        table = new Element[currentSize];
    }

    public void hashtabAdd(int key, String value){
        int index = hashtabHash(key);

        realSize++;
        if (realSize > currentSize * 0.75) hashtabResize(currentSize * 2);

        if (table[index] == null) table[index] = new Element(key,value);
        else {
            Element tmp = table[index];
            while (tmp.next != null) tmp = tmp.next;
            tmp.addNext(new Element(key,value));
        }

    }

    public void hashtabDelete(int key){
        realSize--;

        int index = hashtabHash(key);

        if(table[index].Key == key ) table[index] = (table[index].next == null)  ? null : table[index].next;
        else if (table[index] != null){
            Element tmp = table[index];
            while (tmp.next != null && tmp.next.Key != key) tmp = tmp.next;
            tmp.next = null;
        }

    }

    public Element hashtabLookUp(int key){
        Element res = table[hashtabHash(key)];
        if (res == null) return null;
        else{
            if (res.Key == key) return res;
            else {
                while (res != null && res.Key != key) res = res.next;
                return res;
            }
        }
    }

    private void hashtabResize(int newSize){
        Element[] newTable = new Element[newSize];

        currentSize = newSize;

        for(Element elem : table){
            if (elem == null) continue;
            int iPlace = hashtabHash(elem.Key);
            if (newTable[iPlace] == null) newTable[iPlace] = elem;
            else {
                Element tmp = newTable[iPlace];
                while (tmp.next != null) tmp = tmp.next;
                tmp.addNext(elem);
            }
        }

        table = newTable;
    }

}
