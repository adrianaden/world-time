### Quick Start
** Make sure you have Maven and JDK Version >= 1.8 **
> Clone/Download the repo then edit in controller / service / repository

```bash
# clone our repo or you can do fork for yourself
git clone https://github.com/adrianaden/world-time.git

# change directory to our repo
cd world-time

# install the repo with mvn
mvn install

# add dependency in your project
<dependency>
    <groupId>org.adendrata.common</groupId>
    <artifactId>worldtime</artifactId>
    <version>1.0.1-SNAPSHOT</version>
</dependency>
```



.....
### Quick Guide
```
long currentMillis = System.currentTimeMillis();

ZonedDateTime worldTimeUTC = WorldTime.of(currentMillis).toUTC();
ZonedDateTime worldTimeGMT5 = WorldTime.of(currentMillis).toGMT(5);

System.out.println(worldTimeUTC);
System.out.println(worldTimeGMT5);
```
> output should be like this
```
2018-10-26T11:23:35.287Z[Etc/UTC]
2018-10-26T06:23:35.287-05:00[Etc/GMT+5]
Process finished with exit code 0
```

more: https://medium.com/@a.adendrata/how-to-convert-time-to-different-timezone-with-java-8-73d67dfbc5e6
