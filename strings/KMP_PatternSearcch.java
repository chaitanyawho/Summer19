package strings;

public class KMP_PatternSearcch {
    private int[] computeTemporaryArray(char pattern[]){
        int [] lps = new int[pattern.length];
        int j =0;
        for(int i=1; i < pattern.length;){
            if(pattern[i] == pattern[j]){
                lps[i] = j + 1;
                j++;
                i++;
            }else{
                if(j != 0){
                    j = lps[j-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
        return lps;
    }

    /**
     * KMP algorithm of pattern matching.
     */
    public boolean KMP(char []text, char []pattern){

        int lps[] = computeTemporaryArray(pattern);
        int i=0;
        int j=0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }
            if (j == pattern.length) {
                System.out.println("Found pattern "
                        + "at index " + (i - j));
                j = lps[j - 1];
            }else{
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }

        }
        if(j == pattern.length){
            return true;
        }
        return false;
    }
}
