public class solve_4{
    public static void solve(int n) {
        solve(n, 'a');
    }

    private static void solve(int n, char c) {
        if (n <= 0) {
            return;
        }
        System.out.print(c);
        switch (c) {
            case 'a':
                solve(n - 1, 'b');
                break;
            case 'b':
                solve(n - 1, 'a');
                break;
            case 'c':
                solve(n - 1, 'd');
                break;
            case 'd':
                solve(n - 1, 'e');
                break;
            case 'e':
                solve(n - 1, 'f');
                break;
            case 'f':
                solve(n - 1, 'a');
                break;
        }
    }

    public static void main(String[] args) {
        solve(5);
        System.out.println();
        solve(15);
    }
}
