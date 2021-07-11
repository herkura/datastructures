//Given a string which is denoted as a roman numeral. we have to find the value integer of the 
//the roman numeral string
/* Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000*/
// we are given thsi table for performing calculations
//eg1 : s="IV"
//output = 4
//eg 2 : s = "VI"
//output = 6
//we use a hashmap to map the values in the above table
//then we iterate through the string and compare the characters of the string
//if the i+1th char > ith char then we subtract 
//else we add the value
class Solution
{
  public int romanTointeger(String s)
  {
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000); 
    
    int res = 0;
    for(int i=0;i<s.length()-1;i++){
      if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))
      {
        res+=map.get(s.charAt(i));
      }
      else
      {
        res-=map.get(s.charAt(i));
      }
    }
    res+=map.get(s.charAt(s.length()-1));
    return res;
    
  }
}
//Time : O(n)
