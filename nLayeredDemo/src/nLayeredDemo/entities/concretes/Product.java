package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product  implements Entity{
	    private int id;
	    private int categoryId;
		private String name;
	    private double unitsPrice;
	    private int unitsInStock;

	    public Product() {
			super();
		}

		public Product(int id, int categoryId, String name, double unitsPrice, int unitsInStock) {
			super();
			this.id = id;
			this.categoryId = categoryId;
			this.name = name;
			this.unitsPrice = unitsPrice;
			this.unitsInStock = unitsInStock;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getUnitsPrice() {
			return unitsPrice;
		}

		public void setUnitsPrice(double unitsPrice) {
			this.unitsPrice = unitsPrice;
		}

		public int getUnitsInStock() {
			return unitsInStock;
		}

		public void setUnitsInStock(int unitsInStock) {
			this.unitsInStock = unitsInStock;
		}
}
