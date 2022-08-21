public class GitDemo {
    public static void main(String[] args) {
        long[] sales = {1, 1, 2, 7, 4, 2};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Max sales is " + salesManager.max());
    }
}
