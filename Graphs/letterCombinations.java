//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
// we have to map every digit to a letter just like a cellphone
//eg : digits = "23"
//output = ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//in a cellphone 2 maps to abc , 3 maps to def and so on
//so in this question we have to create a tree for the above strings
/*           2 -> "abc"
			       3 -> "def"
                    "abc"
             /        |      \
           a          b       c
			    /           |         \
		    d e f      d e f     d e f
		   /  |  \    /  |  \   /  |  \ 
		  ad ae  af   bd be bf  cd ce  cf
 */
//so following the above tree  we will create seperate combination for every character of the digits string
//once we have made the max commbinations for a in abc we will backtrack and begin with b 
//once we have backtracked we will be deleting the already created combination
//for this we have to perform a dfs ,however bfs can also be used for iterating
//Time comlexity : O(3^n x  4^n)
class Solution
{
  public List<String> letterCombinations(String digits)
  {
    if(digits.length() ==0 || digits == null)
    {
      return new ArrayList<String>();
    }
    HashMap<Integer,String> map = new HashMap<>();
    map.put(2,"abc");
    map.put(3,"def");
    map.put(4,"ghi");
    map.put(5,"jkl");
    map.put(6,"mno");
    map.put(7,"pqrs");
    map.put(8,"tuv");
    map.put(9,"wxyz");
    List<String> result = new ArrayList<>();
    dfs(digits,map,new StringBuilder(),result);
    return result;
  }
  public void dfs(String digits, HashMap<Integer,String> map,StringBuilder sb, List<String> digits)
  {
    if(sb.length() == digits.length())
    {
      result.add(sb.toString());
    } 
    int currChar = digits.charAt(sb.length());
    String curr = map.get(currChar);
    
    for(char c:curr.toCharArray())
    {
      sb.append(c);
      dfs(digits,map,sb,result);
      sb.deleteCharAt(sb.length()-1);
    }
    
  }
}
