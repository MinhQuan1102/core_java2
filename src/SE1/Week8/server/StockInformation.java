package SE1.Week8.server;

import java.time.LocalTime;

public class StockInformation {
    private int commandType;
    private Stock stock;
    private LocalTime purchaseDate;

    public StockInformation(int commandType, Stock stock, LocalTime purchaseDate) {
        this.commandType = commandType;
        this.stock = stock;
        this.purchaseDate = purchaseDate;
    }

    public int getCommandType() {
        return commandType;
    }

    public void setCommandType(int commandType) {
        this.commandType = commandType;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public LocalTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
