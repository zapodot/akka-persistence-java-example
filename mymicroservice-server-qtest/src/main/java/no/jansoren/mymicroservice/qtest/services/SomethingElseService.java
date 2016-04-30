package no.jansoren.mymicroservice.qtest.services;

import javax.ws.rs.core.Response;
import no.bouvet.jsonclient.JsonClient;

public class SomethingElseService {
  private final JsonClient jsonClient = new JsonClient();

  public Response doSomethingElse() {
    return jsonClient.http().get("http://localhost:8080/somethingelse/do").object(Response.class);
  }

  public Response getSomethingElse() {
    return jsonClient.http().get("http://localhost:8080/somethingelse/get").object(Response.class);
  }
}
