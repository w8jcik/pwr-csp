import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;
import net.sf.mpxj.mpp.MPPReader;

public class Parse {
  public static void main(String[] args) throws Exception {
    MPPReader reader = new MPPReader();
    ProjectFile project = reader.read("data/10_3_5_3.mpp");
    
    for (Resource resource : project.getAllResources()) {
      if (resource.getName() != null) {
        System.out.println("Resource: " + resource.getName() + " (Unique ID=" + resource.getUniqueID() + ")");
      }
    }

  }
}
