import java.io.File;
import java.io.FilenameFilter;





public class Search{
 
 
    
    
    
   public static void main(String[] argv) throws Exception {
        File file = new File("insert directory");
           String[] list = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
   }
    





