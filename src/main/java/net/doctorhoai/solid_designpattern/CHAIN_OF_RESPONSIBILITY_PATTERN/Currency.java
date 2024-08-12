package net.doctorhoai.solid_designpattern.CHAIN_OF_RESPONSIBILITY_PATTERN;

public class Currency {
    private int amount;
    public Currency( int amt ){
        this.amount = amt;
    }

    public int getAmount(){
        return this.amount;
    }
}
