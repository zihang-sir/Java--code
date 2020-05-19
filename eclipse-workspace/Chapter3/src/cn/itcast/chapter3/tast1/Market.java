package cn.itcast.chapter3.tast1;

public class Market {
	private String marketName;
	private Product[] productArr;
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName=marketName;
	}
	public Product[] getProductArr(){
		return productArr;
	}
	public void setProductArr(Product[]productArr) {
		this.productArr=productArr;
	}
	Product sell(String name) {
		for(int i=0;i<productArr.length;i++) {
			if(productArr[i].getProName()==name) {
				return productArr[i];
			}
		}
		return null;
	}

}
