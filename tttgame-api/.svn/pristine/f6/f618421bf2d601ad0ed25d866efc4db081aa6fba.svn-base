package edu.neumont.csc380.models;

import java.io.InputStream;
import java.util.Scanner;

public class ProbablyPrimeService {
	long[] primes;
	public ProbablyPrimeService()
	{
		primes = readPrimesFromList();
	}
	public long factorization(long number)
    {
        long factorOne = factor(number);
        if(factorOne!=1)
        {
            
        }
        else
        {
            addNum(number);
        }
        return factorOne;
    }
    private long factor(long number)
    {
        long factor = 1;
        for(int i = primes.length-1; i >= 0 && factor==1; i--)
        {
            if(number%primes[i]==0)
            {
                factor = primes[i];
            }
        }
        return factor;
    }
    private void addNum(long number)
    {
        long[] temp = primes.clone();
        primes = new long[temp.length+1];
        for(int i = 0; i < temp.length; i++)
        {
            primes[i] = temp[i];
        }
        primes[temp.length] = number;
    }
    private long[] readPrimesFromList()
    {
    	final int LIST_SIZE = 78497;
    	long[] myPrimes = new long[LIST_SIZE];
    	InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("primes.txt");
    	int counter = 0;
    	try {
			Scanner inputScanner = new Scanner(in);
			inputScanner.useDelimiter(", ");
			while(inputScanner.hasNext()){
				long next = Long.parseLong(inputScanner.next());
				myPrimes[counter] = next;
				counter++;
			}
			inputScanner.close();
		}  catch(NumberFormatException e) {
			System.out.println("Parse broke");
		}
    	return myPrimes;
    }
}
