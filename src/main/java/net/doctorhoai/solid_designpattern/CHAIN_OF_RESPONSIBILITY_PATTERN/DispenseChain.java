package net.doctorhoai.solid_designpattern.CHAIN_OF_RESPONSIBILITY_PATTERN;

public interface DispenseChain {
    void setNextChain( DispenseChain dispenseChain);
    void dispense( Currency currency);
}
