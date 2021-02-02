FROM jenkins/jenkins:2.271-jdk11

COPY ./creds/secret.key ./creds/credentials.xml ./identity.key.enc /var/jenkins_home
COPY ./creds/users /var/jenkins_home/users
COPY ./creds/secret /var/jenkins_home/secret


COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

