public class StockTest {

    public static void main(String[] args) {
        // 创建一个股票对象，符号为 ORCL，名称为 Oracle Corporation，前一日收盘价为 34.5
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);

        // 设置新的当前价格
        stock.setCurrentPrice(34.35);

        // 输出股票的信息
        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}