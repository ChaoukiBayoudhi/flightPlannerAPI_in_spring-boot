package tn.esb.lmad.flightPlannerAPI.Web;

import org.springframework.web.bind.annotation.RestController;

@RestController
//this class is the boundary of our architecture ECB (Entity Control Boundary)
//In the controller we will have the endpoints (APIs) that will be exposed to the outside world (the front end or the  client)
//the controller interacts with the service layer and with the front end
//the controller is listening to the requests from the front end and it will call the service layer
//the controller will return the response to the front end
//the frontend/backend communication is done using json (or xml, resources, etc...) and HTTP protocol
//so in the controller we use annotations like @GetMapping, @PostMapping, @PutMapping, @DeleteMapping and @PatchMapping
//to specify the HTTP method (GET, POST, PUT, PATCH,DELETE, ...) of the request, the path of the request and the response status code (200, 201, 204, 400, 404, 500, ...)
//@GetMapping annotation is used if the request want to get data from the backend (in SQL SELECT)
//@PostMapping annotation is used if the request want to add data to the backend (in SQL INSERT)
//@PutMapping annotation is used if the request want to update data entirely in the backend (in SQL UPDATE)
//@PatchMapping annotation is used if the request want to update data partially in the backend (in SQL UPDATE)
//@DeleteMapping annotation is used if the request want to remove data from the backend (in SQL DELETE)
//The font end or the client send a HttpRequest to the backend and the backend will return a HttpResponse
//Both HttpRequest and HttpResponse have a body and a header
//The header contains the metadata of the request/response like the content type,
//the content length, the status code,the method (request) or the protocol,encoding,authorization,...
//The body contains the data of the request/response (json, xml, resources, ...), in general the body is in json format
//the data must be sent on the body is sensible data (password, credit card number, ...) or big data (images, videos, objects ...)
//spring-boot uses the @RequestBody annotation to get the data from the request body

//We can send too data to the backend on the path of the request (in the url)
//like if we want to call a service calculator having the url http://localhost:8080/calculator/
//andd wde want to evaluate the expression 2+3
//the request will be http://localhost:8080/calculator?x=2&y=3
//the x and y are the parameters of the request and spring boot uses the @RequestParam annotation to get the parameters from the request
 // the data could be also sent to the backend on the url of the request as a path variable
//like if we want to call a service calculator having the url http://localhost:8080/calculator/
//and wde want to evaluate the sin of 70 degrees
//the request will be http://localhost:8080/calculator/sin/70
//spring boot uses the @PathVariable annotation to get the path variable from the request

// for the data format we use annotations like @JsonFormat, @JsonIdentityInfo, @JsonIgnore, @JsonProperty
public class AircraftController {

}
