public class Register{

    private boolean[] storage;
    private final int SIZE;

    public Register(int size){
	SIZE = size;
	storage = new boolean[size];
    }

    public void storeBits(boolean[] toStore){
	for(int i = 0 ; i < storage.length ; i++){
	    storage[i] = toStore[i];
	}
    }

    public boolean[] readBits(){
	return storage;
    }

    public int getSize(){
	return SIZE;
    }

}