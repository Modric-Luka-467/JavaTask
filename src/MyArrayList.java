public class MyArrayList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList(){
        elements = new Object[3];
        size = 0;
    }
    public void add(T element) {
        if (size==elements.length){
            Object[] newArr = new Object[elements.length*2];
            for (int i=0;i<elements.length;i++){
                newArr[i] = elements[i];
            }
            elements = newArr;
            System.out.println("触发底层扩容!当前数组容量由3扩容至6");
        }
        elements[size] = element;
        size++;
        System.out.println("成功添加:"+element);
    }
    public T get(int index) {
        if (index<0||index>=size){
            System.out.println("索引越界!");
            return null;
        }
        return (T) elements [index];
    }
    public void remove(int index){
        if (index<0||index>=size){
            System.out.println("索引越界!");
            return;
        }
        System.out.println("删除了索引["+index+"]的元素("+get(index)+")");
        for (int i = index;i<size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1]=null;
        size--;
    }
}
