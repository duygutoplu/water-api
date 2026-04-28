# 💧 Water Tracker API

A simple backend API built with **Spring Boot** to track daily water intake.

## 🚀 Features

* Add water intake
* Delete water records
* View all water records
* Calculate total water intake
* Set daily water goal
* Track progress percentage

## 🛠️ Tech Stack

* Java
* Spring Boot
* Maven

## 📡 API Endpoints

### Get all water records

GET /water

### Add water intake

POST /water

Body:
{
"amount": 250,
"date": "2026-04-28"
}

### Delete water record

DELETE /water/{id}

### Get total water intake

GET /water/total

### Set daily goal

POST /goal?goal=2000

### Get progress

GET /water/progress

## ▶️ Run the project

```bash
./mvnw spring-boot:run
```

Server runs on:
http://localhost:8080

## ✨ Author

Duygu Toplu
