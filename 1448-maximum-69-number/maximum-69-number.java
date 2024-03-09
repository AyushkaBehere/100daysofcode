class Solution {
    public static int maximum69Number (int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if( arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(maximum69Number(a));
    }
}