# MyTestProject

##Build

```
mvn clean package
```

##Run


```
mvn gwt:codeserver -pl *-client -am
```

```
mvn jetty:run -pl *-server -am -Denv=dev
```

