import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void walk( String path, List<Images> img_paths, List<Directories> dir_paths) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isFile() ) {
                img_paths.add( new Images(f.getAbsolutePath()) );
                //System.out.println( f.getAbsoluteFile() );
            }
            else {
                dir_paths.add( new Directories(f.getAbsolutePath()) );
                walk( f.getAbsolutePath(), img_paths, dir_paths );
            }
        }
    }

    public static void main(String[] args) {
        List<Images> img_paths = new ArrayList<>();
        List<Directories> dir_paths = new ArrayList<>();
        String path = "/home/vlevente/Desktop/images";
        walk(path, img_paths, dir_paths );
        for(Images s: img_paths){
            System.out.println("FILE - "+s.getPath()+s.getName()+"."+s.getExtension());
        }

        System.out.println("************************************************************************************************");

        for(Directories s: dir_paths){
            System.out.println("DIR - "+s.path+" - "+s.isEmpty());
        }

        Generator.generateIndex(path, img_paths, dir_paths);
    }
}