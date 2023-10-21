package projectA;

public class Condition {

	public static void main(String[] args) {
	
	Solution obj = new Solution();
	obj.weatherIs(55);
		
	}

}
class Solution {
	void weatherIs(int temprature) {
	if(temprature>25) {
System.out.println("Sunny day.");
	
	}
	else if (temprature==25)	{
		System.out.println("Normal temprature");
	}
	else
	{
		System.out.println("Cool");
	}
	}
}

	

	
	

