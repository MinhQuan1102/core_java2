package SE1.Week8.server;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class StockServer {
    private ArrayList<User> users;
    private ArrayList<Stock> stocks;
    private ArrayList<StockInformation> userStocks;
    private ArrayList<StockInformation> userHistory;
    private double userMoney;
    private boolean isLoggedIn;
    private User loggedUser;
    private LocalTime currentDate;

    public StockServer(ArrayList<User> users, ArrayList<Stock> stocks, ArrayList<StockInformation> userStocks, ArrayList<StockInformation> userHistory, double userMoney, boolean isLoggedIn, LocalTime currentDate) {
        this.users = users;
        this.stocks = stocks;
        this.userStocks = userStocks;
        this.userHistory = userHistory;
        this.userMoney = userMoney;
        this.isLoggedIn = isLoggedIn;
        this.currentDate = currentDate;
    }

    public StockServer(ArrayList<User> users, ArrayList<Stock> stocks) {
        this.users = users;
        this.stocks = stocks;
    }

    public boolean login (String username, String password) {
        try {
            User loginUser = registeredAccount(username);
            assert loginUser != null;
            boolean isCorrectPassword = loginUser.getPassword().equals(password);
            if (!isCorrectPassword) {
                System.out.println("Invalid username or password!");
            } else {
                isLoggedIn = true;
                loggedUser = loginUser;
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid username or password!");
        }
        return isLoggedIn;
    }

    private User registeredAccount(String username) {
        for (User user: users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public String listAllStocks() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stocks.size(); i++) {
            Stock stock = stocks.get(i);
            result.append("Stock no.").append(i + 1).append(": ").append(stock.getName()).append(", price: ").append(stock.getPrice()).append(", quantity: ").append(stock.getQuantity()).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        User minhquan = new User("dominhquan", "mquan1102");
        Stock stock1 = new Stock("Splendor", 300000, 5);
        Stock stock2 = new Stock("Dead of winter", 1100000, 6);
        Stock stock3 = new Stock("Gloomhaven", 1600000, 3);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Stock> stocks = new ArrayList<>();
        users.add(minhquan);
        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
        StockServer server = new StockServer(users, stocks);

        System.out.println( server.login("dominhquan", "mquan1102"));
        System.out.println(server.listAllStocks());
    }
}
