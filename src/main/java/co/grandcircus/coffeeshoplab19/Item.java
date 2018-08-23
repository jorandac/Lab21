package co.grandcircus.coffeeshoplab19;

public class Item {


		private int itemId;
		private String name;
		private String description;
		private int quantity;
		private float price;
		
		public Item() {
		};
		
		public Item(int itemId, String name, String description, int quantity, float price) {
			super();
			this.itemId = itemId;
			this.name = name;
			this.description = description;
			this.quantity = quantity;
			this.price = price;
		}

		public int getItemId() {
			return itemId;
		}

		public void setItemId(int itemId) {
			this.itemId = itemId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Item [itemId=" + itemId + ", name=" + name + ", description=" + description + ", quantity=" + quantity
					+ ", price=" + price + "]";
		}
		
	}
	
