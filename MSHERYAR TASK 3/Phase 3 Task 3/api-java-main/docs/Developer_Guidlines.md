# Guidlines
- The web API must implement secure authentication and authorization mechanisms to ensure that only authenticated and authorized users can access sensitive resources.

- All input data, especially user inputs, must be validated to prevent injection attacks and ensure data integrity.

- Communication between the client and the API must be encrypted to protect sensitive data during transit.

- To prevent abuse and ensure fair usage, the API must implement rate limiting on incoming requests.

- The API must have robust logging and monitoring capabilities to detect and respond to security incidents and performance issues.


# Reference(s)

-  OWASP Authentication Cheatsheet

-  OWASP Input Validation Cheatsheet

- OWASP Transport Layer Protection Cheatsheet

- OWASP Rate Limiting Cheatsheet

-  OWASP Logging Cheat Sheet

# Model Eplanation

- Entity Annotation: The @Entity annotation indicates that this class is a JPA (Java Persistence API) entity, and instances of this class will be persisted in a relational database.

- Id and GeneratedValue Annotations: The @Id annotation denotes the primary key of the entity, and @GeneratedValue specifies that the ID should be automatically generated (auto-incremented in the database).

- Attributes (name and price): Represent the properties of an item, such as its name and price.

- Getters and Setters: Provide access to private attributes, following JavaBean conventions.

- Optional Methods (toString, hashCode, equals): These methods enhance the usability of the class (especially when dealing with collections), but they are optional.

# Controller Eplanation

- RestController Annotation: The @RestController annotation indicates that this class is a Spring MVC controller that handles incoming HTTP requests and produces HTTP responses.

- RequestMapping Annotation: Specifies the base URI path ("/api/items") for which the controller is responsible.

- Autowired Annotation: Injects an instance of ItemService into the controller. This is an example of dependency injection, promoting loose coupling.

- HTTP Methods (@GetMapping, @PostMapping, @DeleteMapping): These annotations define the mapping of HTTP methods to the corresponding controller methods.

- Path Variables (@PathVariable): Extracts values from the URI path and passes them as parameters to controller methods.

Request Body (@RequestBody): Binds the request body to a method parameter, allowing the controller to receive and process data sent in the request body.

-Controller Methods (getAllItems, getItemById, saveItem, deleteItem): These methods define the behavior of the API endpoints, delegating business logic to the ItemService.

