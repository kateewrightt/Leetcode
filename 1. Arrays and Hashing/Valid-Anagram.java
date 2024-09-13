class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        boolean result = Arrays.equals(arrS, arrT);

        if ( result) {
            return true;
        }
        return false;

    }
}
