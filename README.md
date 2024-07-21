This Java web application demonstrates the fundamental concepts of servlets by creating a simple user information form. The application showcases how to build and handle HTTP requests and responses using the HttpServlet class. The main features of this example include:

## Form Creation:

A simple HTML form is created that collects user information, including name and email address. The form uses the POST method to securely send data to the server.

## Servlet Handling:

The application contains a servlet class that extends HttpServlet. This servlet is responsible for processing the form data sent by the user.
The servlet overrides the doPost method to handle POST requests, retrieve form data, and generate a response to be displayed in the user's browser.

## Data Retrieval and Display:

When the form is submitted, the servlet retrieves the user's name and email from the request object.
The servlet then constructs an HTML response that displays the received user information back to the browser.
