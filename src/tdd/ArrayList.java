package tdd;

public class ArrayList implements List{
    private boolean isEmpty = true;
    private int size;

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public void add(String item) {
        isEmpty = false;
        size++;
    }
    @Override
    public  void remove(String item) {
        isEmpty = true;
        size--;
    }
    @Override
    public int size() {
      return 1;
    }

}
