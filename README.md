# Old Age Home Management System - Setup Guide

This guide provides step-by-step instructions to set up the **Old Age Home Management System** on your local machine.

---

## Prerequisites

- **Java Version**: 17
- **Spring Boot Version**: 3.4.2
- **MySQL**: Installed and configured

---

## Installation Steps

### Step 1: Install MySQL
1. **Install MySQL for Windows**:
   - Download and install MySQL from the official website: [https://dev.mysql.com/downloads/installer/](https://dev.mysql.com/downloads/installer/).
   - Follow the installation wizard to complete the setup.

2. **Create a Database**:
   - Open MySQL and create a database named `compiler`:
     ```sql
     CREATE DATABASE compiler;
     ```

3. **Installation Video**:
   - For a visual guide, refer to this video: [MySQL Installation Video](#).

---

### Step 2: Install Java
1. **Download and Install Java 17**:
   - Download Java Development Kit (JDK) 17 from the official website: [https://www.oracle.com/java/technologies/javase-jdk17-downloads.html](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
   - Follow the installation instructions.

2. **Verify Installation**:
   - Open a Command Prompt (cmd) or terminal.
   - Run the following command to verify the installation:
     ```bash
     java -version
     ```
   - **Expected Output**:
     ```
     java version "17.x.x"
     ```

3. **Installation Video**:
   - For a visual guide, refer to this video: [Java Installation Video](#).

---

### Step 3: Install Eclipse
1. **Download and Install Eclipse**:
   - Download Eclipse IDE from the official website: [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/).
   - Follow the installation instructions.

2. **Install Spring Boot for Eclipse**:
   - Open Eclipse and install the Spring Boot plugin:
     - Go to `Help → Eclipse Marketplace`.
     - Search for "Spring Tools" and install the plugin.

3. **Installation Video**:
   - For a visual guide, refer to this video: [Eclipse Installation Video](#).

---

### Step 4: Set Up the Project
1. **Clone the Repository**:
   - Create a folder named `watchIt` on your laptop (recommended).
   - Clone the repository into this folder:
     ```bash
     git clone <repository-url>
     ```
   - Replace `<repository-url>` with the actual URL of your Git repository.

2. **Open the Project in Eclipse**:
   - Open Eclipse and switch the workspace to the folder where you cloned the repository.
   - Go to `File → Import → Maven → Existing Maven Projects`.
   - Select the `pom.xml` file from the cloned repository and wait for the project to load.

3. **Configure MySQL**:
   - Open the `application.properties` file located in `src/main/resources`.
   - Replace the MySQL `username` and `password` with your own credentials.

---

### Step 5: Run the Application
1. **Run the Spring Boot Application**:
   - Right-click on the project in Eclipse.
   - Select `Run As → Spring Boot App`.
   - The application will start running.

2. **Access the Application**:
   - Open your browser and navigate to the application URL (usually `http://localhost:8080`).

---

## Troubleshooting

- Ensure that MySQL is running and the `compiler` database is created.
- Verify that Java 17 and Spring Boot 3.4.2 are correctly installed.
- If you encounter issues with the database connection, double-check the `application.properties` file.

---

## Support

For further assistance, please contact the development team or refer to the project documentation.

---

Happy Coding! 🚀