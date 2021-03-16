package strings

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
 *
 * Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
 */
class FirstUniqueCharacterInAString {

    fun firstUniqChar(s: String): Int {
        s.toSet().map { char ->
            if (s.count { it == char } == 1) {
                return s.indexOf(char)
            }
        }
        return -1
    }

}