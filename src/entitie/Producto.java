package entitie;

public class Producto {
	private String nameProduct;
	private double priceProduct;

	public Producto(String nameProduct, double priceProduct) {
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
	"Descrição: " 
	+ nameProduct 
	+ " R$: " 
	+ priceProduct 
	;
		
	}
	
	

}
