package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger A  = new BigInteger(n);
        boolean TF= A.isProbablePrime(1000);
        if (TF){
            System.out.println("prime");
        }else System.out.println("not prime");
        bufferedReader.close();
    }
}
