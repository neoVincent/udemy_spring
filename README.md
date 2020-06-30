# Spring Framework
This repo contains the coding exercise of the Spring Framework Master Class on Udemy

## Intro
Important concepts in Spring Framework:
- dependency injection
- loose coupling


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

## Autowired
constructor injector
setter injector: either you have a setter function or not, the background algorithm will use it as as default.

choose:
mandatory : autowirted use constructor
## Debug
resoruces/application.properties

