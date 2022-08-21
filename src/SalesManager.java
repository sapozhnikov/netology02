import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int truncMean()
    {
        if (sales.length < 3) {
            throw new RuntimeException("Слишком малая статистика");
        }

        int[] truncSales = sales.clone();
        Arrays.sort(truncSales);
        int mean = 0;
        for (int i = 1; i < truncSales.length - 1; i++){
            mean += truncSales[i];
        }
        mean /= truncSales.length - 2;

        return mean;
    }
}