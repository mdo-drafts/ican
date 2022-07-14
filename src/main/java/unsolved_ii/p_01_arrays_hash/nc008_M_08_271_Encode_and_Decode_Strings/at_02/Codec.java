package unsolved_ii.p_01_arrays_hash.nc008_M_08_271_Encode_and_Decode_Strings.at_02;

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
            StringBuilder strLength = new StringBuilder();
            while (s.charAt(j) != '#') {
                strLength.append(s.charAt(j));
                j++;
            }
            int length = Integer.parseInt(strLength.toString());
            i = j + 1 + length;
            result.add(s.substring(j + 1, i));
        }
        return result;
    }
}
