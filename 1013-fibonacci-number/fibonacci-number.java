class Solution {
    public static int fib(int n) {
        if (n==1 || n==0) {
            return n;
        }
        int fib = fib(n-2) + fib(n-1);

        return fib;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}