# DP-Practice

The project involves implementing three design patterns in Java: Abstract Factory, Observer, and Singleton. The goal is to create a software system that manufactures computers (specifically laptops and desktop PCs) and notifies interested customers about new computer releases.

The Abstract Factory pattern is used to create computers of different types, allowing for the manufacturing of specific computer models from generic types. The Observer pattern is used to register customers who are interested in purchasing computers and update them when new computers become available. The Singleton pattern ensures that there is only one instance of the store, which serves the customers.

The logic of the project is as follows:

The user is prompted to specify the number of computers to be manufactured and the number of customers waiting for specific computers.
Customers are randomly interested in either a laptop or a desktop PC, and each customer is assigned one computer.
The store, represented by an object, is responsible for creating the specifications of the computers to be produced. The specifications are random.
Once a customer receives a computer, they use it according to its type. For desktop PCs, they run an application, and for laptops, they take a picture using the camera.
The project concludes by recording the number of customers who did not receive a computer.
The project emphasizes the use of private fields and getters/setters for better data handling.
