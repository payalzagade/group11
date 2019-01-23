package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Donor_Request1")

public class Donor_Request {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int requestId=0;
	
	private int categoryId;
	private int cookTime;
	private int foodQuantity;
	private int bookQuantity;
	private int clothQuantity;
	private String foodDescription;
	private String bookDescription;
	private String clothDescription;
	private String location;
	
	public Donor_Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	




	public Donor_Request(int requestId, int categoryId, int cookTime, int foodQuantity, int bookQuantity,
			int clothQuantity, String foodDescription, String bookDescription, String clothDescription, String location) {
		super();
		this.requestId = requestId;
		this.categoryId = categoryId;
		this.cookTime = cookTime;
		this.foodQuantity = foodQuantity;
		this.bookQuantity = bookQuantity;
		this.clothQuantity = clothQuantity;
		this.foodDescription = foodDescription;
		this.bookDescription = bookDescription;
		this.clothDescription = clothDescription;
		this.location = location;
		
	}






	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public int getClothQuantity() {
		return clothQuantity;
	}

	public void setClothQuantity(int clothQuantity) {
		this.clothQuantity = clothQuantity;
	}

	public String getFoodDescription() {
		return foodDescription;
	}

	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getClothDescription() {
		return clothDescription;
	}

	public void setClothDescription(String clothDescription) {
		this.clothDescription = clothDescription;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}





	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	

	
	

}
