# Spring Framework
This repo contains the coding exercise of the Spring Framework Master Class on Udemy

## Intro
Important concepts in Spring Framework:
- dependency injection
- loose coupling

### Framework
3 layers: Web, Business, data; they are all about dependencies


- Web: how interface with the external world,
    - Take the business input and expose 
    - Convert the datat from business to outworkd (json)
- Business
    - Business logic, transaction, 
- Data
    - Take data into db
```Java
 @Component
 public class TodoController {
     @Autowired
     TodoBusinessServie businessServie;
 }
 
 @Component
 public class TodoBusinessService {
     @Autowired
     TodoDataService dataService;
 }
 
 @Component
 public class TodoDataService {
     @Autowired
     JdbcTemplate template;
 }
```


## Beans
What are the beans?
@component
managed by application context

What are the dependencies of a bean?
@Autowired

Where to  search for beans?
component scan
@SpringBootApplication
scan all the things under this @SpringBootApplication package
in our example, scan all the package and its sub-package  com.in28minutes.spring.basics.springin5steps;

### Component Annotation
All the following annotation behave same basically. Falls into 4 categories according to different layer(Web, Business, Data ) 
@Component: generic component
@Service: Business Service Facade
@Repository: encapsulating storage, retrieval, and search behavior typically from a relational database
@Controller: Controller in MVC pattern

### Scope
default: singleton
- singleton: one instance per Spring Context
- prototype: new bean whenever requested
- request: one bean per HTTP request
- session: one bean per HTTP session

> request and session scope are useful in Web Application

#### Proxy
A depends on B

A: prototype
B: prototype
A is different, but each A's B is same

A: singleton
B: prototype
A and B are all same

if we want to A has different B, We need proxy
B should chagne its annoatation  @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
proxyMode = ScopedProxyMode.TARGET_CLASS)

> note: the Autowired instance becomes Proxy, instead of B, and each time the Proxy get the instance of B it make sure the result is new instance


#### How to config
@Scope("prototype"") at each class/component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

## Autowired
constructor injector
setter injector: either you have a setter function or not, the background algorithm will use it as as default.
choose:
mandatory : autowirted use constructor

### In depth to resolve multiple candidate for autowirted
- autowiring by name
the variable name can be the className; (class: BubbleSortAlgorithm, variable: bubbleSortAlgorithm)
note: @Primary has the top priority even your autowirted vaiable is followed the class name

- @Qualifier(name)
    - both at the class below @Component and below the @AutoWired 


## Debug
resoruces/application.properties


## Component Scan
The folder which spring use to find the component
by default, it is top folder is the same as @SpringBootApplication

### How to config
Add the @ComponentScan("com.in28minutes.spring.basics.componentscan")
@ComponentScan({"com.my.package.first","com.my.package.second"})

## CDI
define the interface
Context Dependency Interface
Spring Supports most annotations

## How to ready config file
use the @PropertySource