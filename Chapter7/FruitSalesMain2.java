class FruitSalesMain2
{
	public static void main(String[] args)
	{
		FruitSeller seller1=new FruitSeller();
		seller1.initMembers(0, 30, 1500);
		
		FruitSeller seller2=new FruitSeller();
		seller2.initMembers(0, 20, 1000);
		
		FruitBuyer buyer=new FruitBuyer();
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("Fruit Seller1");
		seller1.showSaleResult();
		
		System.out.println("Fruit Seller2");
		seller2.showSaleResult();
		
		System.out.println("Fruit Buyer");
		buyer.showBuyResult();
	}
}

class FruitSeller
{
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	
	public void showSaleResult()
	{
		System.out.println("Total Apple : " + numOfApple);
		System.out.println("Earn Money : " + myMoney);
	}
	
	public void initMembers(int money, int appleNum, int price)
	{
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
}

class FruitBuyer
{
	int myMoney=10000;
	int numOfApple=0;
	
	public void buyApple(FruitSeller seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuyResult()
	{
		System.out.println("Have Money : " + myMoney);
		System.out.println("Buy Apple : " + numOfApple);
	}
}