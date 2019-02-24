class Arrays{
    public static void main(String[] args) {
        int nums[] = {3,5,6,9,10};
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }

        System.out.println(sum);
    }
}