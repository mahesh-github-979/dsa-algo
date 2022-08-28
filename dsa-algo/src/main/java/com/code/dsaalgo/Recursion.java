package com.code.dsaalgo;

public class Recursion {
    public Recursion() {
    }

    public long fibonocci(long n){
        if(n<2)
            return n;

        return fibonocci(n-2) + fibonocci(n-1);

    }

    public long fiboIterative(int n){
        long a = 0, b = 1, c;
        for(int i=2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
