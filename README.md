# protoBufDemo
This is a sample project which demos the usage of protoBuf in the response. Project using Spring boot , Maven, Java 8
ProtobufHttpMessageConverter is to convert HTTP requests/responses to/from protobuf format whenever it encounters a protobuf message.

mvn compile to compile the message.proto to generated java classes
mvn spring-boot:run to run the project

After running the project
Execute
http://localhost:8080/message
User header key **Accept** value as **application/x-protobuf** to get response for protoBuf
If exeucted with header key **Accept** value as **application/json** will get response in JSON.
