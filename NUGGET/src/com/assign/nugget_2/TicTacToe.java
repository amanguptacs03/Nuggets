package com.assign.nugget_2;

public class TicTacToe {
public static String winner(char[][] ch){
	
	int s=0,j=0;
	for(int i=0;i<3;i++){
			if((""+ch[i][j]).equals((""+ch[i][j+1]))){
				if((""+ch[i][j+1]).equals((""+ch[i][j+2]))){
					return "WINNER : " +ch[i][j];
				}
				
			}
			else if((""+ch[j][i]).equals((""+ch[j+1][i])))
			{
				if((""+ch[j+1][i]).equals((""+ch[j+2][i]))){
					return "WINNER : " +ch[j][i];
				}
							}
	}
	
	int k=0;
	
	
	 if((""+ch[k][k]).equals((""+ch[k+1][k+1])))
	{
		if((""+ch[k+1][k+1]).equals((""+ch[k+2][k+2]))){
			return "WINNER : " +ch[k][k];
		}
					}
	 
	
	 else if((""+ch[k][ch.length-1]).equals((""+ch[k+1][ch.length-2]))){
			if((""+ch[k+1][ch.length-2]).equals((""+ch[k+2][ch.length-3]))){
				return "WINNER :"+ ch[k][ch.length-1];
			}
		}
	
	
	return "MATCH DRAW";
}
}
