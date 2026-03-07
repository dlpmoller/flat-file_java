package dk.swsec.flatfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        HashMap memory = new HashMap<Integer,User>();
        Path filePath = Path.of("file", "flatfile.json");
        File flatFile = filePath.toFile();
        if (!flatFile.exists()) {
            try {
                flatFile.mkdirs();
                flatFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file:\n" + e.getMessage());
            }
        }



        var app = Javalin.create(config -> {
            config.useVirtualThreads = true;
        }).start(7070);

        app.get("/getusers/{user}", ctx -> {});
        app.get("/getusers", ctx -> {});
        app.post("/adduser", ctx -> {});
        app.patch("/edituser", ctx -> {});
        app.delete("/removeuser", ctx -> {});
    }
}