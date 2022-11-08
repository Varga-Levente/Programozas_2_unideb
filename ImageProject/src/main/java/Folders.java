public class Folders {

    String path;
    String name;
    String url;

    public Folders(String path, String name, String url) {
        setPath(path);
        setName(name);
        setUrl(url);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
