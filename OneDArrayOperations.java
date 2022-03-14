package programs;
//11

public class OneDArrayOperations {

	public static void main(String[] args) {
		int ar[]= {0,0,0,0,0,0,0,0,0,0};
		int bonus[];
		bonus=new int[20];
		for(int i=0;i<20;i++) {
			bonus[i]=bonus[i]+1;
		}
		int bestScores[]= {15,20,25,30,35};
		for(int i=0;i<5;i++) {
			System.out.print(bestScores[i]+"\t");
		}
	}

}
