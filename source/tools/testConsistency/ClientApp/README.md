# The Web Interface
The web interface is the client app written in node js. This app allows the user to enter the card data and card template and see a picture of their card rendered on .NET WPF, Javascript and Android along with any errors/warnings.
## Start The Application
- Ensure that you have built the Visual Studio Project in the dotnetWPF-renderer folder.
- Ensure that you have started the android app on the android emulator. 
- Then open a terminal and type the command `telnet localhost 5554`. Once authorized, enter `redir add tcp:8080` This allows the REST end point within the android emulator app to be accessible  via a browser.
- Then you can start the project using the bat file provided. This will start the client app on port 8000 and the three REST API on ports 5000, 4000 and 7000 respectively. These ports can easily be changed. Edit the bat file as follows: 
- to configure the port for the web interface change the line that says `node server.js` to  `node server.js -p PORT ` where PORT is your chosen port number.
- to configure the REST API/Flask Apps, change the line that says `flask run` to `flask run -p PORT` where PORT is your chosen port number.
 