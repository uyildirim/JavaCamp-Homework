package kodlamaio.nordwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {
		@Id
		@GeneratedValue
		@Column(name="ProductID")
		private int id;
		
		@Column(name="CategoryID")
		private int categoryId;
		
		@Column(name="ProductName")
		private String productName;
		
		@Column(name="UnitPrice")
		private double unitPrice;
		
		@Column(name="UnitsInStock")
		private short unitsInStock;
		
		@Column(name="QuantityPerUnit")
		private String quantityPerUnit;
		
		
		
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
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public short getUnitsInStock() {
			return unitsInStock;
		}
		public void setUnitsInStock(short unitsInStock) {
			this.unitsInStock = unitsInStock;
		}
		public String getQuantityPerUnit() {
			return quantityPerUnit;
		}
		public void setQuantityPerUnit(String quantityPerUnit) {
			this.quantityPerUnit = quantityPerUnit;
		}
}
