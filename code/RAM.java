public class RAM{

    private int size;
    private int[] memory;

    public RAM(int sz){
	size = sz;
	memory = new int[sz];
    }

    public void store(int pos, int val){
	memory[pos] = val;
    }

    public void storeMultiple(int beginPos, int[] vals, int sz){
	for(int i = 0 ; i < vals.length && i < sz ; i++){
	    store(beginPos + i, vals[i]);
	}
    }

    public int load(int pos){
	return memory[pos];
    }

    public int[] loadMultiple(int beginPos, int sz){
	int[] toReturn = new int[sz];
	for(int i = 0 ; i < sz ; i++){
	    toReturn[i] = load(beginPos + i);
	}
	return toReturn;
    }

}