#!/bin/bash

VERSION=${1:-"2.0.0"}
GROUP_ID="com.uid2"
ARTIFACT_ID="uid2-attestation-api"

echo 'uid2-attestation-api: build & install'
mvn clean package && mvn install:install-file -Dfile="./target/$ARTIFACT_ID-$VERSION.jar" -Dsources="./target/$ARTIFACT_ID-$VERSION-sources.jar"  -DgroupId="$GROUP_ID" -DartifactId="$ARTIFACT_ID" -Dpackaging=jar -DpomFile="./pom.xml" -Dversion="$VERSION"
