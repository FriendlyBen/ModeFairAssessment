<h1>
  This is an assessment for the Software Developer role at ModeFair.
</h1>

<p>
  The objective of this test is to clone an online store.
</p>

<h2>
  Tools and tech stack
</h2>
  <h3>
    Backend
  </h3>
  <ul>
  <li>Java Spring Boot Framework</li>
  <li>JPA, Hibernate</li>
  <li>Database (MySQL)</li>    
  </ul>
  <h3>
    Frontend
  </h3>
  <ul>
    <li>Angular Framework</li>
    <li>HTML</li>
    <li>CSS</li>
    <li>TypeScript</li>
  </ul>
<h2>Instructions</h2>
<h3>clone project:<br> <br> "git clone -b master https://github.com/FriendlyBen/ModeFairAssessment.git"</h3>
<br><br>
<h2>For optimal UI/UX : Run the Frontend and Backend project separately </h2>
<ol>
  <li>
    Clone the repository to your local machine.
  </li>
    <li>
    Run the Java program (ManageProductApplication.java). Make sure the <b>localhost:8080</b> is open.
  </li>
  <li>
    Once localhost:8080 is ready, open the Frontend project (ModeFairAssessmentFrontEnd.zip) and run command <b>"ng s --open"</b>
  </li>
  <li>
    Once the Frontend is up and running, you can head over to <b>localhost:4200</b> to check out the cloned website.
  </li>
</ol>
<h3>Running the Frontend and Backend together (may affect the UI of cloned website): </h3>
<ol>
  <li>Fork and clone the respository to your local machine</li>
  <li>Ensure that your environment has ast least Java 17, Angular v 20.9, TypeScript 5.9</li>
  <li>Open the project in your preffered IDE and run the Java program (ManageProductApplication.java)</li>
  <li>Once the program is up and running, you can head over to localhost:8080 to check out the Frontend</li>
</ol>
<h2>Summary</h2>
<p>The test is to clone the Apple Online Store, specifically the Macbook Pro pages. To do so, I came up with a SQL Schema designed to store data about the products (such as Variations, Price, Colors etc.). 
  Then, with the Java Backend developed, I populate data into my MySQL database by calling the REST endpoints via Postman.</p>
  <p>
    As for the Angular front end, it calls the endpoint built in the Java backend to retrieve data about the products to display.
  </p>

  <h2>Here is the SQL Schema for reference</h2>
  ![ModeFairSQLSchema](https://github.com/FriendlyBen/ModeFairAssessment/assets/85188639/1eadf1eb-2e89-4cfb-b716-02a85bdf645c)

<h2>Here is a short snippet of my project</h2>
https://github.com/FriendlyBen/ModeFairAssessment/assets/85188639/4e4440ff-60cc-43a5-827a-9d36c6721700

