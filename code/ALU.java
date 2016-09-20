public class ALU{

    private boolean carryBit;

    public ALU(){

    }

    public Register32 add(Register32 inA, Register32 inB){
	Register32 toReturn = new Register32();
	toReturn.store(inA.read() + inB.read());
	return toReturn;
    }

    public Register32 subtract(Register32 inA, Register32 inB){
	Register toReturn = new Register32();
	toReturn.store(inA.read(), inB.read());
    }

}