public class Register32{

    private int storage;
    private final int SIZE = 32;

    public Register32(){
    }

    public void store(int toStore){
	storage = toStore;
    }

    public int readBits(){
	return storage;
    }

    public int getSize(){
	return SIZE;
    }

}