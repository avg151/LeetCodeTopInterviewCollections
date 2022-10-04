package strings

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 */

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length == t.length) {
            return s.groupBy { it } == t.groupBy { it }
        }
        return false
    }

}