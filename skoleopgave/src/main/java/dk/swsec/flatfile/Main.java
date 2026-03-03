package dk.swsec.flatfile;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(/*something*/)
        .get("/", ctx -> ctx.result("Hello World!"))
        .get("/list", ctx -> ctx.result("Oh that worked."))
        .start(7070);
    }
}