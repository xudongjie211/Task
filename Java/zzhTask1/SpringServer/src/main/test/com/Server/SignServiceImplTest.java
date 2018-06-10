<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>cn.zzh</groupId>
  <artifactId>SpringServer</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>war</packaging>

  <name>SpringServer Maven Webapp</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>4.3.17.RELEASE</version>
    </dependency>

    <!--https://mvnrepository.com/artifact/org.springframework/spring-core-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>4.3.17.RELEASE</version>
    </dependency>

    <!--https://mvnrepository.com/artifact/org.springframework/spring-context-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>4.3.17.RELEASE</version>
    </dependency>

    <!--Springmvc-->

    <!--https://mvnrepository.com/artifact/org.springframework/spring-webmvc-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>4.3.17.RELEASE</version>
    </dependency>
    <!--https://mvnrepository.com/artifact/org.springframework/spring-tx-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>4.3.17.RELEASE</version>
    </dependency>

    <!--https://mvnrepository.com/artifact/org.springframework/spring-jdbc-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>4.3.17.RELEASE</version>
    </dependency>

    <!--Spring和Mybatis整合包-->

    <!--https://mvnrepository.com/artifact/org.mybatis/mybatis-spring-->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis-spring</artifactId>
      <version>1.3.1</version>
    </dependency>

    <!--Mybatis核心包-->

    <!--https://mvnrepository.com/artifact/org.mybatis/mybatis-->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.4.5</version>
    </dependency>

    <!--Mybatis链接包/是不是叫数据库驱动包-->

    <!--https://mvnrepository.com/artifact/mysql/mysql-connector-java-->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>5.1.46</version>
    </dependency>

    <!--Mybatis依赖包log4j3个(log4jlog4j-apilog4jcore)slf4j-apislf4j-log4jasmcglibcommons-loggingjavassist-->
    <!--log4j3个-->
    <!--https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api-->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>2.7</version>
    </dependency>

    <!--https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12-->



    <!--https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core-->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-core</artifactId>
      <version>2.7</version>
    </dependency>

    <!--https://mvnrepository.com/artifact/log4j/log4j-->
    <dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>1.2.17</version>
    </dependency>
    <!--slf42个-->
    <!--https://mvnrepository.com/artifact/org.slf4j/slf4j-api-->
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>1.7.25</version>
    </dependency>

    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-log4j12</artifactId>
      <version>1.7.25</version>
      <scope>test</scope>
    </dependency>

    <!--asmcglibcommons-loggingjavassist-->

    <!--https://mvnrepository.com/artifact/org.ow2.asm/asm-->
    <dependency>
      <groupId>org.ow2.asm</groupId>
      <artifactId>asm</artifactId>
      <version>5.0.4</version>
    </dependency>

    <!--https://mvnrepository.com/artifact/cglib/cglib-->
    <dependency>
      <groupId>cglib</groupId>
      <artifactId>cglib</artifactId>
      <version>2.2.2</version>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
    </dependency>


    <!--https://mvnrepository.com/artifact/commons-logging/commons-logging-->
    <dependency>
      <groupId>commons-logging</groupId>
      <artifactId>commons-logging</artifactId>
      <version>1.1.1</version>
    </dependency>

    <!--https://mvnrepository.com/artifact/org.javassist/javassist-->
    <dependency>
      <groupId>org.javassist</groupId>
      <artifactId>javassist</artifactId>
      <version>3.21.0-GA</version>
    </dependency>

    <!--数据库链接池-->
    <!--https://mvnrepository.com/artifact/org.apache.commons/commons-dbcp2-->
    <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-dbcp2</artifactId>
      <version>2.1.1</version>
    </dependency>



  </dependencies>

  <build>
    <finalName>SpringServer</finalName>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.0.0</version>
        </plugin>
        <!-- see http://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_war_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.7.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.20.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-war-plugin</artifactId>
          <version>3.2.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>