# bookstore-logging-tracking
A simple application with new features of java 9+.(this time logging and tracking features add)

this repositorie include a small JRE with needed modules and a JAR of project.

how to create a custom JRE:
        jlink --module-path $JAVA_HOME/jmods \
        --add-modules java.base \
        --output small-JRE
create a custom JRE from project:
        jlink --module-path $JAVA_HOME/jmods:mods \
        --add-modules br.com.casadocodigo \
        --output JRE-bookstore
        
how to packing the project in a JAR file:
      jar --create \
      --file=mlib/br.com.casadocodigo.domain-1.0.jar \
      --module-version 1.0 \
      ## --main-class=br.com.casadocodigo.Main \ ##(if has a main method)
      -C mods/br.com.casadocodigo.domain .
      
to run a JAR file:
      java -p mlib -m br.com.casadocodigo
