
import java.util.Iterator;
@SuppressWarnings("unchecked")

public class Arrays <T> implements Iterable<T>{

  private T [] arr;
  private int len = 0;
  private int capacity = 0;
  public Arrays(){
      this(16);
  }
public Arrays(int i) {
    if(capacity<0) throw new IllegalArgumentException("Illegal Capacity "+ capacity);
    this.capacity = capacity;
    arr = (T[]) new Object[capacity];
}
public int size (){return len;}
public boolean isEmpty(){
    return size()==0;
}
public T get(int index){
    return arr[index];
}
public void set(int index, T elem){
    arr[index]=elem;
}
public void clear(){
    for (int i =0; i<capacity; i++){
        arr[i]=null;
    }
    len = 0;
}
public void add(T elem){
    if (len+1>=capacity){
        if (capacity == 0){capacity=1;}
        else {capacity *= 2;}
        T[] new_arr = (T[]) new Object[capacity];
        for (int i = 0; i<len; i++){
            new_arr[i]= arr[i];
        }
        arr=new_arr;
        arr[len++]=elem;

    }
}
@Override
public Iterator<T> iterator() {
    // TODO Auto-generated method stub
    return null;
}


}