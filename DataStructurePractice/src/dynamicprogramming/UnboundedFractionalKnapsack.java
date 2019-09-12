package dynamicprogramming;

public class UnboundedFractionalKnapsack {
	
	public static float knapsackfractional(float[] weight, float[] value, int w) {
		float maxratio=Integer.MIN_VALUE;
		int minindex=0;
		for(int i=0;i<value.length;i++)
		{
			if((value[i]/weight[i])>maxratio) {
				maxratio=value[i]/weight[i];
				minindex=i;
			}
		}
		return (maxratio*w);
		
	}

	public static void main(String[] args) {
		float weight[]= {6,7,9,8};
		float value[]= {14,27,44,19};
		int W=50;
		System.out.println(knapsackfractional(weight,value,W));

	}

	

}
