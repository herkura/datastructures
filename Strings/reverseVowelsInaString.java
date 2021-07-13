//Given a string s we have to reverse only the vowels
//eg1 : "herkura"
//output : "harkure"
//eg2 : "hello"
//output:  "holle"
//using 2 pointers
class Solution
{
  public String reverseVowels(String s)
  {
    if(s==null || s.length()==0)
    {
      return s;
    }
    //storing the vowels in a hashset
    HashSet<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');
    int start = 0;
    int end = s.length()-1;
    char[] chars = s.toCharArray();
    while(start<end)
    {
      //checking for vowels at the starting index
      while(start<end && !vowels.contains(chars[start]))
      {
        start++;
      }
      //checking for vowels at the end
       while(start<end && !vowels.contains(chars[end]))
      {
        end--;
      }
      //if we find the vowel
      char temp = char[start];
      char[start] = char[end];
      char[end] = temp;
      start++;
      end--;
    }
    return new String(chars);
  }
}
