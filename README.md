# facaiy-scala-with-java-quickstart
An archetype which creates a mixed Java/Scala project.

### Install archetype locally
To install the archetype in your local repository execute the following commands:

```bash
git clone https://github.com/facaiy/facaiy-scala-with-java-quickstart.git
pushd facaiy-scala-with-java-quickstart
mvn clean install
popd
```

### Create a project from a local repository
Create a new empty directory for your project and navigate into it and then run:

```bash
mvn archetype:generate \
        -DarchetypeGroupId=io.github.facaiy \
        -DarchetypeArtifactId=facaiy-scala-with-java-quickstart \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=my.groupid \
        -DartifactId=my-artifactId \
        -Dversion=1.0-SNAPSHOT
```

Ref:

+ [apache/spark](https://github.com/apache/spark)
+ [davidB/scala-archetype-simple](https://github.com/davidB/scala-archetype-simple)
+ [spring-mvc-quickstart-archetype](https://github.com/kolorobot/spring-mvc-quickstart-archetype)
