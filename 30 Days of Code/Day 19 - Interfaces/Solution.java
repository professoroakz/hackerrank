class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisors = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                divisors += i;
        return divisors;
    }
}
