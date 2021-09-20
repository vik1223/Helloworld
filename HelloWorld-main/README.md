This is an Hello World! application with an simple success test case. This repo also contains a docker file which is required to build docker image and push it to docker hub.

Build and Test the project using gradle command: gradlew clean build

Start the project using gradle command: gradlew bootRun

Create docker image: docker build -t localhost/helloworld .

Run the container: docker run -p 8080:8080 localhost/helloworld

Docker image creation and running container automation steps are configured in the Jenkinsfile.
