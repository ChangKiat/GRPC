# GRPC

### Requirement
## GoLang
- GoLang Version 1.19
- IDE (Visio Studio Code)
- protoc

## JAVA
- JDK 8
- IDE (Eclipse)
- Maven

### GoLang Command

> go mod init server
- This command is for init ***go.mod*** file
- server is the module name (use for import local package in go)

> go mod tidy
- Download the needed library for go

> protoc --go_out=. --go_opt=paths=source_relative  --go-grpc_out=. --go-grpc_opt=paths=source_relative user.proto
- Generate ****_grpc.pb.go*** and ***pb.go*** file 
- Must have ****.proto*** file

### Java 
Step 1 - Add dependency and plugin in ***pom.xml***

Step 2 - Update ***Maven Project***

Step 3 - Import ****.proto*** file

Step 4 - Maven Build to generate ****.java*** and ****Grpc.java*** file base on the ****.proto***

Step 5 - Build your logic 

```diff
*** Same for client and server JAVA GRPC 
```
