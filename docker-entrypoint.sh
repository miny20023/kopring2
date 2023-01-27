EXECUTE_CMD="java -jar"
JAVA_OPT_DEFAULT="-Dfile.encoding=UTF-8"
APP_FILE="/app/mytest/myTest.jar"
JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom"
ACTIVE_PROFILE="-Dspring.profiles.active=default"
JAVA_CMD="${EXECUTE_CMD} ${ACTIVE_PROFILE} ${JAVA_OPT_DEFAULT} ${JAVA_OPTS} ${APP_FILE}"

exec $JAVA_CMD;