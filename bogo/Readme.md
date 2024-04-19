# BOGO sale offer service

This service helps in getting offers for list of items price .

#Prerequisites for running this project.

* Java JDK 17 or above.
* Maven

Steps to run.

* Go to project root folder.
* Open a commandline terminal in the directory.
* run the command "mvn clean install"  and "mvn spring-boot:run", after running these twp commands successfully.

* Now we should be able to call the service using any rest client,below is the curl command .

"curl --location --request GET 'http://localhost:9090/bogo/api/v1/offers' \
--header 'Content-Type: application/json' \
--data '{

    "productPriceList":[10,20,30,40,50,50,60]
}'"

* Copypaste the above command and invoke service. 
