package unsolved.p_01_arrays_hash.nc008_M_08_271_Encode_and_Decode_Strings.at_03_bad;

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

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            while (s.charAt(r) != '#') r++;

            int length = Integer.parseInt(s.substring(l, r));
            l = r + 1;
            r = l + length;
            result.add(s.substring(l, r));
        }
        return result;
    }
}
