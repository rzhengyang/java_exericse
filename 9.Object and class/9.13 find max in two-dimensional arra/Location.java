package simple;
public class Location{
	private static int row;
	private static int column;
	private static double maxValue;
	public Location(){
		
	}
	public Location(int maxRow,int maxColumn,double maxValue){
		Location.row = maxRow;
		Location.column = maxColumn;
		Location.maxValue = maxValue;
	}
	//get set
	public static int getrow(){
		return row;
	} 
	public static int getcolumn(){
		return column;
	}
	public static double getmaxValue(){
		return maxValue;
	}
	public static void setrow(int row){
		 Location.row = row;
	}
	public static void setcolumn(int column){
		 Location.column = column;
	}
	public static void setmaxValue(double maxValue){
		Location.maxValue = maxValue;
	}
	//get set end
	
	public static Location locateLargets(double[][] a)
	{
		int maxRow = 0;
		int maxColumn = 0;
		maxValue = a[0][0];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]>a[maxRow][maxColumn]){
					maxRow = i;
					maxColumn = j;
					maxValue = a[i][j];
				}
			}
		return new Location(maxRow,maxColumn,maxValue);
	}

	
	
}