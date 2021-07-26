package ch9exercises.Ch9_02_Stock;

public class Ch9_02_Stock_Driver
{

    public static void main(String[] args)
    {
        Stock stockObject = new Stock("ORCL", "Oracle Corporation");
        stockObject.setPreviousClosingPrice(34.5);
        stockObject.setCurrentPrice(34.35);

        System.out.printf("The price-change is %.4f%%", stockObject.getChangePercent());


    }

}
