FROM jenkins/jenkins:2.271-jdk11

COPY ./creds/config.xml /var/jenkins_home/
#COPY ./creds/secret.key ./creds/credentials.xml /var/jenkins_home/
# RUN rm /var/jenkins_home/identity.key.enc
# COPY ./creds/users /var/jenkins_home/users
#COPY ./creds/secrets /var/jenkins_home/secrets


COPY ./creds/plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY ./creds/seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

