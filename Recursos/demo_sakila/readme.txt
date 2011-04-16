Hi!

This is the readme for materials provided for the MySQL University Session "Starring Sakila", 
which was held tuesday, july 2 2009 by Roland Bouman. You can find a page on MySQL forge for 
this session:

http://forge.mysql.com/wiki/Starring_Sakila_-_A_Data_Warehouse_Mini-Tutorial

In this zip
-----------
The following materials are included. These are all Copyright, Roland Bouman 2009.

PATH                        FILE                                 Description 
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
                            Starring Sakila MySQL University 2009.pdf Presentation Slides

pentaho-solutions/sakila/   index.xml                            index file. required to see the sakila solution in the pentaho server user console
pentaho-solutions/sakila/   sakila.mondrian.xml                  Mondrian ROLAP schema file. required to browse the rental cube with the pentaho analysis view.
pentaho-solutions/sakila/   Sakila Rentals.analysisview.xaction  Pentaho action sequence. Allows you to browse the Sakila Rentals cube in the pentaho user console.
    
pdi                         load_rentals.kjb                     Job to load the sakila_dwh datawarehouse
pdi                         load_dim_store.ktr                   Load the dim_store dimension table
pdi                         load_dim_staff.ktr                   Load the dim_staff dimension table
pdi                         load_dim_customer.ktr                Load the dim_customer dimension table
pdi                         load_dim_film.ktr                    Load the dim_film dimension table
pdi                         load_rentals.ktr                     Load the fact_rental fact table
pdi                         fetch_address.ktr                    Lookup address data. Subtransformation in load_dim_store and load_dim_customer
pdi                         load_xml.ktr                         Bonus tranformation to load new films from a XML resource hosted on the internet.
pdi                         LOCALIZED_DATE_DIMENSION.ktr         Load a date dimension

sql                         sakila_dwh.sql                       SQL script for the sakila rental star schema

Copyright and License
---------------------
Aforementioned materials are provided for your personal use. You may use them and modify them for
your personal understanding.  Please don't distribute copies of these materials yourself. 
If you want to share these materials, please refer to the page on MySQL Forge.

You may not use these materials to conduct presentations or courses yourself without explicit 
permission from Roland Bouman. Please email Roland at Roland.Bouman@gmail.com if you need permission.

Using these materials - prerequisites
-------------------------------------
you already installed a MySQL database server.
you already installed sun jdk 1.6

Using these materials - Database
--------------------------------
Use any tool you like to run scripts and execute SQL statements specified below:

1) Set up a data base for sakila. Download it here http://downloads.mysql.com/docs/sakila-db.tar.gz or here: http://downloads.mysql.com/docs/sakila-db.zip
2) Set up the sakila data warehouse. The SQL script is sql/sakila_dwh.sql
3) create the user sakila, password sakila. do GRANT ALL PRIVILEGES ON sakila.* to sakila
4) create the user sakila_dwh, password sakila_dwh. do GRANT ALL PRIVILEGES ON sakila_dwh.* to sakila_dwh

Using the materials - Loading the datawarehouse:
------------------------------------------------
Download Pentaho data integration from sourceforge.net/projects/pentaho (pdi-ce-3.2.0-stable, either a tar.gz or a .zip).
Extract the archive and run spoon.bat or spoon.sh
Open pdi/load_rentals.kjb for loading the datawarehouse. You can open to component transformations from here
Open pdi/LOCALIZED_DATE_DIMENSIN.ktr to load the date dimension
Open load_xml.ktr to see a example of loading XML into the database.

Using the materials - Browsing the sakila rentals cube.
-------------------------------------------------------
Download the Pentaho BI Server from sourceforge.net/projects/pentaho (biserver-ce-3.0.0-STABLE - either .tar.gz or .zip).
Extract. 
Start the server by running start-pentaho.bat or start-pentaho.sh. These are in the biserver-ce dir.
In the administration-console dir, run startup.bat or start.sh to start the administrative console.

Point your browser to http://localhost:8099. Log in with user: admin; password: password
Read at http://wiki.pentaho.com/display/ServerDoc2x/.04+Configuring+Data+Sources how to add a new data source, and add one for sakila_dwh

Point your browser to http://localhost:8080/. You should see the pentaho home page. 
Login and use the drop down list to select the "Joe" user. You are now in the pentaho user console (mantle)

For browsing the cube, drop the pentaho-solutions dir in this archive unto the pentaho-solutions dir of your pentaho server.
Then, in the pentaho user console, choose menu: Tools > Refresh > Content Repository
In the tree on the left, find the sakila folder. click it. In the pane below the tree, find the sakila analysis view. doublclick to open.

Editing the sakila cube:
------------------------
Download schema workbench (psw-ce-3.1.1.12687 either .zip or .tar.gz) from http://sourceforge.net/projects/mondrian/
Extract. 
Drop the MySQl JDBC driver into the schema-workbench\drivers directory
Enter the connection data for sakila dwh by doing menu > tools > preferences
Open the sakila.mondrian.xml to see how th cube was defined.


More resources
--------------
Roland's Blog:                      http://rpbouman.blogspot.com/
Pentaho Downloads                   http://sourceforge.net/projects/pentaho
Pentaho documentation               http://wiki.pentaho.com/display/COM/Community+Wiki+Home
Upcoming "Pentaho Solutions" Book:  http://www.wiley.com/WileyCDA/WileyTitle/productCd-0470484322.html
Pre-order "Pentaho Solutions":      http://www.amazon.com/Pentaho-Solutions-Business-Intelligence-Warehousing/dp/0470484322