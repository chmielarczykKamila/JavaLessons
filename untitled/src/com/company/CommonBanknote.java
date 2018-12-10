package com.company;

public class CommonBanknote implements Banknote {

    private Banknote nextbanknote;
    private final int value;

    public CommonBanknote(int value){
        this.value = value;
    }
    @Override
    public void next(Banknote banknote) {
        this.nextbanknote = banknote;
    }

    @Override
    public void withdraw(int amount) {

        if (amount<value)
        {  nextbanknote.withdraw(amount);
        }
        else {

            int num = amount/value;
            int rem = amount%value;
            System.out.println(String.format("%s * %s",num, value));
            if (rem!=0)
            {
                nextbanknote.withdraw(rem);
            }
        }
    }
}