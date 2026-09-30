class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            int replacement = -1;

            for (int j = 0; j < indices.length; j++) {
                if (indices[j] == i && s.startsWith(sources[j], i)) {
                    replacement = j;
                    break;
                }
            }

            if (replacement != -1) {
                result.append(targets[replacement]);
                i += sources[replacement].length();
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}