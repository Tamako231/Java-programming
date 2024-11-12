public class Stock {
    // 数据字段
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // 构造方法，创建一个具有指定符号和名称的股票
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // 获取股票的符号
    public String getSymbol() {
        return symbol;
    }

    // 设置股票的符号
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // 获取股票的名称
    public String getName() {
        return name;
    }

    // 设置股票的名称
    public void setName(String name) {
        this.name = name;
    }

    // 获取前一日的收盘价
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    // 设置前一日的收盘价
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // 获取当前价格
    public double getCurrentPrice() {
        return currentPrice;
    }

    // 设置当前价格
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // 计算并返回从 previousClosingPrice 到 currentPrice 的百分比变化
    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            throw new ArithmeticException("Previous closing price cannot be zero");
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}