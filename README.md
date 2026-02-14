# Hello Maven CI

[![Java CI with Maven](https://github.com/MBroholm/hello-maven-ci/actions/workflows/ci.yml/badge.svg)](https://github.com/MBroholm/hello-maven-ci/actions/workflows/ci.yml)

A simple Java project demonstrating CI/CD with Maven and GitHub Actions.

## Features

- Maven build with JUnit tests
- Automatic builds on every push
- Docker image automatically built and pushed to GitHub Container Registry

## Run Locally

```bash
docker run --rm ghcr.io/mbroholm/hello-maven:latest
```

## Build Locally
```
docker run --rm -v "$(pwd)":/app -w /app maven:3.9-eclipse-temurin-17 mvn clean package
```
