## springboot-kafka
My project includes the use of springboot application with kafka instance to publish messages.my project uses spring boot tp publish messages into kafka topic i used kafka templete into spring boot application to publish messages.Once you publish messages through spring boot into kafka topic messages are consumed into consumer
## Team members
- JeevanReddy Mure

  ![](https://github.com/jeevanreddymure/springboot-kafka/blob/master/IMG_w78p3o%20(4).jpg?raw=true)
## Requirements
- JDK 8
- visual studio code
- kafka package
## Dependencies used
- spring kafka
- spring web
- spring starter
## Steps to start the application
1. First Start Apache Zookeeper
   `.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties` 
2. Next Run Kafka service from kafka directory 
      `.\bin\windows\kafka-server-start.bat .\config\server.properties`
3. Create a kafka topic to publish messages
     ` .\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic java-topic`
4. Start the consumer listening to kafka topic
    `.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic java-topic --from-beginning`
5. open the url in your browser [http://localhost:8085//publish-kafka/producer?message=example](http://localhost:8080//javainuse-kafka/producer?message=test)
