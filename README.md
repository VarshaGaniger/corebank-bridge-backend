# CoreBank Bridge – Backend
This project is a Spring Boot backend application that exposes REST APIs by integrating with legacy COBOL programs.

## Overview
- Legacy COBOL programs generate business data as JSON files.
- Spring Boot reads these output files.
- REST APIs expose the data to modern frontend applications.

## Technologies Used
- Java
- Spring Boot
- REST APIs
- Jackson (JSON parsing)

## Available APIs
- GET /balance – Fetch account balance
- GET /loan – Fetch loan details
- GET /transactions – Fetch transaction history

## API Endpoints (Demo)
- http://localhost:8080/balance
- http://localhost:8080/loan
- http://localhost:8080/transactions


## Architecture
COBOL Programs → JSON Output Files → Spring Boot REST APIs → Frontend UI

## Note
COBOL programs are executed externally and their outputs are consumed by this application.
This project focuses on integration, not rewriting legacy code.
