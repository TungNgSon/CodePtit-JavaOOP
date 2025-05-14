# Chọn base image OpenJDK (có sẵn JDK cho việc biên dịch và chạy ứng dụng Java)
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép mã nguồn từ thư mục src vào thư mục /app trong container
COPY src /app/src

# Biên dịch mã nguồn Java
RUN javac /app/src/Collection/J02009.java

# Chạy ứng dụng Java
CMD ["java", "Collection.J02009"]

