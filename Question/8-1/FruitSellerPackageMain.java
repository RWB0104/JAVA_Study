import orange.seller.FruitSeller;
import orange.buyer.FruitBuyer;

class FruitSalesPackageMain
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