# Cucumber (Selenium + Java) Test-Tasks

## Installation
Selenium Dependency
```
<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>4.10.0</version>
  <scope>test</scope>
</dependency>
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-api</artifactId>
  <version>5.9.2</version>
  <scope>test</scope>
</dependency>
```

Cucumber Dependency
```
<dependency>
  <groupId>io.cucumber</groupId>
  <artifactId>cucumber-java</artifactId>
  <version>7.13.0</version>
  <scope>test</scope>
</dependency>
<dependency>
  <groupId>io.cucumber</groupId>
  <artifactId>cucumber-core</artifactId>
  <version>7.13.0</version>
  <scope>test</scope>
</dependency>
```

## What is Cucumber?
- Cucumber is a software tool that supports behavior-driven development
- Cucumber use Gherkin language as a parser
- It supports various language like Java, JavaScript, Ruby & Python
- Cucumber is free to use

## What is BDD?
- BDD includes test case development on the basis of the behavior of software functionalities
- BDD is written in simple English language statements, not in a typical programming language
- BDD improves communication between technical and non-technical teams and stakeholders

## What is Gherkin?
- Gherkin is a language that developers use to define tests in Cucumber. Since this language uses plain English, it’s meant to describe use cases for a software system in a way that can be read and understood by almost anyone

### Gherkin Syntax
- Feature -> The feature file starts with the keyword Feature. Under feature, you can mention the feature name which is to be tested
- Scenario -> Each scenario starts with a keyword Scenario
  There can be one or more scenarios in a feature file
- Given -> It is used to define the pre-condition in our test
- When -> It is used to define an action
- And -> It is used to connect two statements and provides the logical AND condition between any two statements
- Then -> It is used to define the final outcome or for validation
- But -> It defines the negative assertion

## What are Hooks?
- Hooks are blocks of code that can run at various points in the Cucumber execution cycle.
- They are typically used for setup and teardown of the environment before and after each scenario.

### Types of hooks
- Scenario hooks
    - @Before
    - @After
- Step hook
    - @BeforeStep
    - @AfterStep

### Tags
- Tags are a great way to organise your features and scenarios
- Tags can be used in the following places:
    - Feature
    - Scenario
    - Scenario Outline
    - Examples
- Tags can be used in conditional format using "And", "or" & "not"s

