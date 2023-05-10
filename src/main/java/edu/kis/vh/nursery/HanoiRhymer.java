package edu.kis.vh.nursery;

/***
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer i implementuje
 * dodatkową funkcjonalność, polegającą na zliczaniu odrzuconych elementów,
 * czyli elementów, które nie zostały dodane na stos,
 * ponieważ były większe od elementu znajdującego się na jego szczycie.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;
/**
 * Metoda zwracająca liczbę odrzuconych elementów.
 *
 * @return Liczba odrzuconych elementów.
 */
    public int reportRejected() {
        return totalRejected;
    }
/**
* Metoda dodająca nowy element na wierzch stosu lub zwiększająca
* liczbę odrzuconych elementów, jeśli nowy element jest większy od
* elementu na wierzchu stosu i stos nie jest pusty.
*
* @param in Element do dodania na stos.
*/
@Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
