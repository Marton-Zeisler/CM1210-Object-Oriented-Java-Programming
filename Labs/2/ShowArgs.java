class ShowArgs{
    public static void main(String[] args) {
        System.err.println(args.length);
        for (String each : args) {
            System.err.println(each);
        }
    }
}