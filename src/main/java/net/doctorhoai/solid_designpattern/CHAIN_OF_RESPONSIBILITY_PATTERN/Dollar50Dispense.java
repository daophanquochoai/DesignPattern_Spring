package net.doctorhoai.solid_designpattern.CHAIN_OF_RESPONSIBILITY_PATTERN;

public class Dollar50Dispense implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if( currency.getAmount() >= 50 ){
            int num = currency.getAmount() / 50;
            int reminder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num  + " 50$ note");
            if( reminder != 0 ) this.chain.dispense(new Currency(reminder));
        }else {
            this.chain.dispense(currency);
        }
    }
}
