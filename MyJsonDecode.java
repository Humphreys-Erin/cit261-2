package MyDecodeJson;

/**
 *
 * @author woo13
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
 
public class MyJsonDecode {
    public static void main(String args[]) {
        String JSONObjectString="{\"name\":\"Joshua Humphreys\"}";
        String JSONArrayString="[\"Josh\",\"Zach\",\"Allie\",\"Miley\",\"Charley\",\"Kimmie\",\"Jarom\"]";
 
        JSONObject obj=(JSONObject)JSONValue.parse(JSONObjectString);
        JSONArray ar=(JSONArray)JSONValue.parse(JSONArrayString);
        
        System.out.println(obj);
        System.out.println(ar);
 
    }
}
