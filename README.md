# Smart Home Management System

This project aims to develop a smart home management system using object-oriented programming principles. The system can be used to manage, coordinate, and control various devices and systems within a home.

## Software Requirements

1. **Interface Definitions**

   **Controllable**: This interface defines the controllable behaviors of devices. It includes basic functions such as turning on, turning off, and querying status.

2. **Base Classes**

   **Appliance**: Represents the base class for devices. It implements the Controllable interface and contains common behaviors for devices.

3. **Device Classes**

   **Light**: Represents the lighting system. Inherits from the Appliance class and performs specific light control operations.

   **Thermostat**: Represents the heating and cooling system. Inherits from the Appliance class and manages temperature settings.

   **SecuritySystem**: Class for the home security system. Extends the Appliance class and includes special behaviors such as alarm states and camera control.

4. **Multiple Inheritance and Polymorphism**

   Device classes inherit from the Appliance class and implement the Controllable interface. This allows all devices to be managed in a unified manner while also supporting specialized behaviors.

5. **Console Application**

   A console application is developed to provide the user with the ability to manage the devices in the home. Through this application, users can perform basic operations such as turning devices on and off and querying their status.

6. **Avoiding Code Duplication**

   The Appliance class defines the fundamental behaviors of devices and the Controllable interface. This helps in avoiding code duplication by not requiring the same code to be rewritten in each device class.

```java
interface Controllable {
    void turnOn();
    void turnOff();
    boolean isOn();
}
```
```java
class SecuritySystem extends Appliance {
    // Security system behaviors are defined here
}
```

This project will help you apply object-oriented programming principles using the Java programming language and model a smart home management scenario. Additionally, it will enable you to understand concepts such as code reuse, multiple inheritance, and polymorphism through the specified requirements.

---