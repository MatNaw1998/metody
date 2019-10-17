package Metody_zajęcia;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger liczba =new BigInteger("123456667");
        BigInteger liczba2 = new BigInteger("67890123");
        BigInteger liczba3 = new BigInteger("-67890123");
        BigInteger suma = liczba.add(liczba2);
        BigInteger wartoość_bezwzględna = liczba3.abs();
        BigInteger dzielenie = liczba.divide(liczba2);
        BigInteger mnożenie = liczba2.multiply(liczba3);
        BigInteger potęga = liczba3.pow(2);
        BigInteger odejmowanie = liczba.subtract(liczba3);
        int N=1;
        for (int i=1; i<=30; i++){

            System.out.println("dla n = "+ N);
            System.out.println("silnia z wykorzystaniem float = " + silnia_float(N));
            System.out.println("silnia z wykorzystaniem klasy BigInteger = " + silnia_Big(N));
            N++;
        }
    }
    public static BigInteger silnia_Big(int n){
        BigInteger wynik = BigInteger.ONE;
        for (int i=2; i<=n; i++){
            wynik = wynik.multiply(BigInteger.valueOf(i));
        }
        return wynik;
    }
    public static float silnia_float (int n){
        float wynik2 = 1;
        for (int i = 2; i<=n; i++){
            wynik2*= i;
        }
        return wynik2;
    }
}
//!.zademonstruj podstawowe działania arytmetyczne z wykorzystaniem ibiektów klasy BigIntiger
//2. Napisz dwie metody obliczające wartość silni,  jedna z wykorzystaiem float a druga klasę BigIntiger, porównaj wyniki dla N od 1 do 30;
//3.umieść kod programu na GitHubie