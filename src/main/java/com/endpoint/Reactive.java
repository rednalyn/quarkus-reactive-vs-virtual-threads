package com.endpoint;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/reactive")
public class Reactive {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> helloReactive() {
        return Uni.createFrom().item(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello from Reactive!";
        });
    }
}
