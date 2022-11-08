import java.io.File;

public class Directories {
    String path;
    Boolean isempty;
    public Directories(String path) {
        setPath(path);
        setIsEmpty(path);
    }

    public void setPath(String s) {
        this.path = s;
    }

    public void setIsEmpty(String s) {
        File f = new File(s);
        if (f.isDirectory()) {
            if (f.list().length == 0) {
                this.isempty = true;
            } else {
                this.isempty = false;
            }
        }
    }

    public String getPath() {
        return this.path;
    }

    public Boolean isEmpty() {
        return this.isempty;
    }

    public String getDrirName(){
        return this.path.substring(this.path.lastIndexOf("/")+1);
    }
}
