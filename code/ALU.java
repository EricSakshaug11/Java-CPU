public class ALU{

    private boolean carryBit;

    public ALU(){

    }

    public Register32 add(Register32 inA, Register32 inB){
	Register32 toReturn = new Register32();
	toReturn.store(inA.read() + inB.read());
	carryBit = toReturn.read() < inA.read() && toReturn.read() < inB.read();
	return toReturn;
    }

    public Register32 addImmediate(Register32 inA, int operand){
	Register32 toReturn = new Register32();
	toReturn.store(inA.read() + operand);
	carryBit = toReturn.read() < inA.read() && toReturn.read() < operand;
	return toReturn;
    }

    public Register32 subtract(Register32 inA, Register32 inB, boolean reverse){
	Register32 toReturn = new Register32();
	if(!reverse){
	    toReturn.store(inA.read() - inB.read());
	}else{
	    toReturn.store(inB.read() - inA.read());
	}
	return toReturn;
    }

    public Register32 subImmediate(Register32 inA, int operand, boolean reverse){
	Register32 toReturn = new Register32();
	if(!reverse){
	    toReturn.store(inA.read() - operand);
	}else{
	    toReturn.store(operand - inA.read());
	}
	return toReturn;
    }

    public Register32 andOp(Register32 inA, Register32 inB){
	Register32 toReturn = new Register32();
	toReturn.store(inA.read() & inB.read());
	return toReturn;
    }

    public Register32 orOp(Register32 inA, Register32 inB){
	Register32 toReturn = new Register32();
	toReturn.store(inA.read() | inB.read());
	return toReturn;
    }

    public Register32 xorOp(Register32 inA, Register32 inB){
	Register32 toReturn = new Register32();
	toReturn.store(inA.read() ^ inB.read());
	return toReturn;
    }

    public Register32 notOp(Register32 inA){
	Register32 toReturn = new Register32();
	toReturn.store(~inA.read());
	return toReturn;
    }

}