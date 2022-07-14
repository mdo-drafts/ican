package unsolved_ii.p_01_arrays_hash.nc008_M_08_271_Encode_and_Decode_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codec {



    public String encode(List<String> strs) {
        if (strs.size() == 0) return Character.toString((char)258);

        String d = Character.toString((char)257);
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s);
            sb.append(d);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String d = Character.toString((char)258);
        if (s.equals(d)) return new ArrayList();

        d = Character.toString((char)257);
        return Arrays.asList(s.split(d, -1));
    }



/*    public String encode(List<String> strs) {
        return String.join("(@)", strs);
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        return Arrays.asList(s.split("\\(@\\)", -1));
    }*/

/*
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append("#").append(str.length()).append(str);
        }
        return result.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '#') {
                int j = i + 1;
                if (Character.isDigit(s.charAt(j))) {
                    char c = s.charAt(j);
                    StringBuilder strLength = new StringBuilder();
                    while (Character.isDigit(c)) {
                        strLength.append(c);
                        j++;
                        c = s.charAt(j);
                    }
                    int length = Integer.parseInt(strLength.toString());
                    if (length == 0) result.add("");
                    else result.add(s.substring(j , j + length));
                }
            }
        }
        return result;
    }*/
}
