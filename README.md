# Unofficial myGCC API

[![Build Status](https://img.shields.io/travis/mph121/mygcc-api.svg)](https://travis-ci.org/mph121/mygcc-api)

REST API to interface with the myGCC website.

See [API.md](API.md) for examples and a reference.

## Development

### Packaging
```mvn clean package```
```java -jar target/mygcc-api-jar-with-dependencies.jar```

If tests are failing or skipping make sure you have four environmental variables set:
- `enckey` A 16 character string for encrypting the tokens.
- `initvect` Another 16 character string for encrypting the tokens.

### Run server
```java -cp "target/classes:target/dependency/*" com.mygcc.api.Main```
