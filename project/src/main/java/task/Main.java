package task;

public class Main{
   public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        for(int i = 0, j = 0, t = 0; i<game.length; ){

            System.out.println("i="+i+", game["+i+"]="+game[i]);

            //if(game[i]==0 && (i == game.length-1)) return true; 

            if(game[i]==0 && (i+leap >= game.length)) return true;

            if(game[i]==0 && i+leap<game.length && game[i+leap]==0){
                j = i+leap;
                System.out.println("1. j="+j);
                while(j>(i+1) && game[j-1]==0){ 
                    j--;
                    System.out.println(j); 
                }
                System.out.println("2. j="+j);
                if(leap>0 && j==i){
                    i = i+leap;
                }else{
                    i=j;
                }
                System.out.println("3. j="+j+", i="+i);
                continue;
            }

            //if(game[i]==0 && i+1<game.length && game[i+1]>0)
            //    return false;

            if(game[i]>0)
               t++;
            else t=0;

            if(leap > 0){
                if(t >= leap) return false;
            }else{
                if(t>0) return false;
            }

            i++;

            //if(j==1 && (i-1+leap)<game.length && game[i-1+leap]>0)
            //   return false;

            //if(i==game.length-1 && game[i]==0)
            //    return true;
        }

        return true;
    }

   public static void main(String[] args){
                  //0  1  2  3  4  5  6  7  8  9
     int [] game = {0, 1, 1, 0, 0, 0, 1, 1, 1, 0};//{0, 1, 0};// {0, 0, 1, 1, 1, 0};//{0, 0, 0, 1, 1, 1};//{0, 0, 0, 0, 0};//{0, 1, 1, 0, 0, 0, 1, 1, 1, 0};
     int leap = 4; //1;// 3; //5; //3; //4;
     System.out.println("Res="+canWin(leap, game));
   }
}