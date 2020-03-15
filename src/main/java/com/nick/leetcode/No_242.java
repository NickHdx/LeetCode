package com.nick.leetcode;

// https://leetcode.com/problems/valid-anagram/

public class No_242 {
    public static void main(String[] args) {
        No_242 obj = new No_242();
        System.out.println(obj.isAnagram("anagram", "anagram"));
        System.out.println(obj.isAnagram("rat", "cat"));
        System.out.println(obj.isAnagram("", "cat"));
    }

//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        List<Character> sArr = new ArrayList<>();
//        List<Character> tArr = new ArrayList<>();
//        for (char c : s.toCharArray()) {
//            sArr.add(c);
//        }
//        for (char c : t.toCharArray()) {
//            tArr.add(c);
//        }
//
//        sArr.sort(Comparator.naturalOrder());
//        tArr.sort(Comparator.naturalOrder());
//        for (int i = 0; i < sArr.size(); i++) {
//            if (!sArr.get(i).equals(tArr.get(i))) {
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int len = 26;
        int[] sCounts = new int[len];
        int[] tCounts = new int[len];

        for (char c : s.toCharArray()) {
            sCounts[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            tCounts[c - 'a']++;
        }
//        System.out.println(Arrays.toString(sCounts));
//        System.out.println(Arrays.toString(tCounts));
        for (int i = 0; i < len; i++) {
            if (sCounts[i] != tCounts[i]) {
                return false;
            }
        }
        return true;
    }
}
