//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//eg1 : s = "abcde" , goal = "cdeab"
//output : true
//for the goal to be true the length of both the strings should be equal
//and (s+s) should contain goal characters
//meaning if s = "abcde" , s+s = abcdeabcde
//now if we look clearly the goal is present in the (s+s) string
//time: O(N^2) space: O(N)
class Solution
{
  public boolean rotateStr(String s, String goal)
  {
    return s.length() == goal.length() && (s+s).contains(goal); 
  }
}
