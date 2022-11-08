package Alap;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Languages{
    public static void createfile(String filename, String lang, String ext){
        String sample = "";
        if(lang.equals("python")){
            sample = ("""
                    #!/usr/bin/env python3
                    
                    def main():
                        print("Hello World!")
                    
                    ########################################################
                    
                    if __name__ == '__main__':
                        main()
                    """);
        }

        if(lang.equals("java")){
            sample = ("""
                    class\040"""+filename.substring(0, 1).toUpperCase() + filename.substring(1)+
                    """
                    \040{
                        public static void main(String[] args) {
                            System.out.println("Hello world!");
                        }
                    }
                    """);
        }

        if(lang.equals("c")){
            sample = ("""
                    #include <stdio.h>
                    int main(){
                        printf("Hello World!");
                        return 0;
                    }
                    """);
        }

        if(lang.equals("php")){
            sample = ("""
                    <?php
                        echo "Hello World!";
                    ?>
                    """);
        }

        if(lang.equals("html")){
            sample = ("""
                    <html>
                        <head>
                            <meta charset="UTF-8">
                            <meta name="viewport" content="width=device-width, initial-scale=1">
                        </head>
                        <body>
                            <h1>Hello world!</h1>
                        </body>
                    </html>
                    """);
        }

        if(lang.equals("css")){
            sample = ("""
                    :root{
                        --main-color: #2596be
                    }

                    head{
                        
                    }

                    """);
        }

        if(lang.equals("js")){
            sample = ("""
                    function loader(){
                        
                    }
                    """);
        }

        try {
            // Fájl keresése az aktuális könyvtárban
            Path path = Paths.get(filename+"."+ext);

            // A fájl létezése esetén hiba üzenet és kilépés
            if (Files.exists(path)) {
                System.out.println("The file is already exists! Exiting...");
            }

            // Fájl nem létezik, létrehozzuk az új sample file-t
            if (Files.notExists(path)) {
                FileWriter myWriter = new FileWriter(filename+"."+ext);
                myWriter.write(sample);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }


        } catch (IOException e) {
            // Egyéb hibák kezelése és kiírása
            System.out.println("An error occurred. Exiting...");
            e.printStackTrace();
        }

    }
}