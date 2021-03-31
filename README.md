```
mvn package
mkdir META-INF
/opt/jvms/graalvm-ce-java11-21.0.0/bin/java -agentlib:native-image-agent=config-output-dir=./META-INF/native-image -cp ~/.m2/repository/org/bouncycastle/bc-fips/1.0.2/bc-fips-1.0.2.jar:target/graal-issue-bouncycastle-1.0-SNAPSHOT.jar Main
/opt/jvms/graalvm-ce-java11-21.0.0/bin/native-image -cp ~/.m2/repository/org/bouncycastle/bc-fips/1.0.2/bc-fips-1.0.2.jar:target/graal-issue-bouncycastle-1.0-SNAPSHOT.jar:./ Main
./main
```