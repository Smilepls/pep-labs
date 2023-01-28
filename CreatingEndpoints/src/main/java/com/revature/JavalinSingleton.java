package com.revature;

import io.javalin.Javalin;

public class JavalinSingleton {

    
    /**
     * Lab: Create an HTTP GET endpoint at the url: http://localhost:9000/hello that will return the string "Hello
     * World" in the response.
     * 
     * Note: Please refer to the "CreatingEndpoints.MD" file for more assistance if needed.
     */
    public static Javalin getInstance(){
      

       curl ("localhost:9000/hello", ctx ->{
            ctx.result("Hello World");
       });
       curl ("localhost:9000/hello", ctx ->{
            ctx.result("HelloWorld");
       });
       

        return app;
    }
    
}
