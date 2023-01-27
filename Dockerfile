FROM azul/zulu-openjdk:17.0.5

EXPOSE 8080

# JAR_FILE 변수 정의
ARG JAR_FILE=./build/libs/kopring2-0.0.1-SNAPSHOT.jar

# 폴더 생성
RUN mkdir -p /app/mytest

# 내 build파일(.jar)을 해당 위치에 해당 이름으로 복사
COPY ${JAR_FILE} /app/mytest/myTest.jar
COPY docker-entrypoint.sh /app/mytest/docker-entrypoint.sh
RUN chmod +x /app/mytest/docker-entrypoint.sh

EXPOSE 8080

# 시스템 진입점 정의 ( 우리 앱에선 doceker-entrypoint.sh 파일 )
ENTRYPOINT ["sh", "-c", "/app/mytest/docker-entrypoint.sh"]