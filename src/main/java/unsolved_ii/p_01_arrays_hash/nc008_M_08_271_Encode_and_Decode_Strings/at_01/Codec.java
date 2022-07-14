package unsolved_ii.p_01_arrays_hash.nc008_M_08_271_Encode_and_Decode_Strings.at_01;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1 + length;
            result.add(s.substring(j + 1, i));
        }
        return result;
    }
}
