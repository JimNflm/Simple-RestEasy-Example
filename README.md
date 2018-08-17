# Simple-RestEasy-Example

## How to test

- Downloads & Install Server

e.g. [Wildfly Downloads](http://wildfly.org/downloads/)

```sh
unzip wildfly-13.0.0.Final.zip -d ~/MyFolder
```

- Create war with Maven

```sh
mvn -Dmaven.test.skip=true clean package
```

- Copy war to your server & start it

```sh
rm -rf ~/Software/wildfly-13.0.0.Final/standalone/deployments/*
rm -rf ~/Software/wildfly-13.0.0.Final/standalone/tmp/*
cp ./target/simple-resteasy.war ~/Software/wildfly-13.0.0.Final/standalone/deployments
bash ~/Software/wildfly-13.0.0.Final/bin/standalone.sh
```

- Run Rest Client Test

```sh
mvn clean test
```
