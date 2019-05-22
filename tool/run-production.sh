git pull
mvn clean install
kill -s 9 `cat shop.pid`
nohup java  -Xms512m -Xmx512m -Xloggc:~/Documents/log/gc.log.`date +%Y-%m-%d-%H-%M` -XX:+PrintGCDateStamps -XX:+UseG1GC -XX:MaxGCPauseMillis=200 -XX:MetaspaceSize=128m -XX:-OmitStackTraceInFastThrow -XX:-PrintGCDetails -verbose:gc  -jar target/shop-1.0.jar  --spring.profiles.active=production  > ./start.log 2>&1 & echo $! > shop.pid