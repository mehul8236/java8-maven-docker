# Base java 8
FROM java:8

# Install maven
RUN apt-get update \
 && DEBIAN_FRONTEND=noninteractive \
    apt-get install -y maven \
 && apt-get clean \
 && rm -rf /var/lib/apt/lists/*

# Set the working directory to
WORKDIR /usr/src

# Copy the current directory contents into the container at /app
ADD . /usr/src

# Make port 80 available to the world outside this container
EXPOSE 80

CMD ["mvn", "spring-boot:run"]