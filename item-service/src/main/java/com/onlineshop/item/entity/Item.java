package com.onlineshop.item.entity;

public class Item {

    private Long id;
    private String itemId;
    private String description;
    private double price;
    
	public Item(Long id, String itemId, String description, double price) {
		this.setId(id);
		this.setItemId(itemId);
		this.setDescription(description);
		this.setPrice(price);
	}
    


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String _itemId) {
		this.itemId = _itemId;
	}
    
}