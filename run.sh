#!/bin/bash
mvn -Dmaven.test.skip=true clean package 
rm -rf ~/Software/wildfly-13.0.0.Final/standalone/deployments/*
rm -rf ~/Software/wildfly-13.0.0.Final/standalone/tmp/*
cp ./target/simple-resteasy.war ~/Software/wildfly-13.0.0.Final/standalone/deployments
bash ~/Software/wildfly-13.0.0.Final/bin/standalone.sh