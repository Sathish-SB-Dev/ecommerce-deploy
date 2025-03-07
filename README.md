# 🛒 E-commerce Website  

This is a **fully functional E-commerce website** built using **Spring Boot, Thymeleaf, and Hibernate/JPA**. It provides a seamless shopping experience, allowing users to browse products, add them to their cart, and place orders.  

## 🚀 Features  

### 🔹 User Features  
- 🔐 **Authentication & Authorization** (Login/Register)  
- 🛍️ **Browse Products** (Categories, Search, Filters)  
- 🛒 **Shopping Cart** (Add/Remove Products)  
- 💳 **Checkout & Order Management**  
- 📜 **Order History & Invoice Generation**  

### 🔹 Admin Features  
- 📦 **Product Management** (CRUD Operations)  
- 🛒 **Order Management** (View & Process Orders)  
- 👥 **User Management** (Admin & Customer Roles)  

## 🛠️ Tech Stack  

- **Backend:** Spring Boot, Spring Security, Hibernate/JPA, MySQL  
- **Frontend:** Thymeleaf, Bootstrap  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **Deployment:** Tomcat  

## 📂 Project Structure  

```
Ecommerce/
│── src/
│   ├── main/
│   │   ├── java/com/example/ecommerce/   # Backend Code
│   │   ├── resources/templates/          # Thymeleaf Templates
│   │   ├── resources/static/             # CSS, JS, Images
│   ├── test/                              # Unit Tests
│── pom.xml                                # Maven Dependencies
│── README.md                              # Project Documentation
│── application.properties                 # Database Configurations
```

## 🏗️ Installation & Setup  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/yourusername/Ecommerce.git
cd Ecommerce
```

### 2️⃣ Configure the Database  
- Open `application.properties` and update MySQL credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=yourpassword
```
- Run the following MySQL command to create the database:
```sql
CREATE DATABASE ecommerce;
```

### 3️⃣ Build & Run the Application  
```bash
mvn clean install
mvn spring-boot:run
```
- Open `http://localhost:8080` in your browser.

## 📜 License  
This project is **open-source** and available under the **MIT License**.

---
Let me know if you'd like any modifications! 🚀
