package dk.swsec.flatfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,User> memory = new HashMap<Integer,User>();
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
            config.routes.get("/user", ctx -> {
            });
            config.routes.get("/user/{userid}", ctx -> {
                try {
                    ctx.status(200);
                    ctx.json(memory.get(Integer.parseInt(ctx.pathParam("userid"))));
                } catch (NumberFormatException numex) {
                    ctx.status(400);
                    ctx.result("Numbers only.");
                }
            });
            config.routes.post("/user/", ctx -> {
                
            });
            config.routes.patch("/user/{userid}", ctx -> {
                try {
                    int userid = Integer.parseInt(ctx.pathParam("userid"));
                } catch (NumberFormatException numex) {
                    ctx.status(400);
                    ctx.result("Numbers only.");
                }
            });
            config.routes.delete("/user/{userid}", ctx -> {
                try {
                    int userid = Integer.parseInt(ctx.pathParam("userid"));
                } catch (NumberFormatException numex) {
                    ctx.status(400);
                    ctx.result("Numbers only.");
                }
            });
        }).start(7070);
    }
}