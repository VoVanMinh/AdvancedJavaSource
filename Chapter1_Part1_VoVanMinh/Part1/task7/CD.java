package task7;
/* CD class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
public class CD {

	String id;
	String name;
	String singer;
	int numOfSong;
	float price;
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(float price)
	{
		this.price = price;
	}
	public CD(String id, String name, String singer, int numOfSong, float price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSong = numOfSong;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getNumOfSong() {
		return numOfSong;
	}
	public void setNumOfSong(int numOfSong) {
		this.numOfSong = numOfSong;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return id +"\t" +name +"\t" +singer +"\t" +numOfSong +"\t\t" +price;
	}
	
	
	
	
}
