import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeSieveModelTest {
    @Test
    public void testSomething() {
        PrimeSieveModel primeSieve = new PrimeSieveModel(100);
        primeSieve.filterPrimes();

        ArrayList<Integer> primes = primeSieve.getPrimes();

        assertEquals("Tot aan 100 zouden er 25 priemgetallen moeten zijn.", 25, primes.size());
        assertTrue("2 is een priemgetal maar staat niet in de lijst", primes.contains(2));
        assertTrue("3 is een priemgetal maar staat niet in de lijst", primes.contains(3));
        assertTrue("5 is een priemgetal maar staat niet in de lijst", primes.contains(5));
        assertTrue("7 is een priemgetal maar staat niet in de lijst", primes.contains(7));
        assertTrue("11 is een priemgetal maar staat niet in de lijst", primes.contains(11));
        assertTrue("13 is een priemgetal maar staat niet in de lijst", primes.contains(13));
        assertTrue("17 is een priemgetal maar staat niet in de lijst", primes.contains(17));
        assertTrue("19 is een priemgetal maar staat niet in de lijst", primes.contains(19));
        assertTrue("23 is een priemgetal maar staat niet in de lijst", primes.contains(23));
        assertTrue("29 is een priemgetal maar staat niet in de lijst", primes.contains(29));
        assertTrue("31 is een priemgetal maar staat niet in de lijst", primes.contains(31));
        assertTrue("37 is een priemgetal maar staat niet in de lijst", primes.contains(37));
        assertTrue("41 is een priemgetal maar staat niet in de lijst", primes.contains(41));
        assertTrue("43 is een priemgetal maar staat niet in de lijst", primes.contains(43));
        assertTrue("47 is een priemgetal maar staat niet in de lijst", primes.contains(47));
        assertTrue("53 is een priemgetal maar staat niet in de lijst", primes.contains(53));
        assertTrue("59 is een priemgetal maar staat niet in de lijst", primes.contains(59));
        assertTrue("61 is een priemgetal maar staat niet in de lijst", primes.contains(61));
        assertTrue("67 is een priemgetal maar staat niet in de lijst", primes.contains(67));
        assertTrue("71 is een priemgetal maar staat niet in de lijst", primes.contains(71));
        assertTrue("73 is een priemgetal maar staat niet in de lijst", primes.contains(73));
        assertTrue("79 is een priemgetal maar staat niet in de lijst", primes.contains(79));
        assertTrue("83 is een priemgetal maar staat niet in de lijst", primes.contains(83));
        assertTrue("89 is een priemgetal maar staat niet in de lijst", primes.contains(89));
        assertTrue("97 is een priemgetal maar staat niet in de lijst", primes.contains(97));

    }
}