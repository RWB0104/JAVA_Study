package orange.buyer;

import orange.seller.FruitSeller;

public class FruitBuyer
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
		System.out.println("Have Money : " + myMoney);
		System.out.println("Stock Apple : " + numOfApple);
	}
}