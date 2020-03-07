
# revature

[RevaturePro](https://app.revature.com/) Coding Exercises

<br>

##  Java

#### Annotations

- Begin with `@` symbol, no semicolon`;`
- Provides info to compiler and 3rd party tools about how their subjects should be treated

One of the few pre-defined annotations is `@Override` which indicates to the compiler that the annotated method should override a method inherited from a superclass

<br>

#### Marshalling

> The process of converting an object instance into a data format that describes it

For example, when Program A has data (via file, app, etc.) sent to a remote location that needs to be transformed on one end into a format that can be sent & rebuilt on the other

The simplest way to Marshal an object is to convert its state to a stream of bytes, send those bytes, and expect the receiving system to rebuild that byte stream into a remote instance of the object with the same state. This is also called "serialization"; an object that you want to send this way will need to implement the Serializable interface

2 common formats used for the express purpose of describing data, and nothing more: XML & JSON - making them perfect for sending data between otherwise incompatible systems. For example, taking an instance of a `Person` object, converting it to an XML file that describes the instance state, and sending it to an application written in `C#`; that `C#` app could parse the XML data directly, or unmarshal it into a `Person` object as defined by the `C#` app. For binding objects to XML, understand XML tags (similar to HTML)

<br>

## Changelog

| Version | Date     | Description |
|---------|----------|-------------|
| 0.0.4   | 03-06-20 | Added Java `Collections`, `Maps`, `Generics`, `Annotations`, `Marshalling` Examples & Notes |
| 0.0.3   | 03-04-20 | Added Java `Interfaces`, `Exceptions`, `Object` Examples |
| 0.0.2   | 03-04-20 | Added Java `Inheritance`, `Keywords`, `Polymorphism`, `Casting` Examples |
| 0.0.1   | 03-03-20 | Added initial RevaturePro Java course `FirstProgram` Classes Examples |
| 0.0.0   | 03-03-20 | Initial commit |
