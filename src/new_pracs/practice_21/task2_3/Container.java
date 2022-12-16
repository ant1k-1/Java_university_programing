package new_pracs.practice_21.task2_3;

public class Container <T>{
    T[] array;

    public Container(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    public void set(int index, T val) throws IndexOutOfBoundsException{
        array[index]=val;
    }

}
