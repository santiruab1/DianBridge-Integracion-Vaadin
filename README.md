# Antlers Renderer

Antlers Renderer is a web application designed to facilitate the integration of electronic invoicing with the DIAN (Dirección de Impuestos y Aduanas Nacionales) in Colombia. This application provides a user-friendly interface for managing invoices, accessing reports, and ensuring compliance with tax regulations.

## Features

- **User Authentication**: Secure login for users to access their accounts.
- **Pricing Plans**: Various membership options tailored to different business needs.
- **Dashboard Interface**: A comprehensive dashboard for managing invoices and accessing reports.
- **About Us Section**: Information about the company's mission, vision, and values.
- **Responsive Design**: Optimized for both desktop and mobile devices.

## Project Structure

```
antlers-renderer
├── src
│   ├── main
│   │   ├── frontend
│   │   │   ├── assets
│   │   │   │   ├── css
│   │   │   │   │   └── style.css
│   │   │   │   └── images
│   │   │   │       ├── carrousel1.jpg
│   │   │   │       ├── carrousel2.jfif
│   │   │   │       ├── carrousel3.jfif
│   │   │   │       ├── carrousel4.jfif
│   │   │   │       ├── carrousel5.jfif
│   │   │   │       └── LogoBlancoSombra.png
│   │   │   ├── index.html
│   │   │   ├── aboutus.html
│   │   │   ├── pricing.html
│   │   │   ├── inicioSesion.html
│   │   │   ├── interfazUsuario.html
│   │   │   └── js
│   │   │       └── validations.js
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── antlersrenderer
│   │   │               ├── Application.java
│   │   │               └── views
│   │   │                   ├── AboutUsView.java
│   │   │                   ├── IndexView.java
│   │   │                   ├── InterfazUsuarioView.java
│   │   │                   ├── InicioSesionView.java
│   │   │                   └── PricingView.java
│   │   └── resources
│   │       └── application.properties
├── .gitignore
├── .prettierrc.json
├── LICENSE.md
├── mvnw
├── mvnw.cmd
├── package.json
├── pom.xml
├── README.md
├── tsconfig.json
└── types.d.ts
```

## Getting Started

1. **Clone the Repository**: 
   ```
   git clone <repository-url>
   ```

2. **Navigate to the Project Directory**: 
   ```
   cd antlers-renderer
   ```

3. **Build the Project**: 
   ```
   ./mvnw clean install
   ```

4. **Run the Application**: 
   ```
   ./mvnw spring-boot:run
   ```

5. **Access the Application**: Open your web browser and go to `http://localhost:8081`.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any suggestions or improvements.

## License

This project is licensed under the MIT License. See the [LICENSE.md](LICENSE.md) file for details.