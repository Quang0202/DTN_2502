# Sử dụng OpenJDK base image
FROM openjdk:17-jdk-slim

# Cài đặt thư mục làm việc trong container
WORKDIR /app

# Mount thư mục target từ máy chủ vào container thay vì sao chép file JAR vào container
# Mount này được thực hiện trong docker-compose.yml, không cần phải copy file JAR vào container

# Cấu hình lệnh để chạy ứng dụng
ENTRYPOINT ["java", "-jar", "/app/target/AccountManagement-0.0.1-SNAPSHOT.jar"]

# Mở cổng mà ứng dụng sẽ lắng nghe (ví dụ: 8080)
EXPOSE 8080
