public class Register{

    private boolean[] storage;
    private final int SIZE;
    
    public Register16(int size){
	SIZE = size; 
	storage = new boolean[size];
    }

    public void store(boolean[] toStore){
	storage = toStore;
    }

    public boolean[] readBits(){
	return storage;
    }

    public int getSize(){
	return SIZE;
    }

}