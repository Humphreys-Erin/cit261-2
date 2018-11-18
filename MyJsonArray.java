import org.json.simple.JSONArray;
 
public class MyJsonArray {
    public static void main(String args[]) {
        
        //create JSON Array
        JSONArray ar=new JSONArray();
        
        //encode JSON Array
        ar.add("Josh: " + 15);
        ar.add("Zach: " + 14);
        ar.add("Allie: " + 12);
        ar.add("Miley: " + 10);
        ar.add("Charley: " + 7);
        ar.add("Kimmie: " + 5);
        ar.add("Jarom: " + 2);
        
        //decode JSON Array
        for(int i=0;i<ar.size();++i) {
            System.out.println(ar.get(i));            
        }
    }
}