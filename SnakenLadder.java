	import java.util.Scanner;

		 public class SnakenLadder{

           public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Input 2 player names");
		    String playerA=sc.next();
		    String playerB=sc.next();
		    int playerAPosition=0,playerBPosition=0;
		    int count=0;
		    int x=0;
		    while((playerAPosition)<30&&playerBPosition<30)
		    {
		    	x=1+((int)(Math.random()*6));
		        playerAPosition=playerAPosition + x;
				if(playerAPosition>30)
				{
				    playerAPosition=playerAPosition-x;}
				 
			
			    System.out.println(playerA+" "+"throws"+" "+x);                
		        System.out.println(playerA+ " "+"goes cell"+" "+playerAPosition);
		        count=count+1;
			    if(playerAPosition==27)
			    {
			    playerAPosition=1;
			    System.out.println("The player reaches to mouth of snake");
			    System.out.println(playerB+ "  "+"goes down"+" "+playerAPosition);
			    System.out.println();
			    }
			    else if(playerAPosition==21)
			    {
			    playerAPosition=9;
			    System.out.println("The player reaches to mouth of snake ");
			    System.out.println(playerB+ "  "+"goes down"+" "+playerAPosition);
		        System.out.println();
			    }
			    else if(playerAPosition==17)
			    {
		        playerAPosition=4;
		        System.out.println("The player reaches to mouth of snake ");
		        System.out.println(playerB+ "  "+"goes down"+" "+playerAPosition);
		        System.out.println();
			    }
			    else if(playerAPosition==19)
			    {
			   playerAPosition=7;
		       System.out.println("The player reaches to mouth of snake ");
		       System.out.println(playerB+ "  "+"goes down"+" "+playerAPosition);
			   System.out.println();
			   }
			   else if (playerAPosition==3)
			   {
			   playerAPosition=22;
			   System.out.println("The player goes to"+" "+playerAPosition);
			   System.out.println();
			   }
			   else if(playerAPosition==5)
			   {
			   playerAPosition=8;
			   System.out.println("The player goes to"+"  "+playerAPosition);
		       System.out.println();
			   }
			  else if(playerAPosition==11)
			  {
			  playerAPosition=26;
			  System.out.println("The player goes to"+"  "+playerAPosition);
		      System.out.println();
			  }
			  else if(playerAPosition==20)
			  {
			  playerAPosition=29;
			  System.out.println("The player goes to"+" "+playerAPosition);
		      System.out.println();
			  }
		    
		    
				x=1+((int)(Math.random()*6));
		    	playerBPosition=playerBPosition+x;
		    	if(playerBPosition>30) {
		    		
		    	playerBPosition=playerBPosition-x;
		  	}
			
		    System.out.println(playerB+ " "+"throws"+x);
		   
		    System.out.println(playerB+" "+"goes cell"+" "+playerBPosition);
		    System.out.println();
			count=count+1;
			if(playerBPosition==27)
			{
				if(playerBPosition>30)
				{
					playerBPosition=playerBPosition-x;
				}
				playerBPosition=1;
				System.out.println("The player reaches to mouth of snake ");
				System.out.println(playerB+ "  "+"goes down"+" "+playerBPosition);
				System.out.println();
			
			}
			else if(playerBPosition==21)
			{
				playerBPosition=9;
				System.out.println("The player reaches to mouth of snake ");
				System.out.println(playerB+ "  "+"goes down"+" "+playerBPosition);
				System.out.println();
			}
			else if(playerBPosition==17)
			{
				playerBPosition=4;
				System.out.println("The player reaches to mouth of snake ");
				System.out.println(playerB+ "  "+"goes down"+" "+playerBPosition);
				System.out.println();
			}
			else if(playerBPosition==19)
			{
				playerBPosition=7;
				System.out.println("The player reaches to mouth of snake ");
				System.out.println(playerB+ "  "+"goes down"+" "+playerBPosition);
				System.out.println();
			}
			else if (playerBPosition==3)
			{
				playerBPosition=22;
				System.out.println("The player goes to"+"  "+playerBPosition);
				System.out.println();
			}
			else if(playerBPosition==5)
			{
				playerBPosition=8;
				System.out.println("The player goes to"+" "+playerBPosition);
				System.out.println();
			}
			else if(playerBPosition==11)
			{
				playerBPosition=26;
				System.out.println("The player goes to"+" "+playerBPosition);
				System.out.println();
			}
			else if(playerBPosition==20)
				{
				playerBPosition=29;
				System.out.println("The player goes to"+" "+playerBPosition);
				System.out.println();
			
		    }		
		    }
		    
		     System.out.println("Total number of dice throws made by each player is "+count);
		    if(playerAPosition==30 && playerBPosition==30) 
		    {
		    System.out.println("Its a tie...");
		    }
		    else
		    {
		    if(playerAPosition==30)
		    System.out.println(playerA+" is the winner...");
		    if(playerBPosition==30)
		    System.out.println(playerB+" is the winner...");
		    
		    sc.close();	                        }
		    }
		    }






