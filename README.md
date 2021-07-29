# Getting Started

To build jar, type:

```script
gradlew build
```

To create docker container, type:

```script
docker build  --build-arg JAR_FILE=build/libs/*.jar -t redis-demo:latest .
```

To run demo, type:

```script
docker-compose -f docker-compose.yml up
```

To add a person, type:
```script
curl -v -X POST  -H "Content-Type: application/json"   --data '{"firstname":"garrard","lastname":"kitchen"}'  "localhost:8080/person"
...
{"id":-5372104035195763399,"firstname":"garrard","lastname":"kitchen"}
```
To retrieve this person, type:

```script
curl -v -X GET -H "Content-Type: text/plain"   "localhost:8080/person/{use-id-from-prev-curl}"
```

To retrieve all persons, type:
```script
curl -v -X GET -H "Content-Type: text/plain"   "localhost:8080/person"
```

To remove all persons, type:
```script
curl -v -X DELETE -H "Content-Type: text/plain"   "localhost:8080/person"
```