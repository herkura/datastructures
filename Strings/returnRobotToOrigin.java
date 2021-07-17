//There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

/*The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down).
If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false. */
//eg1 : moves = "UD"
//output : true
//The main idea is to bring the value to zero so..
//If the robot goes up then it has to go y-- in order to reach 0
//else if the robot goes down then it has to move y++ in orde to reach 0
//else if the robot goes right then it has to move x-- 
//else if the robot moves left then it has to move x++
class Solution
{
   public boolean judgeCircle(String moves)
   {
     int x = 0;
     int y = 0;
     for(char c : moves.toCharArray())
     {
       if(c == 'U')
       {
         y--;
       }
       else if(c == 'D')
       {
         y++;
       }
       else if(c == 'R')
       {
         x--;
       }
       else if(c == 'L')
       {
         x++;
       }
     }
     return x==0 && y==0;
   }
}
//Time  : O(N)
