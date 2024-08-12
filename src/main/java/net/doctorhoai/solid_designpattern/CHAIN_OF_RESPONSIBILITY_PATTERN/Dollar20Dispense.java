package net.doctorhoai.solid_designpattern.CHAIN_OF_RESPONSIBILITY_PATTERN;

public class Dollar20Dispense implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.chain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if( currency.getAmount() >= 20 ){
            int num = currency.getAmount() / 20;
            int reminder = currency.getAmount() % 20;
            System.out.println("Disposing " + num + " $20 note");
            if( reminder != 0 ){
                this.chain.dispense(new Currency(reminder));
            }
        }else {
            this.chain.dispense(currency);
        }
    }
}
