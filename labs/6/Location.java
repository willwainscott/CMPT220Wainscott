
public class Location {
	
	public int row;
	public int column;
	public double maxValue;
	
	public Location() {}
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public void setLocation(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public void setmaxValue(double d) {
		this.maxValue = d;
		
	}
}
