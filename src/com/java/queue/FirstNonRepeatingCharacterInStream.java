package com.java.queue;


import java.util.ArrayDeque;


public class FirstNonRepeatingCharacterInStream {

    public static String FirstNonRepeating(String A)
    {
        //You can code here

        int[] frequencyarray=new int[26];
        ArrayDeque<Character> q=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<A.length();i++) {
            char cur = A.charAt(i);
            q.offer(cur);
            frequencyarray[cur - 'a'] = frequencyarray[cur - 'a'] + 1;
            while (!q.isEmpty() && frequencyarray[q.peek()-'a'] > 1) {
                q.poll();
            }
            if (q.isEmpty()) {
                sb.append("#");
            } else {
                sb.append(q.peek());
            }
        }

return sb.toString();
    }
    public static void main(String[] args) {
        String s="mdwfxytmt";
        System.out.println(FirstNonRepeating(s));
    }
}
