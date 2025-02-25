// Example 1:
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r

// Example 2:
// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s

// Example 3:
// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d

// program:-

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String Final="";
        int index1=0;
        int index2=0;

        int size=0;
        if(word1.length()>word2.length())
        {
            size=word1.length();
            for(int i=0;i<size;i++)
            {
                if(i<word2.length())
                {
                    Final=Final+word1.charAt(index1);
                    Final=Final+word2.charAt(index2);
                    index1++;
                    index2++;
                }
                else
                {
                    Final=Final+word1.charAt(index1++);
                }
            }
        }
        else
        {
            size=word2.length();
            for(int i=0;i<size;i++)
            {
                if(i<word1.length())
                {
                    Final=Final+word1.charAt(index1);
                    Final=Final+word2.charAt(index2);
                    
                    index1++;
                    index2++;
                }
                else
                {
                    Final=Final+word2.charAt(index2++);
                }
            }
        }


        return Final;   
    }
}
