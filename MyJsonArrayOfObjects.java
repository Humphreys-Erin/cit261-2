import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class MyJsonArrayOfObjects {
    public static void main(String args[]) {
        
        //create JSON Array
        JSONArray ar=new JSONArray();
 
        JSONObject obj;
        
        //Create and add JSON Objects to array
        obj=new JSONObject();
        obj.put("name","Joshua: " + 15);
        ar.add(obj);
        
        obj=new JSONObject();
        obj.put("name","Zachary: " + 14);
        ar.add(obj);
 
        obj=new JSONObject();
        obj.put("name","Allie: " + 12);
        ar.add(obj);
        
        obj=new JSONObject();
        obj.put("name","Miley: " + 10);
        ar.add(obj);
        
        obj=new JSONObject();
        obj.put("name","Charley: " + 7);
        ar.add(obj);
        
        obj=new JSONObject();
        obj.put("name","Kimmie: " + 5);
        ar.add(obj);
       
        obj=new JSONObject();
        obj.put("name","Jarom: " + 2);
        ar.add(obj);
 
        
        //Retrieve objects from array
        for(int i=0;i<ar.size();++i) {
            obj=(JSONObject)ar.get(i);
            System.out.println(obj.get("name"));            
        }
    }
}