package tdd;

public class ArrayList implements List{
    private boolean isEmpty = true;
    private int size;
    private String[] elements = new String[8];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        elements[size++] = item;
    }
    @Override
    public  void remove(String item) {
        size--;
    }
    @Override
    public int size() {
      return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

}
