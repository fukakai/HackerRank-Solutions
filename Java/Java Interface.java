/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sumDiv  = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { // if i is a divisor
                sumDiv += i + n/i; // add it
            }
        }
        //If sqrt is a divisor, we should only count it once
        if (sqrt * sqrt == n) {
            sumDiv -= sqrt;
        }
        return sumDiv;
    }
}