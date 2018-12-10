package com.company;

public interface Banknote {
    void next(Banknote banknote);
    void withdraw(int amount);
}
