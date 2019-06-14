class FruitSalesMain3
{
	public static void main(String[] args)
	{
		FruitSeller seller1=new FruitSeller(0, 30, 1500);
		FruitSeller seller2=new FruitSeller(0, 20, 1000);
		
		FruitBuyer buyer=new FruitBuyer(10000);
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("Fruit Seller 1 Status");
		seller1.showSaleResult();
		System.out.println();
		
		System.out.println("Fruit Seller 2 Status");
		seller2.showSaleResult();
		System.out.println();
		
		System.out.println("Buyer Status");
		buyer.showBuyResult();
		System.out.println();
	}
}

class FruitSeller
{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller(int money, int appleNum, int price)
	{
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	
	public void showSaleResult()
	{
		System.out.println("Stock Apple : " + numOfApple);
		System.out.println("Earn Money : " + myMoney);
	}
}

class FruitBuyer
{
	int myMoney;
	int numOfApple;
	
	public FruitBuyer(int money)
	{
		myMoney=money;
		numOfApple=0;
	}
	
	public void buyApple(FruitSeller seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuyResult()
	{
		System.out.println("Money : " + myMoney);
		System.out.println("Purchase Apple : " + numOfApple);
	}
}