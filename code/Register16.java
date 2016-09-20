public class Register16{

    private short storage;
    private final int SIZE = 16;

    public Register16(){
    }

    public void store(short toStore){
	storage = toStore;
    }

    public short readBits(){
	return storage;
    }

    public int getSize(){
	return SIZE;
    }

}