📌 About the project

This Java project demonstrates how to use MapStruct to map between domain objects (Model) and Data Transfer Objects (DTO).
The application creates instances of UserModel and UserDTO and converts between them automatically using a mapper.

🧱 Class structure
🔹 UserModel

Represents the domain entity of the application.

Fields:

code → user identifier

userName → user name

birthday → birth date

Uses Lombok to automatically generate:

getters and setters

no-args constructor

equals, hashCode, and toString

🔹 UserDTO

Data Transfer Object used for communication between layers.

Fields:

id

name

birthday

Also uses Lombok (@Data) to generate utility methods.

🔹 UserMapper

Interface responsible for mapping between UserModel and UserDTO using MapStruct.

Methods

✔ DTO → Model

UserModel toModel(UserDTO dto);

Mappings:

id → code

name → userName

✔ Model → DTO

UserDTO toDTO(UserModel model);

Mappings:

code → id

userName → name

MapStruct automatically generates the implementation of this interface at compile time.

🔹 Main

Class responsible for running the application and demonstrating how the mapper works.

Execution flow:

1️⃣ Creates a UserModel
2️⃣ Converts it to UserDTO and prints it to the console
3️⃣ Creates a UserDTO
4️⃣ Converts it to UserModel and prints it to the console

This demonstrates the bidirectional conversion between the objects.

⚙️ Technologies used

Java

Maven

MapStruct

Lombok

▶️ Running the project

When running the Main class, the console will display the converted objects, confirming that the mapping was performed successfully.
