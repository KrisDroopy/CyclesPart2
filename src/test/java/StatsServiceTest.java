import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    //1
    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }


    //2
    @Test
    public void shouldFindAverageAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageAmount(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }


    //3
    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxMonthSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }


    //4
    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minMontSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }


    //5
    @Test
    public void shouldFindMonthsBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.belowAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }


    //6
    @Test
    public void shouldFindMonthsAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
