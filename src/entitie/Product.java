package entitie;

public class Product {
	private String nameProduct;
	private double priceProduct;

	public Product(String nameProduct, double priceProduct) {
		super();
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	@Override
	public String toString() {
		return
	"Descri��o: " 
	+ nameProduct 
	+ " R$: " 
	+ priceProduct 
	;
		
	}
	
	

}
