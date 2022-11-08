import java.io.FileWriter;
import java.util.List;

public class Generator {
    private Generator(){}; // private constructor

    public static void generateIndex(String home, List<Images> imgs, List<Directories> dirs) {
        //write multi line file
        String index = home + "/index.html";
        String startfile = """
                <!DOCTYPE html>
                <html lang="en">
                                
                <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
                    <title>Explorer</title>
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
                    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.12.0/css/all.css">
                </head>
                                
                <body>
                    <div class="container" style="margin-top: 1%;">
                        <div class="row">
                            <div class="col-xl-2"><a class="btn btn-primary" role="button" href="#backurl" style="width: 100%;"><strong>^^</strong></a></div>
                            <div class="col-md-12 col-xl-10"><a class="btn btn-primary" role="button" style="width: 100%;" href="#homelink"><strong>Start Page</strong></a></div>
                        </div>
                        <div class="row" style="margin-top: 1%;">
                            <div class="col-md-6" style="border-right: 3px solid black;">
                                <div>
                                    <h2>Directories:</h2>
                                    <div style="display: flex;flex-flow: column;">
                """;
        String midfile = """
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div>
                        <h2>Images:</h2>
                        <div style="display: flex;flex-direction: column;">
                        """;
        String endfile = """
                </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
                </body>
                                
                </html>
                """;
        try {
            FileWriter myWriter = new FileWriter(index);
            myWriter.write(startfile);
            for (Directories d : dirs) {
                myWriter.write("<a class=\"btn btn-warning\" role=\"button\" style=\"margin-bottom: 5px;\" href=\""+d.getPath()+"\"><i class=\"fas fa-folder\"></i>&nbsp;"+d.getDrirName()+"</a>");
            }
            myWriter.write(midfile);
            for (Images i : imgs) {
                myWriter.write("<a class=\"btn btn-primary\" role=\"button\" style=\"margin-bottom: 5px;\" href=\""+i.getFullPath()+"\"><i class=\"fas fa-image\"></i>&nbsp;Img1</a>");
            }
            myWriter.write(endfile);
            myWriter.close();

        }catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
