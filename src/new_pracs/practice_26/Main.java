package new_pracs.practice_26;

public class Main {
    public static void main(String[] args){
        hashtab tab = new hashtab();
        tab.hashtabInit();
        tab.hashtabAdd(10,"a");
        tab.hashtabAdd(15,"b");
        tab.hashtabAdd(8,"c");
        tab.hashtabAdd(3,"d");

        System.out.println(tab.hashtabLookUp(3));
        tab.hashtabDelete(3);
        System.out.println(tab.hashtabLookUp(3));
        System.out.println(tab.hashtabLookUp(8));

    }
}
