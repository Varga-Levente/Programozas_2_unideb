import org.apache.commons.io.FilenameUtils;

import java.util.Arrays;
import java.util.List;

public class Images {
    String path;
    String name;
    String extension;
    public Images(String path){
        String[] exts = {"jpg", "png", "jpeg", "gif"};
        List<String> ext_list = Arrays.asList(exts);
        if(ext_list.contains(FilenameUtils.getExtension(path))){
            setPath(path);
            setName(path);
            setExt(path);
        }
    }

    private void setPath(String s){
        this.path = FilenameUtils.getPath(s);
    }

    private void setName(String s){
        this.name = FilenameUtils.getBaseName(s);
    }

    private void setExt(String s){
        this.extension= FilenameUtils.getExtension(s);
    }

    public String getPath(){
        return this.path;
    }

    public String getName(){
        return this.name;
    }

    public String getExtension(){
        return this.extension;
    }

    public String getFullPath(){
        return getPath()+getName()+"."+getExtension();
    }
}
